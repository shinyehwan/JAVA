package chapter27_배열2;

// 문제 : 길이가 10인 int 배열을 만들고 거기에 1부터 10까지 채워주세요.
// 조건 : 그 후 배열 안의 모든 값들의 합도 출력해주세요.

/*
class Main {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			result += arr[i];
		}
		System.out.println(result);
	}
}
*/

class 숫자1부터10까지_저장해주세요 {
	public static void main(String[] args) {
		// 길이가 10인 배열객체를 만든다.
		// 배열객체에는 11칸이 들어있다.
		// - 숫자 10개 저장할 수 있는 10개의 칸(int 변수 10칸), 그리고 배열의 길이가 들어있는 length 1칸
		// arr이라는 변수에는 해당 배열의 리모콘이 들어온다.
		int[] arr = new int[10];

		// 데이터를 넣는다.
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;

		// 총합을 구한다.
		int sum = 0;
		sum += arr[0];
		sum += arr[1];
		sum += arr[2];
		sum += arr[3];
		sum += arr[4];
		sum += arr[5];
		sum += arr[6];
		sum += arr[7];
		sum += arr[8];
		sum += arr[9];

		System.out.println("총합은 " + sum);
	}
}