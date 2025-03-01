package static1;

public class Data {
    public String name;
    public static int count; //static

    public Data(String name) {
        this.name = name;
        count++;
    }
}

// 거의 아는 내용이라 cs 위주로만 학습하고 skip