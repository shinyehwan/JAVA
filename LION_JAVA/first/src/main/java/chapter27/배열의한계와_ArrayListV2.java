package chapter27;

//code.oa.gg/java8/987

class 배열의한계와_ArrayListV2 {
	public static void main(String[] args) {
		int k = 10;
		int[] iArr = new int[10];
		// int[] => 클래스 이름
		// new int[10] => 객체 생성
		// new int[10] => int 10개 저장될 수 있는 버스(객체)를 만든다.

		System.out.println("배열의 길이 : " +  iArr.length);

		iArr[0] = 20;
		iArr[1] = 20;
		iArr[2] = 20;
		iArr[3] = 20;
		iArr[4] = 20;
		iArr[5] = 20;
		iArr[6] = 20;
		iArr[7] = 20;
		iArr[8] = 20;
		iArr[9] = 20;

		System.out.println("== 배열의 원래 값 ==");

		for ( int i = 0; i < iArr.length; i++ ) {
			System.out.println("iArr[" + i +  "]의 값 : " + iArr[i]);
		}

		System.out.println("== 배열의 바뀐 값 ==");

		for ( int i = 0; i < iArr.length; i++ ) {
			iArr[i] = i + 1;
		}

		for ( int i = 0; i < iArr.length; i++ ) {
			System.out.println("iArr[" + i +  "]의 값 : " + iArr[i]);
		}

		// 여기서 구현해주세요.
	}
}
