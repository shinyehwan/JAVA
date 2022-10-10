package chapter18;

//code.oa.gg/java8/910
// 문제 : 아래와 같이 출력 되도록 해보세요. 단 변수 선언시에 하는 초기화는 불가능합니다.[정답]

class 사람이_태어나자마자_자동으로_나이가_20살이된다 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        System.out.println(a사람.나이);
        // 출력 : 20
    }
}

class 사람 {
    int 나이;

    사람() {
        this.나이 = 20;
    }
}