package memory;

public class JavaMemoryMain {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }
    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }
    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value=" + data2.getValue());
        System.out.println("method2 end");
    }
}

/*
    main start
    method1 start
    method2 start
    data.value = 10
    method2 end
    method1 end
    main end

 */