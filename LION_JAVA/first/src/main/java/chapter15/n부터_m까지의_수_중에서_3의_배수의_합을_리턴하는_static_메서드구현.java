package chapter15;

// 문제 : 아래 코드가 올바르게 실행되도록 해주세요.

class n부터_m까지의_수_중에서_3의_배수의_합을_리턴하는_static_메서드구현 {
    public static void main(String[] args) {
        int 결과 = 계산기.get_n부터_m까지의_수_중에서_3의배수의_합(30, 400);

        System.out.println(결과);
        // 출력 => ???
    }
}

class 계산기 {
    static int get_n부터_m까지의_수_중에서_3의배수의_합(int n, int m) {
        int sum = 0;

        for ( int i = n; i <= m; i++ ) {
            if ( i % 3 == 0 ) {
                sum += i;
            }
        }

        return sum;
    }
}