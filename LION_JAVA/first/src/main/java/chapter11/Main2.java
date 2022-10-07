package chapter11;


// 문제 : 아래가 실행되도록 해주세요.

class Main2 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.나이 = 20;
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();
    }
}

class 전사 {
    int 나이;
    무기 a무기;
}

class 무기 {

}

class 칼 extends 무기 {

}

class 활 extends 무기 {

}
