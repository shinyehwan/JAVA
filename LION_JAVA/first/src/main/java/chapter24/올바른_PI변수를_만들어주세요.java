package chapter24;

//code.oa.gg/java8/943
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.[정답]

// ps. 파이는 3.141592 라고 가정하겠습니다.

class 올바른_PI변수를_만들어주세요 {
    public static void main(String[] args) {
        System.out.println(new 수학().PI);
        // 출력 : 3.141592

        수학 a수학 = new 수학();
        System.out.println(a수학.PI);
        // 출력 : 3.141592
    }
}

class 수학 {
    // 이 속성은 현재 존재하지 않는다.
    // 이 속성은 장차 new 수학(); 했을 때 그 객체 안에 생길것이다.
    // 이 선언을 일종의 예언이다.
    double PI = 3.141592;
}