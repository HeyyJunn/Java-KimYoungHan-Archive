package super1;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); // 생성자 하나도 없으면 기본 생성자가 자동 생성
        // 생성자를 하나롣 정의해버리면 기본 생성자는 자바에서 만들지 않음
        // 기본 생성자인 경우에만 super 생략 가능
        // 매개변수가 있는 생성자인 경우엔 명시
        System.out.println("ClassC constructor");
    }
}
