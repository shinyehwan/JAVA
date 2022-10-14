package chapter25;

/**
 * 2가지
 * - 객체
 * - 비객체
 * - 10, 10.5, false, 'a', ("aa" 이건 아닌거 알지?)
 * - 숫자계열
 * - 논리계열
 */

public class 개념_범용성_있는_클래스_만드는_방법_메소드개수줄이는이유 {
    public static void main(String[] args) {
        // byte, short, int, long, float
//        double data0 = 22;
        int data = 10;
        Integer iObj = new Integer(data);
        저장소.저장(iObj);


    }
}

class 저장소 {
//    static void 저장(byte data) {
//    }
//
//    static void 저장(short data) {
//    }
//
//    static void 저장(int data) {
//    }
//
//    static void 저장(long data) {
//    }
//
//    static void 저장(float data) {
//    }
//
//    static void 저장(double data) {
//    }
//
//    static void 저장(char data) {
//    }
//
//    static void 저장(boolean data) {
//    }


//    static void 저장(바나나 data) {
//    }
    static void 저장(Object data) {
    }
}
