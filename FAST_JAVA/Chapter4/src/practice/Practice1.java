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
			System.out.println("������ �����Դϴ�.");
		}
		
		System.out.println("��� ���� " + result + " �Դϴ�.");
		
		
	}

}
