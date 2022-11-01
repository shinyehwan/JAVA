package chapter43;

class setOnClickListener메서드_구현V4 {
	public static void main(String[] args) {
		new MainActivity().onCreate();
	}
}
class MainActivity {
	int 나이 = 10;
	void onCreate() {
		Button aButton = new Button(this);
		aButton.setOnClickListener(new OnClickListener() {
			int 나이 = 5;

			@Override
			public void clicked() {
				System.out.println(this.나이);
				System.out.println(MainActivity.this.나이);
			}
		});

		aButton.fireClickEvent();
	}
}

interface OnClickListener {
	public void clicked();
}

class Button {
	OnClickListener onClickListener;

	Button(MainActivity aMainActivity) {
	}

	void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	void fireClickEvent() {
		System.out.println("버튼이 클릭되었습니다.");
		onClickListener.clicked();
	}
}


