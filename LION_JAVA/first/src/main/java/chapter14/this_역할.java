package chapter14;

// 문제 : 사람의 걷다 메서드에 this. 를 적절한 곳에 추가해주세요.

class this_역할 {
    // 함수, 메서드
    // 단순히 프로그램의 시작점!
    public static void main(String[] args) {
        // 지역변수 => 하루살이 변수
        int k = 10;

        사람 a사람 = new 사람();

        // 나이는 인스턴스 변수 입니다.
        // 객체가 없어질 때 까지 유지됩니다.
        a사람.나이 = 20;

        int dan = 8;
        for ( int i = 1; i < 9; i++ ) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }

        System.out.println(a사람.나이);
        a사람.걷다();
    }
}

class 사람 {
    // 인스턴스 변수
    int 나이;

    void 걷다() {
        int 나이 = 22;
        System.out.println(this.나이 + "살인 홍길동씨가 걷습니다.");
    }
}