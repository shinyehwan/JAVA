package chapter40_옵저버패턴;

// code.oa.gg/java8/1408
// 문제 : 아래가 실행되도록 해주세요.

class 인터페이스_구현 implements OnClickListener {
	public static void main(String[] args) {

	}

	@Override
	public void onclick(View view) {

	}
}

interface OnClickListener {
	public void onclick(View view);
}

class View {

}