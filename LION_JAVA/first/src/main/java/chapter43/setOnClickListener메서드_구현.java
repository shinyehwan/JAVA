package chapter43;


class setOnClickListener메서드_구현 {
	public static void main(String[] args) {
		Activity activity = new MainActivity();
		activity.onCreate();
	}
}

abstract class Activity {
	abstract public void onCreate();
}

class MainActivity extends Activity {
	@Override
	public void onCreate() {
		System.out.println("메인 액티비티가 실행되었습니다.");

		// 아래 코드가 실행되도록 해주세요.
		View.OnClickListener a = new 사과();
		View aButton = new Button(this);
		aButton.setOnClickListener(a);
	}
}

abstract class View {
	static interface OnClickListener {
	}

	void setOnClickListener(OnClickListener onClickListener) {

	}
}

class Button extends View {
	Button(Activity activity) {
	}
}

class 사과 implements View.OnClickListener {
}



