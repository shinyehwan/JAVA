package chapter24;
//code.oa.gg/java8/957
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.[정답]

class 올바른_출력_메서드를_만들어주세요_static_오버로딩 {
    public static void main(String[] args) {
        출력("안녕");
        // 출력 : 안녕

        출력(5);
        // 출력 : 5
    }

    // 똑같은 이름의 메서드를 클래스 하나에 여러개 두는 것 : 메서드 오버로딩
    static void 출력(String str) {
        System.out.println(str);
    }

    static void 출력(int i) {
        System.out.println(i);
    }
}