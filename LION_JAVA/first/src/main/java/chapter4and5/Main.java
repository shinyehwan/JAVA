package chapter4and5;//1.  chapter4and5.자동차 설계도를 만들어 주세요.
//2.  chapter4and5.자동차 객체를 담을 변수를 만들어주세요.
//3.  chapter4and5.자동차 객체를 만들고 변수에 담아주세요.
//4.  chapter4and5.자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.
//5.  1개의 자동차가 3번 달리게 해주세요.
//6.  객체를 사용하지 않고 두번째 플레이어를 만들어주세요.
//7.  3개의 자동차가 각각 1번씩 달리게 해주세요.

class Main {

    public static void main(String[] args) {
        // 2.
        // chapter4and5.자동차 c;
        // chapter4and5.자동차 a자동차;
        // 3.
        // a자동차 = new chapter4and5.자동차();

        // 자동차를 만들고 조종할 수 있는 리모콘을 a자동차에 넣었다.
        자동차 a자동차 = new 자동차();

        자동차 a자동차1 = new 자동차();
        자동차 a자동차2 = new 자동차();

        a자동차1.최고속력 = 100;
        a자동차2.최고속력 = 200;

        System.out.printf("a자동차1의 최고속력 : %d\n", a자동차1.최고속력);
        System.out.printf("a자동차2의 최고속력 : %d\n", a자동차2.최고속력);

        // chapter4and5.자동차 원격 조종(직접 x)
        a자동차.달리다();
        a자동차.서다();
        a자동차.달리다();
    }

}
// 1.
// 클래스에 넣을 수 있는 것 -> 변수(명사적 특성)와 함수(동사적 특성)
// 리모콘은 설계도를 기초로 만들어 진다.
class 자동차 {

    // 리모콘 버튼 3개
    int 최고속력;
    void 달리다() {
        System.out.println("달립니다.");
    }
    void 서다() {
        System.out.println("섭니다.");
    }


}

class Main {
    public static void main(String[] args) {
        플레이어 a플레이어1;
        a플레이어1 = new 플레이어();
        a플레이어1.나이 = 20;
        a플레이어1.이름 = "홍길동";
        a플레이어1.직업 = "의적";

        int a플레이어2_나이 = 22;
        String a플레이어2_이름 = "홍길순";
        String a플레이어2_직업 = "상인";
    }
}
class 플레이어 {
    int 나이;
    String 이름;
    String 직업;
}


// 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요. this 사용의 의미
class Main {
    public static void main(String[] args) {

        자동차 a자동차1 = new 자동차();
        자동차 a자동차2 = new 자동차();

        a자동차1.최고속력 = 100;
        a자동차2.최고속력 = 200;

        a자동차1.달리다();
        a자동차2.달리다();

    }


    class 자동차 {
        public int 최고속력;

        void 달리다() {
            System.out.println("최고속력은 시속" + this.최고속력 + "입니다.");
        }

    }

}

