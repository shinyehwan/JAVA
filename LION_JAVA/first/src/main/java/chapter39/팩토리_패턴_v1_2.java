package chapter39;

//code.oa.gg/java8/1081
// 문제 : 아래코드가 실행되도록 해주세요.

class 팩토리_패턴_v1_2 {
	public static void main(String[] args) {
		오리 a청둥오리 = new 오리();
		a청둥오리.set종류("청둥오리");
		a청둥오리.set비행아이템(new 날수있는비행아이템());
		a청둥오리.set울음아이템(new 꽥울음아이템());
		흰오리 a흰오리 = new 흰오리();
		고무오리 a고무오리 = new 고무오리();
		고무2오리 a고무2오리 = new 고무2오리();
		로봇오리 a로봇오리 = new 로봇오리();

		// 오리 a청둥오리 = 오리공장.get("청둥");
		// 오리 a흰오리 = 오리공장.get("흰");
		// 오리 a고무오리 = 오리공장.get("고무");
		// 오리 a고무2오리 = 오리공장.get("고무2");
		// 오리 a로봇오리 = 오리공장.get("로봇");

		a청둥오리.날다();
		// 출력 : 청둥오리 : 날개로 날아갑니다.
		a청둥오리.울다();
		// 출력 : 청둥오리 : 꽥꽥!!

		a흰오리.날다();
		// 출력 : 흰오리 : 날개로 날아갑니다.
		a흰오리.울다();
		// 출력 : 흰오리 : 꽥꽥!!

		a고무오리.날다();
		// 출력 : 고무오리 : 저는 날 수 없어요. ㅠㅠ
		a고무오리.울다();
		// 출력 : 고무오리 : 삑!삑!

		a고무2오리.날다();
		// 출력 : 고무오리 : 저는 날 수 없어요. ㅠㅠ
		a고무2오리.울다();
		// 출력 : 고무오리 : Peek!Peek!

		a로봇오리.날다();
		// 출력 : 로봇오리 : 로켓파워로 날아갑니다!!
		a로봇오리.울다();
		// 출력 : 로봇오리 : 기계는 울 수 없습니다.

		a고무2오리.set비행아이템(new 로켓날개비행아이템());
		a고무2오리.날다();
		// 출력 : 고무오리 : 로켓파워로 날아갑니다!!
	}
}

class 오리 {
	protected String 종류;
	protected 비행아이템 a비행아이템;
	protected 울음아이템 a울음아이템;

	public void 날다() {
		a비행아이템.작동(종류);
	}

	public void 울다() {
		a울음아이템.작동(종류);
	}

	public void set비행아이템(비행아이템 a비행아이템) {
		this.a비행아이템 = a비행아이템;
	}
	public void set울음아이템(울음아이템 a울음아이템) {
		this.a울음아이템 = a울음아이템;
	}
	public void set종류(String 종류) {
		this.종류 = 종류;
	}

}

class 흰오리 extends 오리 {
	흰오리() {
		종류 = "흰오리";
		a비행아이템 = new 날수있는비행아이템();
		a울음아이템 = new 꽥울음아이템();
	}
}

class 고무오리 extends 오리 {
	고무오리() {
		종류 = "고무오리";
		a비행아이템 = new 날수없는비행아이템();
		a울음아이템 = new 삑울음아이템();
	}

}

class 고무2오리 extends 오리 {
	고무2오리() {
		종류 = "고무2오리";
		a비행아이템 = new 날수없는비행아이템();
		a울음아이템 = new Peek울음아이템();
	}

}

class 로봇오리 extends 오리 {
	로봇오리() {
		종류 = "로봇오리";
		a비행아이템 = new 로켓날개비행아이템();
		a울음아이템 = new 안울음아이템();
	}

}

interface 아이템 {
	public void 작동(String 종류);
}

interface 비행아이템 extends 아이템 {
}

class 날수있는비행아이템 implements 비행아이템 {
	@Override
	public void 작동(String 종류) {
		System.out.println(종류 + " : 날개로 날아갑니다.");
	}
}

class 날수없는비행아이템 implements 비행아이템 {

	@Override
	public void 작동(String 종류) {
		System.out.println(종류 + " : " + "저는 날 수 없어요. ㅠㅠ");
	}
}

class 로켓날개비행아이템 implements 비행아이템 {

	@Override
	public void 작동(String 종류) {
		System.out.println(종류 + " : " + "로켓파워로 날아갑니다!!");
	}
}

interface 울음아이템 extends 아이템 {
}

class 꽥울음아이템 implements 울음아이템 {

	@Override
	public void 작동(String 종류) {
		System.out.println(종류 + " : " + "꽥꽥!!");
	}
}

class 삑울음아이템 implements 울음아이템 {

	@Override
	public void 작동(String 종류) {
		System.out.println(종류 + " : " + "삑!삑!");
	}
}

class Peek울음아이템 implements 울음아이템 {

	@Override
	public void 작동(String 종류) {
		System.out.println(종류 + " : " + "Peek!Peek!");
	}
}

class 안울음아이템 implements 울음아이템 {
	@Override
	public void 작동(String 종류) {
		System.out.println(종류 + " : " + "기계는 울 수 없어요");
	}
}




