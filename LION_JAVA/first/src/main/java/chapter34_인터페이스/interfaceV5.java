package chapter34_인터페이스;

//code.oa.gg/java8/1349
// 문제 : 아래가 실행되도록 해주세요.[정답]
// 조건 : Main 클래스는 수정 할 수 없습니다.
// 조건 : 각 클래스의 기존 메서드는 삭제/수정 할 수 없습니다.
// 조건 : 그 외의 모든 것은 전부 수정가능합니다.
// 조건 : 소스코드 중복이 있으면 안됩니다.

class interfaceV5 {
	public static void main(String[] args) {
		진찰하다(new 사람());
		// 출력 : 사람이 진찰합니다.
		진찰하다(new 원숭이());
		// 출력 : 원숭이가 진찰합니다.
		진찰하다(new 치타());
		// 출력 : 치타가 진찰합니다.
		진찰하다(new 기린());
		// 출력 : 기린이 진찰합니다.
		진찰하다(new 로봇());
		// 출력 : 로봇이 진찰합니다.
		진찰하다(new 삼성());
		// 출력 : 삼성이 진찰합니다.
		진찰하다(new LG());
		// 출력 : 삼성이 진찰합니다.
	}

	// 여기에 static 추가
	public static void 진찰하다(의사 a의사) {
		a의사.진찰();
	}
}

interface 의사 {
	public void 진찰();
}

class 사람 implements 의사 {
	public void 진찰() {
		진료();
	}

	void 진료() {
		System.out.println("사람이 진찰합니다.");
	}
}

class 원숭이 implements 의사 {
	public void 진찰() {
		살펴보다();
	}

	void 살펴보다() {
		System.out.println("원숭이가 진찰합니다.");
	}
}

class 치타 implements 의사 {
	public void 진찰() {
		System.out.println("치타가 진찰합니다.");
	}
}

class 기린 implements 의사 {
	public void 진찰() {
		System.out.println("기린이 진찰합니다.");
	}
}

class 로봇 implements 의사 {
	public void 진찰() {
		오류감지();
	}

	void 오류감지() {
		System.out.println("로봇이 진찰합니다.");
	}
}

class 삼성 implements 의사 {
	public void 진찰() {
		삼성병원에_진찰하라고_지시();
	}

	void 삼성병원에_진찰하라고_지시() {
		System.out.println("삼성이 진찰합니다.");
	}
}

class LG implements 의사 {
	public void 진찰() {
		삼성병원에_진찰하라고_지시();
	}

	void 삼성병원에_진찰하라고_지시() {
		System.out.println("LG가 진찰합니다.");
	}
}