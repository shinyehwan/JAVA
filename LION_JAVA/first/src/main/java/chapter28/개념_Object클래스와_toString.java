package chapter28;

// Object 클래스와 toString
class 개념_Object클래스와_toString {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("홍길동", 22);
        사람 a사람2 = new 사람("홍길순", 23);
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
    public String toString() {
        return "사람[이름=" + 이름 + ",나이=" + 나이 + "]";
    }
}



