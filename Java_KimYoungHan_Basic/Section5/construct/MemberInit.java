package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // this: 인스턴스 자신
    // 매개변수의 이름과 멤버 변수의 이름이 같은 경우
    // this 를 사용해서 둘을 명확하게 구분해야 한다.
    public MemberInit() {
        int age = 0;
    } // 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.
    public MemberInit(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
