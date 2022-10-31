package chapter40_옵저버패턴;

class 인터페이스_동물이_소리를_내게_하는_방법V1 {
	public static void main(String[] args) {
		고양이 a동물1 = new 고양이();
		개 a동물2 = new 개();
		사자 a동물3 = new 사자();

		소리를_내도록_작동(a동물1);
		소리를_내도록_작동(a동물2);
		소리를_내도록_작동(a동물3);
	}

	private static void 소리를_내도록_작동(Object o) {
		if ( o instanceof 고양이 ) {
			고양이 a고양이 = (고양이)o;
			a고양이.야옹();
		}
		else if ( o instanceof 개 ) {
			개 a개 = (개)o;
			a개.멍멍();
		}
		else if ( o instanceof 사자 ) {
			사자 a사자 = (사자)o;
			a사자.어흥();
		}
	}
}
class 고양이 {
	public void 야옹() {
		System.out.println("고양이 : 야옹");
	}
	public void 하품하다() {
		System.out.println("고양이 : 하품하다");
	}
}
class 개 {
	public void 멍멍() {
		System.out.println("개 : 멍멍");
	}

	public void 뛰다() {
		System.out.println("개 : 뛰다");
	}
}
class 사자 {
	public void 어흥() {
		System.out.println("사자 : 어흥");
	}

	public void 뛰다() {
		System.out.println("사자 : 뛰다");
	}
}

