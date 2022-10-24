package chapter24;

//code.oa.gg/java8/955
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.[정답]

class 올바른_출력_메서드를_만들어주세요_static {
    public static void main(String[] args) {
        출력("안녕");
        // 출력 : 안녕
    }

    static void 출력(String str) {
        System.out.println(str);
    }
}