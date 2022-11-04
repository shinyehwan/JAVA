package chapter33;

//code.oa.gg/java8/1354

class Equals와는는 {
	public static void main(String[] args) {
		사과 사과1 = new 사과("애플");
		사과 사과2 = new 사과("애플");

		System.out.println("사과1 == 사과2 : " + (사과1 == 사과2));
		System.out.println("사과1.equals(사과2) : " + (사과1.equals(사과2)));

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		System.out.println("i1 == i2 : " + (i1 == i2));
		System.out.println("i1.equals(i2) : " + i1.equals(i2));

		String str1 = "안녕";
		String str2 = "안녕"; // 이렇게 하면 기존의 "안녕" 객체를 재활용 한다., 즉 str2는 str1이 가리키고 있는 객체를 가리킨다.

		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));

		// `안녕하이` 라는 문자열객체를 새로 만들고 str1은 이제 그것을 가리킨다.
		str1 += "하이";

		System.out.println("str1 == str2 : " + (str1 == str2));

		String str3 = new String("안녕");
		String str4 = new String("안녕");

		// `안녕하이` 라는 문자열객체를 새로 만들고 str4는 이제 그것을 가리킨다.
		str4 += "하이";

		System.out.println("str3 == str4 : " + (str3 == str4));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
	}
}

class 사과 {
	String 이름;
	사과(String 이름) {
		this.이름 = 이름;
	}

	@Override public boolean equals(Object o) {
		if ( o instanceof 사과 ) {
			사과 비교대상 = (사과)o;

			if ( this.이름.equals(비교대상.이름) ) {
				return true;
			}
		}

		return false;
	}
}