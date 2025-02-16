package loop;
    // break, continue 반복문에서 사용할 수 있는 키워드
public class DoWhile {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}
