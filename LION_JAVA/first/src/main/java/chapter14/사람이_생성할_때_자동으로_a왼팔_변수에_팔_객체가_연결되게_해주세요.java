package chapter14;

// 출력 : 아래와 같이 출력되게 해주세요.

class 사람이_생성할_때_자동으로_a왼팔_변수에_팔_객체가_연결되게_해주세요 {
    public static void main(String[] args) {
        new 사람().걷다();

        System.out.println(new 사람().a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
class 사람 {
    팔 a왼팔;

    사람 () {
        a왼팔 = new 팔();

        // 만약에 팔 클래스에 `팔` 생성자를 못 쓰는 상황이다.
        // 그렇다면 아래와 같은 코드가 필요하다.
        //a왼팔.길이 = 100;
    }

    void 걷다() {
        System.out.println("사람이 걷습니다.");
    }
}
class 팔 {
    int 길이;
    팔() {
        this.길이 = 100;
    }
}




