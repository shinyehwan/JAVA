package chapter43;

//code.oa.gg/java8/1416

class 액티비티_구현 {
	public static void main(String[] args) {
		Activity activity = new MainActivity();
		activity.onCreate();
		// 출력 => 메인 액티비티가 실행되었습니다.
	}
}

abstract class Activity {
	abstract public void onCreate();
}

class MainActivity extends Activity{
	@Override
	public void onCreate() {
		System.out.println("메인 액티비티가 실행되었습니다.");
	}
}