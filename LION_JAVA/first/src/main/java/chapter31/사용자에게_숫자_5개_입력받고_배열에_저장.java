package chapter31;

// 문제 : 사용자에게 5개의 숫자를 받고 배열에 저장해주세요.
// 조건 : 배열에 있는 모든 값을 더한 총합을 출력해주세요.
// 조건 : 개념부분은 파악하고 지운 후 시작해주세요.

import java.util.Scanner; // Scanner 클래스를 불러온다.

class 사용자에게_숫자_5개_입력받고_배열에_저장 {
	public static void main(String[] args) {
		System.out.println("== 개념 시작 ==");
		Scanner sc = new Scanner(System.in); // System.in(키보드)를 스캔하는 스캐너 객체 생성

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 숫자를 입력해주세요 : ", i+1);
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("== 개념 끝 ==");
	}
}