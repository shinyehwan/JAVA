package chapter40_옵저버패턴;

/*
문제 : 사람 객체의 `안녕`이 `button.click();`에 의해 실행되도록 해주세요.
조건 : Button에는 `사람` 이라는 언급이 없어야 합니다.
*/
class 다른_객체가_해당_메서드를_이용하게_해주세요_인터페이스사용 {
	public static void main(String[] args) {
		Button button = new Button();
		button.setListener(new 사람());
		button.click();
	}
}
class Button {
	private Object aListener;
	public void setListener(Object aListener) {
		this.aListener = aListener;
	}
	public void click() {
		((사람)aListener).안녕();
	}
}
class 사람 {
	public void 안녕() {
		System.out.println("Main::안녕!");
	}
}