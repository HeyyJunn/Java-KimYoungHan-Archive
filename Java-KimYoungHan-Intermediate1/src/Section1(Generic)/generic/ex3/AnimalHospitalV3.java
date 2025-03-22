package generic.ex3;
import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
        animal.sound();
    }
    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
