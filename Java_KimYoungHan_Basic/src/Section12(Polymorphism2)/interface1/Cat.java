package interface1;

public class Cat implements InterfaceAnimal {
    // implements : 구현
    @Override
    public void sound() {
        System.out.println("Dog sound");
    }
    @Override
    public void move() {
        System.out.println("Dog move");
    }
}
