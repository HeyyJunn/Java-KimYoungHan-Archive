package casting;

public class Casting {
    public static void main(String[] args) {
        // Nothing much was learned.
        
        // 자동형변환, 묵시적 형변환
        int i = 100;
        long l = i;  // int에서 long으로 자동 형변환
        float f = l; // long에서 float으로 자동 형변환

        // 명시적 형변환
        double d = 100.04;
        long k = (long) d;  // double에서 long으로 명시적 형변환
        int j = (int) k;    // long에서 int로 명시적 형변환

    }
}
