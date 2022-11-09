package chapter36_예외처리;

class 예외처리_커스텀_예외 {
	public static void main(String[] args) {
		try {
			수행1(10);
		}
		catch ( 배열의_길이가_짧음_Exception e ) {
			System.err.println(e.getMessage());
		}
	}

	static void 수행1(int num) throws 배열의_길이가_짧음_Exception {
		if ( num == 2 ) {
			throw new 배열의_길이가_짧음_Exception("에러내용11");
		}
	}
}
class 배열의_길이가_짧음_Exception extends Exception {
	배열의_길이가_짧음_Exception(String msg) {
		super(msg);
	}
}