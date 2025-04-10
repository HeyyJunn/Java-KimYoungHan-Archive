package dscollection.stack.liststack;

public class Main {
    public static void main(String[] args) {
        ListStack<String> list = new ListStack<>();

        list.push("apple");
        list.push("orange");
        list.push("cherry");
        list.print();

        System.out.println(list.peek());
        list.push("pear");
        list.print();

        list.pop();
        list.print();

        System.out.println(list.peek());
        list.push("grape");
        list.print();
    }
}