package static2;
public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);
        // 객체 생성 없이 클래스명 + dot + 메서드 명으로 바로 호출 가능

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}