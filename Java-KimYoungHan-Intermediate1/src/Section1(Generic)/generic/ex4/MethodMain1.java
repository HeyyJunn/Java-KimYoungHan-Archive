package generic.ex4;
public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;

        // 1. Object 방식
        Object object = GenericMethod.objMethod(i);

        // 2. 제네릭 방식
        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);

        // 3. 제네릭 + 제한 방식 (Number 계열만 허용)
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
    }
}