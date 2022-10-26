package chapter39;

class 팩토리_패턴_v2 {
	public static void main(String[] args) {

		오리 a청둥오리 = 오리공장.get오리("청둥오리");
		오리 a흰오리 = 오리공장.get오리("흰오리");
		오리 a고무오리 = 오리공장.get오리("고무오리");
		오리 a고무2오리 = 오리공장.get오리("고무2오리");
		오리 a로봇오리 = 오리공장.get오리("로봇오리");

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

	public void set종류(String 종류) {
		this.종류 = 종류;
	}

	public void set비행아이템(비행아이템 a비행아이템) {
		this.a비행아이템 = a비행아이템;
	}

	public void set울음아이템(울음아이템 a울음아이템) {
		this.a울음아이템 = a울음아이템;
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

class 오리공장 {
	static public 오리 get오리(String 종류) {
		오리 a오리 = new 오리();
		a오리.set종류(종류);

		if (종류.equals("청둥오리") || 종류.equals("흰오리")) {
			a오리.set비행아이템(new 날수있는비행아이템());
			a오리.set울음아이템(new 꽥울음아이템());
		} else if (종류.equals("고무오리")) {
			a오리.set비행아이템(new 날수없는비행아이템());
			a오리.set울음아이템(new 삑울음아이템());
		} else if (종류.equals("고무2오리")) {
			a오리.set비행아이템(new 날수없는비행아이템());
			a오리.set울음아이템(new Peek울음아이템());
		}	else if (종류.equals("로봇오리")) {
			a오리.set비행아이템(new 로켓날개비행아이템());
			a오리.set울음아이템(new 안울음아이템());
		}

		return a오리;
	}
}
