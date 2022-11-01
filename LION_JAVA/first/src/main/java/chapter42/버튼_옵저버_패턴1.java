package chapter42;

class 버튼_옵저버_패턴1 {
	public static void main(String[] args) {
		구독자 a구독자 = new 홍길동();
		a구독자.소식받기("버튼이 클릭됨");
	}
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


