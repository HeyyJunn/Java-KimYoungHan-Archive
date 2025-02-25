package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        Student student1 = new Student();

        /*
            설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스 라 한다.
            클래스 정보를 기반으로 새로운 객체를 생성하라.
            객체 생성 시 자바는 객체에 접근할 수 있는 참조값을 반환
            예시) student1 = x001;

            인스턴스는 특정 클래스로부터 생성된 객체를 의미.
         */
        student1.name = "학생1";
        student1.age = 20;
        student1.grade = 100;

        System.out.println("이름: " + student1.name);
        System.out.println("나이: " + student1.age);
        System.out.println("성적: " + student1.grade);
    }
}
