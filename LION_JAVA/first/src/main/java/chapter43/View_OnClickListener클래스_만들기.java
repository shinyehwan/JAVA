package chapter43;

class View_OnClickListener클래스_만들기 {
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

		View.OnClickListener a; // 이 코드가 실행되도록 해주세요.
	}
}

abstract class View {
	static interface OnClickListener {
	}
}

/*
// 정답 v2
class View {
	static class OnClickListener {
	}
}
*/






