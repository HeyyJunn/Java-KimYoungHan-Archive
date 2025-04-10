package dscollection.link;

public class Main {
    public static void main(String[] args) {
        SList<String> list = new SList<>();

        System.out.println("<< 자료구조(6064) 과제 3 ( 김민준 60241996 ) >>");
        System.out.println("----------------------------------------\n");

        // 1
        System.out.println("1> insertFront()으로 orange/peach/banana & addLast()로 apple/mango/grape 추가 후");
        list.insertFront("orange");
        list.insertFront("peach");
        list.insertFront("banana");
        list.addLast("apple");
        list.addLast("mango");
        list.addLast("grape");
        System.out.println(list + "\n");

        // 2
        int indexMango = list.search("mango");
        System.out.println("2> search(\"mango\") = " + indexMango);

        // 3
        list.insertAfter("blueberry", list.getNode(indexMango));
        System.out.println("3> mango 뒤에 blueberry 삽입 - getNode()와 insertAfter()이용");
        System.out.println(list + "\n");

        // 4
        int indexOrange = list.search("orange");
        System.out.println("4> search(\"orange\") = " + indexOrange);

        // 5
        list.add("strawberry", indexOrange);
        System.out.println("5> orange 노드 위치에 strawberry 삽입 - add() 이용");
        System.out.println(list + "\n");

        // 6
        int indexApple = list.search("apple");
        System.out.println("6> search(\"apple\") = " + indexApple);

        // 7
        list.deleteAfter(list.getNode(indexApple));
        System.out.println("7> apple 뒤의 노드를 삭제 - getNode()와 deleteAfter() 이용");
        System.out.println(list + "\n");

        // 9
        list.deleteItem("peach");
        System.out.println("9> peach 항목 삭제 - deleteItem() 이용");
        System.out.println(list + "\n");

        // 10
        list.delete(3);
        System.out.println("10> index 3 항목 삭제 - delete() 이용");
        System.out.println(list + "\n");

        // 11
        list.deleteFront();
        list.deleteFront();
        list.deleteFront();
        System.out.println("11> 맨 앞의 원소 3개 제거 - deleteFront() 이용");
        System.out.println(list);
    }
}