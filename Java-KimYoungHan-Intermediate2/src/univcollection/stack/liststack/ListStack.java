package univcollection.stack.liststack;

import java.util.EmptyStackException;

public class ListStack<E> {
    private Node<E> top;  // 스택 top 노드
    private int size;     // 스택 항목 수

    public ListStack() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return top.getItem();
    }

    public void push(E newItem) {
        Node<E> newNode = new Node<>(newItem, top);
        top = newNode;
        size++;
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E topItem = top.getItem();
        top = top.getNext();
        size--;
        return topItem;
    }

    public void print() {
        System.out.print("스택 항목: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}