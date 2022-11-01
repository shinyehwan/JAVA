package chapter26_형변환2;

//code.oa.gg/java8/974
// 문제 : 아래코드의 오류를 수정해보세요.[정답]

class 수동형변환으로_오류를_해결 {
	public static void main(String[] args) {
		long l = 200L;
		int i = (int)l; // 위험한 일에는 수동형변환(사인)을 꼭 해야 합니다.

		동물 a동물 = new 사람();
		a동물 = new 원숭이();

		원숭이 a원숭이 = (원숭이)a동물; // 위험한 일에는 수동형변환(사인)을 꼭 해야 합니다.
	}
}

class 사람 extends 동물 {
}

class 원숭이 extends 동물 {
}

class 동물 {
}