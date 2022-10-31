package chapter40_옵저버패턴;

// 문제 : 아래가 실행되도록 해주세요.

class Main implements OnClickListener {
	public static void main(String[] args) {
		Main aMain = new Main();
		View aButton = new Button(aMain);

		aButton.setOnClickListener(aMain);
		aButton.fireClickEvent();
		// 출력 : 버튼이 클릭되었습니다.
		// 참고로 위 출력은 아래 onClick 메서드의 호출로 이뤄져야 합니다.
	}

	@Override
	public void onClick(View v) {
		System.out.println("버튼이 클릭되었습니다.");
	}
}

interface OnClickListener {
	public void onClick(View v);
}

class View {
	private OnClickListener onClickListener;
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	public void fireClickEvent() {
		onClickListener.onClick(this);
	}

}

class Button extends View {
	Button(Main aMain) {

	}
}