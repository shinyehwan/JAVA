package chapter14;

// 문제 : 아래와 같이 출력되게 해주세요.

class 생성자를_사용해서_전사의_기본_이름을_No_Name으로_해주세요 {
    public static void main(String[] args) {
        전사 a전사0 = new 전사();
        a전사0.나이 = 20;
        a전사0.이름 = "칸";
        a전사0.성격 = "차가움";
        a전사0.a무기 = new 활();

        전사 a전사1 = new 전사();
        전사 a전사2 = new 전사();
        전사 a전사3 = new 전사();
        전사 a전사4 = new 전사();
        전사 a전사5 = new 전사();

        System.out.println(a전사0.이름);
        // 출력 : 칸
        System.out.println(a전사1.이름);
        // 출력 : No Name
        System.out.println(a전사2.이름);
        // 출력 : No Name
        System.out.println(a전사3.이름);
        // 출력 : No Name
        System.out.println(a전사4.이름);
        // 출력 : No Name
        System.out.println(a전사5.이름);
        // 출력 : No Name
    }
}

class 전사 {
    int 나이;
    String 이름;
    String 성격;
    무기 a무기;

    // `전사()` 는 생성자 메서드 이다.
    // 클래스 명과 같은 이름의 메서드를 생성자 메서드 라고 한다.
    // 생성자 메서드는 자동으로 호출됩니다.
    // 생성자 메서드는 new 할때(객체 생성할 때) 자동으로 호출됩니다.
    // 생성자 메서드는 다른 모든 메서드 보다 가장 먼저 딱 1번 실행됩니다.
    // 생성자 메서드는 리턴타입이 없습니다.
    // 당연하지만 생성자 메서드는 리턴값도 없습니다.
    전사() {
        // 수정가능지역 시작
        this.나이 = 20;
        this.이름 = "No Name";
        this.성격 = "온순함";
        this.a무기 = new 칼();
        // 수정가능지역 끝
    }
}

abstract class 무기 {

}

class 칼 extends 무기 {

}

class 활 extends 무기 {

}