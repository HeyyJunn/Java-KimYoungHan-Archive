package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    static <T>  void printGenericV1(Box<T> box> {
        System.out.println("T = " + box.get());
    }
    static void printWildCardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }
}
