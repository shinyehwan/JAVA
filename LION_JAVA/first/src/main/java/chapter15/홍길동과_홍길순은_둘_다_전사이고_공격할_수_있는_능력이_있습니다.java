package chapter15;

// 문제 : 아래가 실행되도록 해주세요.

class 홍길동과_홍길순은_둘_다_전사이고_공격할_수_있는_능력이_있습니다 {
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();

        a전사.공격();
        // 출력 => 홍길동이(가) 공격합니다.

        a전사 = new 홍길순();

        a전사.공격();
        // 출력 => 홍길순이(가) 공격합니다.
    }
}

abstract class 전사 {
    String 이름;

    void 공격() {
        System.out.println(this.이름 + "이(가) 공격합니다.");
    }
}

class 홍길동 extends 전사 {
    홍길동() {
        this.이름 = "홍길동";
    }
}

class 홍길순 extends 전사 {
    홍길순() {
        this.이름 = "홍길동";
    }
}