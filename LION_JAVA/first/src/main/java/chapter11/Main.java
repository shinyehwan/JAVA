package chapter11;
// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        a사람.나이 = 20;
        a사람.a왼팔 = new 팔();
        a사람.a왼팔.길이 = 180;
    }
}

class 사람 {
    // 클래스안에 변수를 정의 할 수 있다.
    int 나이;
    팔 a왼팔;
}

class 팔 {
    int 길이;
}