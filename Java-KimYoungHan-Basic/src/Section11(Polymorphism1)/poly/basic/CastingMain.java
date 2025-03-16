package poly.basic;

public class CastingMain {
    public static void main(String[] args) {
        Parent poly = new Child();
        // 단, 자식의 기능은 호출할 수 없다.
        // poly.childMethod();

        Child child = (Child) poly;
        child.childMethod();
        child.parentMethod();

        poly.parentMethod();

    }
}
