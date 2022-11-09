package chapter36_예외처리;

class ArrayIndexOutOfBoundsException extends Throwable {
	public static void main(String[] args) {
		int[] arr = new int[10];

		채우다(arr);

		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println("arr[" + i + "] => " + arr[i]);
		}
	}

	static void 채우다(int[] arr) {
		for ( int i = 0; i < 11; i++ ) {
			try {
				arr[i] = (i + 1) * 100;
			}
			catch ( java.lang.ArrayIndexOutOfBoundsException e ) {
				System.out.println("배열의 크기를 넘어선 index 사용이 감지되었습니다. 여기서 배열에 값 채워넣기 작업을 정지합니다.");
				break;
			}
		}
	}
}