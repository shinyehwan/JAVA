package chapter36_예외처리;

class ArrayIndexOutOfBoundsException_부하직원이_처리하지_못하면_선임이_처리해야_한다 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		try {
			채우다(arr);
		}
		catch ( ArrayIndexOutOfBoundsException e ) {
			System.out.println("작업이 정상종료 되지 않았습니다.");
		}

		for ( int i = 0; i < arr.length; i++ ) {
			System.out.println("arr[" + i + "] => " + arr[i]);
		}
	}

	static void 채우다(int[] arr) throws ArrayIndexOutOfBoundsException {
		for ( int i = 0; i < 11; i++ ) {
			arr[i] = (i + 1) * 100;
		}
	}
}