package final2;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //final 변경 불가 컴파일 오류

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
        //  `final` 이 붙으면 참조 대상을 자체를 다른 대상으로 변경하지 못하는 것이지, 참조하는 대상
        //의 값은 변경할 수 있다.

    }
}
