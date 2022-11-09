package chapter31;

// 문제
// 조건 : 입력은 무한히 많이
// 조건 : -1 누르면 종료
// 조건 : 중복데이터 금지
import java.util.Scanner;

class 번호를_입력받는_프로그램_배열 {
	public static void main(String[] args) {
		String[] arr = new String[100];

		Scanner scan = new Scanner(System.in);

		int size = 0;

		for ( int i = 0; true; i++ ) {
			boolean exit = false;

			int seq = i + 1;
			while ( true ) {
				System.out.print(seq + "번째 번호를 입력해주세요(-1은 종료) : ");
				int no = scan.nextInt();

				if ( no == -1 ) {
					System.out.println("프로그램을 종료합니다.");
					exit = true;
					break;
				}

				String str = no + "번";

				boolean isDup = false;

				for ( int j = 0; j < i; j++ ) {
					if ( str.equals(arr[j]) ) {
						isDup = true;
						break;
					}
				}

				if ( isDup ) {
					System.out.println("다른 숫자를 입력 해주세요.");
					continue;
				}

				// 만약 배열의 크기가 부족하면, 수동으로 증가까지 해줘야 합니다.
				if ( arr.length == size ) {
					String[] newArr = new String[arr.length * 2];

					for ( int j = 0; j < size; j++ ) {
						newArr[j] = arr[j];
					}

					arr = newArr;
				}

				arr[i] = str;
				size++;
				break;
			}

			if ( exit ) {
				break;
			}
		}

		System.out.println("== 데이터 확인 ==");
		for ( int i = 0; i < size; i++ ) {
			System.out.println(i + " : " + arr[i]);
		}

		System.out.println("== 2번 데이터 삭제(존재한다면) ==");
		int removeIndex = 2;
		if ( removeIndex < size ) {
			for ( int i = removeIndex; i < size; i++ ) {
				arr[i] = arr[i + 1];
			}
			size--;
		}

		System.out.println("== 데이터 확인 ==");
		for ( int i = 0; i < size; i++ ) {
			System.out.println(i + " : " + arr[i]);
		}
	}
}
