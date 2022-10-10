package chapter17;
// 주의 : 어려운 문제 입니다.
// 문제 : `사용자 + " : ` 부분에 대한 중복을 제거해주세요.

class 사용자_중복제거V2 {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}

abstract class 오리 {
    String 종류;
    비행아이템 a비행아이템;

    void 날다() {
        a비행아이템.작동(종류);
    }
}

abstract class 비행아이템 {
    abstract void 작동(String 사용자);
    String getHeader(String 사용자) {
        return 사용자 + " : ";
    }

}

class 날개로나는비행아이템 extends 비행아이템 {
    void 작동(String 사용자) {
        System.out.println(getHeader(사용자) + "날개로 날아갑니다.");
    }
}

class 못나는비행아이템 extends 비행아이템 {
    void 작동(String 사용자) {
        System.out.println(getHeader(사용자) + "저는 날 수 없어요. ㅜㅠ");
    }
}

// 오리 => 부모 클래스
// 흰오리 => 자식 클래스
// 흰오리 extends 오리 => 흰오리가 오리의 능력을 물려 받는다.
// "`흰오리`는 `오리`이다." 라고 자바에게 알려준다.
// `A 는 B 이다.` 테스트에 통과하는 것만 상속이 가능하다.
// 클래스와 객체는 명사이다.
// 메서드는 동사이다.
class 흰오리 extends 오리 {
    흰오리() {
        종류 = "흰오리";
        a비행아이템 = new 날개로나는비행아이템();
    }
}

class 청둥오리 extends 오리 {
    청둥오리() {
        종류 = "청둥오리";
        a비행아이템 = new 날개로나는비행아이템();
    }
}

class 고무오리 extends 오리 {
    고무오리() {
        종류 = "고무오리";
        a비행아이템 = new 못나는비행아이템();
    }
}

class 고무2오리 extends 오리 {
    고무2오리() {
        종류 = "고무2오리";
        a비행아이템 = new 못나는비행아이템();
    }
}