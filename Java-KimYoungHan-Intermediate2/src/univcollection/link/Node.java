// 자료구조(6064) 과제 3 ( 김민준 60241996 )
package univcollection.link;

public class Node <E extends Comparable<E>> {
    private E item;
    private Node<E> next;

    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }
    public E getItem() {
        return item;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setItem(E item) {
        this.item = item;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }
}
