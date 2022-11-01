package chapter42;

import java.util.List;
import java.util.ArrayList;

class 버튼_옵저버_패턴2 {
	public static void main(String[] args) {
		View aButton = new Button();
		aButton.add구독자(new 홍길동());
		aButton.add구독자(new 홍길순());
		aButton.fireClickEvent();
		aButton.fireClickEvent();
	}
}

class View {
	private List<구독자> 구독자List;

	View() {
		구독자List = new ArrayList<>();
	}

	public void add구독자(구독자 a구독자) {
		구독자List.add(a구독자);
	}

	public void fireClickEvent() {
		System.out.println("뷰가 클릭되었습니다.");

		for (구독자 a구독자 : 구독자List) {
			a구독자.소식받기("뷰가 클릭됨");
		}
	}
}

class Button extends View {

}

interface 구독자 {
	public void 소식받기(String msg);
}

class 홍길동 implements 구독자 {
	@Override
	public void 소식받기(String msg) {
		System.out.println("홍길동이 받은 메세지 : " + msg);
	}
}

class 홍길순 implements 구독자 {
	@Override
	public void 소식받기(String msg) {
		System.out.println("홍길순이 받은 메세지 : " + msg);
	}
}