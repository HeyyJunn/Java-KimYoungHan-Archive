package poly.ex3;

import poly.ex2.Animal;

public class HelloAnimal extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("Hello World");
    }
    @Override
    public void move() {
        System.out.println("Hello World");
    }

}

/*
**상속하는 클래스는 모든 메서드를 구현해야 한다.**
"상속시 자식은 모든 메서드를 오버라이딩 해야 한다."라는 특징은 상속 받는 클래스 입장에서 보면 부모의 모든 메서드
를 구현해야 하는 것이다.
*/