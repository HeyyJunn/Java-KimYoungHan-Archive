package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) { // instance 가 Child 로부터 생성된 것이라면,
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}

/*
    parent1 호출
    Parent.parentMethod
    parent2 호출
    Parent.parentMethod
    Child 인스턴스 맞음
    Child.childMethod
 */