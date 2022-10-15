package chapter29;

/**
 * 기본형 변수 타입
 * <p>
 * 문자계열
 * char (2바이트 짜리 정수로 인식)
 * <p>
 * 정수 계열
 * byte 1
 * short 2
 * int 4
 * long 8
 * <p>
 * 실수계열
 * float 4
 * double 8
 * <p>
 * 논리 계열
 * boolean
 */

// 문장은 객체 취급 해주고 무조건 equals로 해라.

public class 개념_String은_char와_어떻게_다른가 {
    public static void main(String[] args) {
        char c1 = '안';
        char c2 = '녕';

//        String s = c1 + c2; // 정수로 인식, 숫자로 치환
        String s = new String("안녕");
        System.out.println(s);

        //String s1 = new String("안녕");
        //String s2 = new String("안녕");

        String s1 = "안녕";
        String s2 = "안녕";


        //String s1 = new String("안녕");
        //String s2 = s1;

        if ( s1 == s2 ) {
            System.out.println("참");
        }

        if ( s1.equals(s2) ) {
            System.out.println("참");
        }

    }
}


