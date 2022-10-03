package chapter10;

// 문제 : 정수 i가 가지고 있는 10을 double 형 변수에 넣고 해당 변수의 값을 다시 i에 넣는 코드를 작성해주세요.

class Main0 {
    public static void main(String[] args) {
        int i = 10;
        double d = i; // 여기선 자동형변환 허용, 왜냐? 안전하니까
        i = (int)d; // 여기선 자동형변환 불가능, 왜냐? 문제가 발생할 가능성이 있으니까.

        System.out.println(i);
    }
}