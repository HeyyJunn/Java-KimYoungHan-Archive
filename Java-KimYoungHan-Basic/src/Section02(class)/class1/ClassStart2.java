package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        /*
            자바에서 객체 배열(Student[] students)을 선언하면,
            배열 자체만 생성되고, 배열 안의 객체들은 null 상태이기 때문에
            각 요소를 new로 초기화해야 합니다.
         */
        students[0] = new Student();
        students[1] = new Student();


    }
}
