package _17일차;

/**
 * 변수는 어떤 리모콘으로 나에게 접근하냐에 따라 다를 수 있다.
 * 함수(메소드)는 어떤 리모콘을 하건(아무상관 없다.) 무조건 오버라이딩 된 객체가 우선권을 가진다.
 */

public class  같은_객체라도_조종하는_리모콘_타입에_따라_활성화_되는_변수가_다를_수_있다{
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.이름 = "홍길동";
        동물 a동물 = a사람;
        a동물.이름 = "홍길순";

        System.out.println(a사람.이름);
        System.out.println(a동물.이름);
        System.out.println(a사람.test());
        System.out.println(a동물.test());
    }
}
class 동물 {
    String 이름;
    String test() {
        return 이름;
    }
}
class 사람 extends 동물 {
    String 이름;
    String test() {
        return 이름;
    }
}