package chapter26_형변환2;

//code.oa.gg/java8/982
// 문제 : 아래의 진행상활대로 코딩해주세요.[정답]

class 박싱_언박싱_관련_다양한_예시 {
	public static void main(String[] args) {
		// Integer에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
		int i = 10;
		System.out.println(i + 20);
		Integer iObj = new Integer(10); // 수동박싱
		int k = iObj.intValue(); // 수동언박싱
		System.out.println(k + 20);
		Integer iObj2 = 30; // 오토박싱
		int i3 = iObj2 + 20 - iObj2 - iObj2; // 오토언박싱
		System.out.println(i3);

		// Boolean에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
		boolean b = true; // 수동박싱
		Boolean bObj = new Boolean(b);// 수동 박싱
		b = bObj.booleanValue(); // 수동 언박싱
		System.out.println(b);
		bObj = b; // 오토박싱
		if (bObj) {
			System.out.println("실행됨!");
		}
		Boolean blObj = new Boolean(false); // 수동박싱
		boolean bl = blObj.booleanValue(); // 수동언박싱
		Boolean blObj2 = false; // 오토박싱
		boolean bl2 = new Boolean(true); // 오토언박싱
		bl2 = blObj2; // 오토언박싱

		// Character에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
		char c = 'k';
		Character cObj = new Character(c); // 수동 언싱
		c = (char)(cObj.charValue() + 2); // 수동 언박싱
		System.out.println(c);
		cObj = 'a'; // 오토 박싱
		System.out.println(cObj + 2); // 오토 언박싱
	}
}
