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

/**
 *         사람 a사람 = new 사람();
 *         a사람.번호 = 1;
 *         a사람.나이 = 20;
 *         a사람.이름 = "홍길동";
 *         a사람.기혼여부 = false;
 *         a사람.a왼팔 = new 팔();
 *
 *         class 사람{
 *             int 번호;
 *             int 나이;
 *             String 이름;
 *             boolean 기혼여부;
 *             팔 a왼팔;
 *         }
 *
 *         스택에 a사람 변수가 힙에 사람 객체를 가리킨다.
 *         사람 객체 안에 번호 나이 이름 기혼여부, a왼팔(팔 리모콘이 생긴다.)
 *         a사람.a왼팔 = new 팔(); 하면
 *         a왼팔 리모콘이 힙에 있는 새로운 팔 객체를 가리킨다.
 *
 *
 *
 */