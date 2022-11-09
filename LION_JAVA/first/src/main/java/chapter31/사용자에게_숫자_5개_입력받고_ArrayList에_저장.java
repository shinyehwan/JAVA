package chapter31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제 : 사용자에게 5개의 숫자를 받고 배열에 저장해주세요.
// 조건 : 배열에 있는 모든 값을 더한 총합을 출력해주세요.
// 조건 : 개념부분은 파악하고 지운 후 시작해주세요.


class 사용자에게_숫자_5개_입력받고_ArrayList에_저장 {
	public static void main(String[] args) {
		System.out.println("== 개념 시작 ==");
		Scanner sc = new Scanner(System.in); // System.in(키보드)를 스캔하는 스캐너 객체 생성

		List<Integer> arr = new ArrayList<>();
		int sum = 0;

		while (true) {
			for (int i = 0; i < 5; i++) {
				System.out.printf("%d번째 숫자를 입력해주세요 : ", i + 1);
				int input = sc.nextInt();
				arr.add(input);
				sum += arr.get(i);
			}
			break;
		}

		System.out.println("총합 : " + sum);
		System.out.println("== 개념 끝 ==");
	}
}