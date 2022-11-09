package chapter36_예외처리;

class 채우기_그리고_나누기 {
	public static void main(String[] args) {
		int[] datas = new int[2];

		//채우기_3개(datas, 5);
		//나누기(datas, 2);
		채우기_3개_그리고_나누기(datas, 10, 0);

		for ( int i = 0; i < datas.length; i++ ) {
			System.out.println("datas[" + i +  "] : " + datas[i]);

		}
	}

	static void 채우기_3개_그리고_나누기(int[] datas, int a, int b) {
		for ( int i = 0; i < 3; i++ ) {
			try {
				datas[i] = a;
			}
			catch ( ArrayIndexOutOfBoundsException e ) {
				break;
			}
		}

		for ( int i = 0; i < datas.length; i++ ) {
			try {
				datas[i] = datas[i] / b;
			}
			catch ( ArithmeticException e ) {
				datas[i] = 0;
			}
		}
	}

	static void 채우기_3개(int[] datas, int value) {
		for ( int i = 0; i < 3; i++ ) {
			datas[i] = value;
		}
	}

	static void 나누기(int[] datas, int a) {
		for ( int i = 0; i < datas.length; i++ ) {
			datas[i] = datas[i] / a;
		}
	}
}