package chapter31;

// 문제
// 조건 : 입력은 무한히 많이
// 조건 : -1 누르면 종료
// 조건 : 중복데이터 금지
// 조건 : 2번 데이터 삭제

import java.util.Scanner;
import java.util.ArrayList;

class 번호를_입력받는_프로그램_ArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		Scanner scan = new Scanner(System.in);

		for (int i = 0; true; i++) {
			boolean exit = false;

			int seq = i + 1;
			while (true) {
				System.out.print(seq + "번째 번호를 입력해주세요(-1은 종료) : ");
				int no = scan.nextInt();

				if (no == -1) {
					System.out.println("프로그램을 종료합니다.");
					exit = true;
					break;
				}

				String str = no + "번";

				if (al.contains(str)) {
					System.out.println("다른 숫자를 입력 해주세요.");
					continue;
				}

				al.add(str);
				break;
			}

			if (exit) {
				break;
			}
		}

		System.out.println("== 데이터 확인 ==");
		System.out.println(al);

		System.out.println("== 2번 데이터 삭제(존재한다면) ==");

		int removeIndex = 2;
		if (al.size() > removeIndex) {
			al.remove(removeIndex);
		}

		System.out.println("== 데이터 확인 ==");
		System.out.println(al);
	}
}
