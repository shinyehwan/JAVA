package chapter36_예외처리;

class ArithmeticException_부하직원이_처리하지_못하면_선임이_처리해야_한다 {
	public static void main(String[] args) {
		try {
			int rs = 계산기.나누다(10, 0);
			System.out.println(rs);
		}
		catch ( ArithmeticException e ) {
			System.out.println("0으로 나눌 수는 없습니다. ㅠㅠ");
		}
		catch ( Exception e ) {
			System.out.println("알수 없는 에러가 발생하였습니다.");
		}

	}
}
class 계산기 {
	static int 나누다(int a, int b) throws ArithmeticException {
		int rs = a / b;
		return rs;
	}
}