package generic.ex4;

public class GenericMethod {
    // 1. 그냥 Object로 받는 일반 메서드
    public static Object objMethod (Object obj) {
        System.out.println("object print: " + obj);
        return obj;
    }
    // 2. 제네릭 메서드 (타입 파라미터 T)
    public static <T> T genericMethod (T t) {
        System.out.println("generic print: " + t);
        return t;
    }
    // 3. 제네릭 + 타입 제한 (T는 Number 또는 그 하위 클래스만)
    public static <T extends Number> T numberMethod (T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
