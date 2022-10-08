package chapter15;

// 문제 : 아래가 실행되도록 해주세요.

class 홍길동과_홍길순은_둘_다_전사입니다 {
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();
        a전사 = new 홍길순();
    }
}

abstract class 전사 { }
class 홍길동 extends 전사 { }
class 홍길순 extends 전사 { }