package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }
    private static void action(Object obj) {
        // obj.sound();
        // object 는 모든 타입의 부모
        // object type 은 부모 타입이기 때문에 컴파일 오류가 발생

        // Object 를 통해 전달 받은 객체를 호출하려면
        // 각 객체에 맞는 다우캐스팅 과정 필요
        if (obj instanceof Dog dog) { // 자동으로 다운캐스팅
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
