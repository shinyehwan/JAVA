package chapter19;
//code.oa.gg/java8/930
// 문제 : 아래와 같이 출력되도록 해보세요.

class 사람객체를_만드는_옵션을_2가지_만들어주세요 {
    public static void main(String[] args) {
        new 사람();
        // 출력 : 사람이 태어났습니다.

        new 사람(10);
        // 출력 : 태어나서부터 10살인 사람이 태어났습니다.

        new 사람(20);
        // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
    }
}

class 사람 {
    int 나이;
    사람() {
        System.out.println("사람이 태어났습니다.");
    }

    사람(int 나이) {
        this.나이 = 나이;
        System.out.println("태어나서부터 " + 나이 + "살인 사람이 태어났습니다.");
    }
}


