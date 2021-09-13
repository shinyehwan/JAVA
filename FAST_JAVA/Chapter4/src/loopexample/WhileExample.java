package loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {

		/* int num = 1;
		int sum = 0;
		
		while (num <= 100) {
			sum += num;
			num = num + 2 ;			// 11
		}
		
		System.out.println(sum);
		System.out.println(num);
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		input = scanner.nextInt();
		
		while(input != 0) {
			sum +=input;
			input = scanner.nextInt();
		}
		
		System.out.println(sum);
		
		// 홀수일 때, 짝수일 때 더하기도 해봐 간단해
		
	}

}
