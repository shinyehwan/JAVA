package chapter40_옵저버패턴;

class 버튼이_동물에게_클릭_사실을_알리도록_해주세요 {
	public static void main(String[] args) {
		Button aButton = new Button();
		aButton.setClickEventListener(new 고양이());
		aButton.fireClick();
		// 나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

		aButton.setClickEventListener(new 개());
		aButton.fireClick();
		// 나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

		aButton.setClickEventListener(new 부엉이());
		// 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

		aButton.fireClick();
	}
}

interface 동물 {
	public void onClick();

}

class Button {
	private 동물 a동물;
	public void setClickEventListener(동물 a동물) {
		this.a동물 = a동물;
	}

	public void fireClick() {
		a동물.onClick();
	}
}

class 고양이 implements 동물{

	@Override
	public void onClick() {
		System.out.println("나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
	}
}
class 개 implements 동물{
	@Override
	public void onClick() {
		System.out.println("나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
	}
}
class 부엉이 implements 동물{
	@Override
	public void onClick() {
		System.out.println("나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
	}
}