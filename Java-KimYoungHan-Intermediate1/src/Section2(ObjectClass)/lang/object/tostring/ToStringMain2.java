package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Car1");
        Dog dog1 = new Dog("Dog1", 5);
        Dog dog2 = new Dog("Dog2", 10);

        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String refValue1 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(refValue1);
        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println(refValue2);
    }
}
