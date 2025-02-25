package pack;

// import pack.a.User;
import pack.a.*;
// 특정 패키지에 포함된 모든 클래스를 포함해서 사용하고 싶으면 import 시점에 별을 사용한다


// import back.b.*;
// 같은 이름의 클래스가 있다면 `import` 는 둘중 하나만 선택할 수 있다.
// 이때는 자주 사용하는 클래스를 `import` 하고
// 나머지를 패키지를 포함한 전체 경로를 적어주면 된다.

public class PackageMain {
    public static void main(String[] args) {
        Data data = new Data();
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        // 자주 사용하는 애를 import
    }
}
