package chapter24;

//code.oa.gg/java8/947
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.[정답]

class static을_사용하요_코드가_작동하도록_해주세요 {
    public static void main(String[] args) {
        // 오직 객체만으로 해결하면 번거롭다.
        System.out.println(수학.PI);

        System.out.println(수학.더하기(10, 20));
        // 출력 : 30
    }
}

class 수학 {
    // static 을 붙이면 해당 변수는 설계도에만 존재하게 됩니다.
    static double PI = 3.141592;

    // 클래스는 객체의 프로토타입이다.
    // 클래스는 객체의 원형이다.
    // 클래스는 객체를 생성한다.
    // 클래스는 붕어빵 틀이다.
    // 객체는 붕어빵 틀로부터 나온 붕어빵이다.
    // 클래스를 본사라고 하겠습니다.
    // 객체를 대리점이라고 하겠습니다.

    // static 은 본사직원을 의미합니다.
    static int 더하기(int a, int b) {
        int c = a + b;

        return c;
    }
}