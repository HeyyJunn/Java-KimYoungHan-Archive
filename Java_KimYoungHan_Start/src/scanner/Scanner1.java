package scanner;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); // 입력을 string 으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("Enter a number: ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        // if (str.equals("exit"))
    }
}
