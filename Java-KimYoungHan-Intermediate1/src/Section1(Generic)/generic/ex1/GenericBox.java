package generic.ex1;

// generic class
// <> diamond

// T 타입 매개변수
public class GenericBox<T> {
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}
