package univcollection.stack.arraystack;
import java.util.EmptyStackException;

public class ArrayStack<E> {
    private E[] s;     // 스택을 위한 배열
    private int top;   // 스택의 top 항목의 배열 인덱스

    // 스택 생성자
    public ArrayStack() {
        s = (E[]) new Object[1];  // 초기 크기 1짜리 배열
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return s[top];
    }

    public void push(E newItem) {
        if (size() == s.length)
            resize(2 * s.length);  // 배열 크기 2배 확장
        s[++top] = newItem;
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E item = s[top];
        s[top--] = null;
        if (size() > 0 && size() == s.length / 4)
            resize(s.length / 2);  // 배열 크기 절반 축소
        return item;
    }

    private void resize(int newSize) {
        Object[] t = new Object[newSize];
        for (int i = 0; i < size(); i++) {
            t[i] = s[i];
        }
        s = (E[]) t;
    }

    public void print() {
        System.out.print("스택 항목: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}