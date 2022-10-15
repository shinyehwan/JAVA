package chapter28;

// Object 클래스와 equals
class 개념_Object클래스와_equals {

    public static void main(String[] args) {

//        int a = 5;
//        int b = 5;
//        if (a == b) {
//            System.out.println("참");
//        }

        사람 a사람1 = new 사람("홍길동", 22);
        사람 a사람2 = new 사람("홍길동", 22);

        if (a사람1.equals("ㅋㅋㅋ")) {
            System.out.println("거짓");
        }
        if (a사람1.equals(a사람2)) {
            System.out.println("참이 나오려면 어떻게 해야할까?");
        }

        System.out.println(a사람1);
        System.out.println(a사람2);
    }
}

class 사람 extends Object {
    String 이름;
    int 나이;

    사람(String 이름, int 나이) {
        this.이름 = 이름;
        this.나이 = 나이;
    }

    @Override
    public boolean equals(Object o) {
        // 입구 컷
        if (o instanceof 사람 == false) {
            return false;
        }

        사람 other = (사람)o;
        // 객체 끼리의 비교 != 사용불가
        if (this.이름.equals(other.이름) == false) {
            return false;
        }

        if (this.나이 != other.나이) {
            return false;
        }
        return true;

//        return this == o;
    }

}


