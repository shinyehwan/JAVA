package interfaceex;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1,n2));
        System.out.println(calc.substract(n1,n2));
        System.out.println(calc.times(n1,n2));
        System.out.println(calc.divdie(n1,n2));
        //calc.showInfo();

        calc.description();

        int[] arr = {1,2,3,4,5};
        int sum = Calc.total(arr); // 인스턴스 변수가 아니라 인스턴스 타입으로 가져다 쓴다.
        System.out.println(sum);
    }
}
