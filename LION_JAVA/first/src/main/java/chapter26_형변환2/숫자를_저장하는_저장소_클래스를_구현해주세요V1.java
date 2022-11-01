package chapter26_형변환2;

//code.oa.gg/java8/977
// 문제 : 아래와 같이 출력되도록 `저장소` 클래스를 만들어보세요.

class 숫자를_저장하는_저장소_클래스를_구현해주세요V1 {
	public static void main(String[] args) {
		저장소 a저장소 = new 저장소();

		a저장소.저장(new Integer(10));
		// int 결과 = ((Integer)a저장소.주세요()).intValue();
		int 결과 = (int)a저장소.주세요();

		System.out.println(결과);
		// 출력 : 10
	}
}

class 저장소 {
	Object data;
	void 저장(Object o) {
		data = o;
	}
	Object 주세요() {
		return data;
	}
}