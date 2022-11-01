package chapter41;

class 계산식을_삽입해서_계산을_수행 {
	public static void main(String[] args) {
		계산기 a계산기 = new 계산기();
		a계산기.num1 = 10;
		a계산기.num2 = 20;

		// 내부 클래스 + 익명 클래스
		int 결과1 = a계산기.수행(new 식() {
			public int 실행(int num1, int num2) {
				return num1 + num2;
			}
		});
		System.out.println(결과1); // 30

		// 내부 클래스 + 익명 클래스 + 람다
		int 결과2 = a계산기.수행(
			(int num1, int num2) -> {
				return num1 - num2;
			}
		);
		System.out.println(결과2); // -10

		// 내부 클래스 + 익명 클래스 + 람다 + 매개변수 생략
		int 결과3 = a계산기.수행(
			(num1, num2) -> {
				return num1 * num2;
			}
		);
		System.out.println(결과3); // 300

		// 내부 클래스 + 익명 클래스 + 람다 + 매개변수 생략 + 리턴 생략
		int 결과4 = a계산기.수행(
			(num1, num2) -> num1 / num2
		);
		System.out.println(결과4); // 0
	}
}
class 계산기 {
	int num1;
	int num2;

	int 수행(식 a식) {
		return a식.실행(num1, num2);
	}
}

interface 식 {
	public int 실행(int num1, int num2);
}