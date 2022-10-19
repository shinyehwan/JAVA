package chapter19;
//code.oa.gg/java8/932
// 문제 : 아래와 같이 출력되도록 해보세요.

class 계산기_객체가_더하는_기능의_옵션을_3가지_이상_가지도록_만들어주세요 {
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();

        System.out.println(a계산기.더하기(10, 20));
        // 출력 : 30

        System.out.println(a계산기.더하기(10, 20, 30));
        // 출력 : 60

        System.out.println(a계산기.더하기(10.5, 20, 30));
        // 출력 : 60.5
    }
}

class 계산기 {

//    int 더하기(int a, int b) {
//        return a + b;
//    }

    int 더하기(int a, int b) {
        return (int)더하기(a,b,0);
    }

//    int 더하기(int a, int b, int c) {
//        return a + b + c;
//    }

    double 더하기(double a, int b, int c) {
        return a + b + c;
    }


}