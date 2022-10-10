package chapter18;

//code.oa.gg/java8/920
// 문제 : 아래와 같이 출력 되도록 해보세요. 단 팔 클래스의 생성자는 사용할 수 없습니다. 변수 생성시 초기화(예를들면 int 길이 = 70;) 도 안됩니다. 즉 팔 클래스는 수정 할 수 없습니다.[정답]

class 사람이_태어나자마자_왼팔을_가지고_그_팔은_생긴_즉시_길이를_가져야_합니다V2 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        int a사람의_왼팔_길이 = a사람.a왼팔.길이;
        System.out.println(a사람의_왼팔_길이 + "cm");
        // 출력 : 700cm
    }
}

class 사람 {
    팔 a왼팔;

    사람() {
        a왼팔 = new 팔();
        a왼팔.길이 = 70; // 정답
    }
}

class 팔 {
    int 길이;

    팔() {
    }
}