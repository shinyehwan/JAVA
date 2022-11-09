package chapter36_예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 올바른_나이를_입력할_때_까지_집요하게_계속_물어보게_해주세요 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int age;

		while (true) {
			System.out.print("숫자를 입력해주세요 : ");
			try {
				age = scan.nextInt();
				scan.nextLine();

				if (age < 1) {
					System.out.println("1 이상의 정수를 입력해주세요.");
					continue;
				}
			} catch (InputMismatchException e) {
				// 여기로 왔다는 것은 정수아닌 문장이 입력되었다는 뜻
				// 즉 버퍼에 쓰레기가 아직 채워져 있다는 뜻
				// 즉 버퍼에 있는 쓰레기를 지워준 다는 의미
				scan.nextLine();
				System.out.println("제발 정수 숫자만 입력해주세요.");
				continue;
			}

			break;
		}

		System.out.println(age + "살");
	}
}