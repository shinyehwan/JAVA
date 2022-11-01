package chapter41;

class 익명내부클래스와_인터페이스를_사용해서_문제를_풀어주세요V3 {
	public static void main(String[] args) {
		View.OnClickListener aOnClickListener;

		// 수정가능지역 시작
		aOnClickListener = () -> {
				System.out.println("클릭되었다는 사실을 전달받았습니다.");
		};
		// 수정가능지역 끝

		aOnClickListener.onClick();
		// 출력 => 클릭되었다는 사실을 전달받았습니다.
	}
}

class View {
	static interface OnClickListener {
		public void onClick();
	}
}