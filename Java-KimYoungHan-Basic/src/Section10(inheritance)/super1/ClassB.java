package super1;

public class ClassB extends ClassA {
    public ClassB(int a) {
        super(); // 매개변수가 없는 기본 생성자는 생략이 가능하다
        System.out.println("ClassB a Constructor");
    }
    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB a,b Constructor");
    }
}
