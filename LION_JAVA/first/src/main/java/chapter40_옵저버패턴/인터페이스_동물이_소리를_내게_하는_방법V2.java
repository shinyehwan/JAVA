package chapter40_옵저버패턴;

class 인터페이스_동물이_소리를_내게_하는_방법V2 {
	public static void main(String[] args) {
		고양이 a동물1 = new 고양이();
		개 a동물2 = new 개();
		사자 a동물3 = new 사자();
		쥐 a동물4 = new 쥐();

		소리를_내도록_작동(a동물1);
		소리를_내도록_작동(a동물2);
		소리를_내도록_작동(a동물3);
		소리를_내도록_작동(a동물4);
	}

	private static void 소리를_내도록_작동(동물 o) {
		o.소리내다();
	}
}
class 고양이 implements 동물 {
	@Override
	public void 소리내다() {
		야옹();
	}
	public void 야옹() {
		System.out.println("고양이 : 야옹");
	}
	public void 하품하다() {
		System.out.println("고양이 : 하품하다");
	}
}
class 개 implements 동물 {
	@Override
	public void 소리내다() {
		멍멍();
	}

	public void 멍멍() {
		System.out.println("개 : 멍멍");
	}

	public void 뛰다() {
		System.out.println("개 : 뛰다");
	}
}
class 사자 implements 동물 {
	public void 어흥() {
		System.out.println("사자 : 어흥");
	}

	@Override
	public void 소리내다() {
		어흥();
	}

	public void 뛰다() {
		System.out.println("사자 : 뛰다");
	}
}

interface 동물 {
	public void 소리내다();
}

class 쥐 implements 동물 {
	@Override
	public void 소리내다() {
		System.out.println("쥐 : 찍찍!!");
	}
}