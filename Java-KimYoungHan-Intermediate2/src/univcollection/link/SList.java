// 자료구조(6064) 과제 3 ( 김민준 60241996 )
package univcollection.link;

import java.util.NoSuchElementException;

// 제네릭 타입 E가 Comparable 인터페이스를 구현한 타입이어야 한다는 뜻
// Integer String 등등
// compareTo()
// 두 객체를 비교하는 메서드 (음수, 0, 양수)
public class SList <E extends Comparable<E>> {
    protected Node<E> head;
    private int size;

    public SList() {
        head = null;
        size = 0;
    }

    // target 을 찾을 때 까지 연결리스트들의 노드들을 첫 노드부터 차례로 탐색
    // index 반환
    public int search(E target) {
        Node<E> x = head;
        for (int k = 0; k < size; k++) {
            if (target.equals(x.getItem())) return k;
            x = x.getNext();
        }
        return -1;
    }
    // index 위치의 node 를 return
    public Node<E> getNode(int index) {
        // 예외처리
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> x = head;
        for (int i = 0; i < index; i++) {
            x = x.getNext();
        }
        return x;
    }
    // SList 의 index 위치에 newItem 을 가진 Node 를 삽입
    public void add(E newItem, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            insertFront(newItem);
        } else {
            insertAfter(newItem, getNode(index - 1));
        }
    }
    public void addLast(E newItem) {
        if (isEmpty()) {
            insertFront(newItem);
        } else{
            insertAfter(newItem, getNode(size - 1));
        }
    }

    // 새 노드를 리스트의 첫번째 노드가 되도록 연결
    public void insertFront(E newItem) {
        head = new Node<E>(newItem, head); // head 기존 head가 가리키던 노드 주소
        size++;
    }

    // x 가 가리키는 노드의 다음에 새 노드를 삽입
    public void insertAfter (E newItem, Node<E> x) {
        x.setNext(new Node<E>(newItem, x.getNext()));
        size++;
    }

    // 리스트가 empty 가 아닐 때, 리스트의 첫 노드를 삭제
    public void deleteFront() {
        if (isEmpty()) throw new NoSuchElementException();
        head = head.getNext();
        size--;
    }

    // x가 가르키는 노드의 다음 노드를 삭제
    public void deleteAfter (Node<E> x) {
        if (x == null || x.getNext() == null) throw new NoSuchElementException();

        Node<E> removeNode = x.getNext();
        x.setNext(removeNode.getNext());
        removeNode.setNext(null);
        size--;
    }

    // index 위치에 있는 노드를 삭제
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) { // 맨 앞 노드 삭제는 따로 처리
            deleteFront();
        } else {
            Node<E> prevNode = getNode(index - 1); // 삭제할 노드의 이전 노드
            deleteAfter(prevNode);                // 기존 함수 재사용!
        }
    }
    public void deleteItem(E item) {
        delete(search(item));
    }

    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("항목수(").append(size).append("): ");
        Node<E> x = head;
        while (x != null) {
            sb.append(x.getItem()).append(" ");
            x = x.getNext();
        }
        return sb.toString().trim(); // 마지막 공백 제거
    }

}
