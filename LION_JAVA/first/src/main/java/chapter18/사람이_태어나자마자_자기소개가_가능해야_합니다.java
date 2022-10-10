package chapter18;

//code.oa.gg/java8/916
// 문제 : 아래와 같이 출력 되도록 해보세요.[정답]

class 사람이_태어나자마자_자기소개가_가능해야_합니다 {
    public static void main(String[] args) {
        사람 a사람 = new 사람("홍길순", 22, "함경도", "예민함");
        a사람.자기소개();
        // 출력 : 저는 22살 함경도 출신 홍길순 입니다.

        사람 a사람2 = new 사람("임꺽정", 50, "충청도", "호탕함");
        a사람2.자기소개();

    }
}

class 사람 {
    int 나이;
    String 이름;
    String 고향;
    String 성격;

    사람(String 이름, int 나이, String 고향, String 성격) {
        // 여기서는 `this.` 을 생략할 수 없다.
        this.나이 = 나이;
        this.이름 = 이름;
        this.고향 = 고향;
        this.성격 = 성격;
    }

    void 자기소개() {
        System.out.println("저는 " + 나이 + "살 " + 고향 + " 출신 " + 이름 + " 입니다.");
    }
}