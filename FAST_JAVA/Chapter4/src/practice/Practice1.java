package practice;

public class Practice1 {

	public static void main(String[] args) {

		char operator = '+';
		int num1 = 3;
		int num2 = 13;
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}
		else if (operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
		}
		else if(operator == '/') {
			result = num1 / num2;
		}
		else{
			System.out.println("연산자 오류입니다.");
		}
		
		System.out.println("결과 값은 " + result + " 입니다.");
		
		
	}

}
