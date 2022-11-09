package chapter34_인터페이스;

//code.oa.gg/java8/1347
// 문제 : 아래가 실행되도록 해주세요.[정답]
// 조건 : 구현 시작 ~ 구현 끝 사이 부분만 수정할 수 있습니다.

class interfaceV4 {
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
	public static void 진찰하다(Object obj) {
		if ( obj instanceof 사람 ) {
			사람 a사람 = (사람)obj;
			a사람.진료();
		}
		else if ( obj instanceof 원숭이 ) {
			원숭이 a원숭이 = (원숭이)obj;
			a원숭이.살펴보다();
		}
		else if ( obj instanceof 치타 ) {
			치타 a치타 = (치타)obj;
			a치타.진찰();
		}
		else if ( obj instanceof 기린 ) {
			기린 a기린 = (기린)obj;
			a기린.진찰();
		}
		else if ( obj instanceof 로봇 ) {
			로봇 a로봇 = (로봇)obj;
			a로봇.오류감지();
		}
		else if ( obj instanceof 삼성 ) {
			삼성 a삼성 = (삼성)obj;
			a삼성.삼성병원에_진찰하라고_지시();
		}
		else if ( obj instanceof LG ) {
			LG aLG = (LG)obj;
			aLG.삼성병원에_진찰하라고_지시();
		}
	}
}

class 사람 {
	void 진료() {
		System.out.println("사람이 진찰합니다.");
	}
}

class 원숭이 {
	void 살펴보다() {
		System.out.println("원숭이가 진찰합니다.");
	}
}

class 치타 {
	void 진찰() {
		System.out.println("치타가 진찰합니다.");
	}
}

class 기린 {
	void 진찰() {
		System.out.println("기린이 진찰합니다.");
	}
}

class 로봇 {
	void 오류감지() {
		System.out.println("로봇이 진찰합니다.");
	}
}

class 삼성 {
	void 삼성병원에_진찰하라고_지시() {
		System.out.println("삼성이 진찰합니다.");
	}
}

class LG {
	void 삼성병원에_진찰하라고_지시() {
		System.out.println("LG가 진찰합니다.");
	}
}