package chapter26_형변환2;

//code.oa.gg/java8/984
// 문제 : 아래와 같이 출력되도록 `저장소` 클래스를 만들어보세요. 필요하다면 다른 클래스도 만들어보세요. 필요하다면 main 메서드도 수정해주세요. 오토박싱/언박싱을 사용해주세요.[정답]

class 다양한_데이터를_저장할_수_있는_저장소_클래스를_구현_Object클래스_범용데이터_저장소 {
	public static void main(String[] args) {
		저장소 a저장소 = new 저장소();

		Integer iObj = 10;
		a저장소.저장(iObj);
		iObj = (Integer)a저장소.주세요();
		int i = iObj.intValue();
		System.out.println(i);
		// 출력 10

		a저장소.저장(10);
		iObj = (Integer)a저장소.주세요();
		i = iObj.intValue();
		System.out.println(i);
		// 출력 10

		a저장소.저장(10);
		iObj = (Integer)a저장소.주세요();
		i = iObj;
		System.out.println(i);
		// 출력 10

		a저장소.저장(10);
		iObj = (Integer)a저장소.주세요(); // 이 녀석이 리턴하는 것은 Object 형 리모콘 이지만 그것을 Integer 리모콘화 하겠습니다.
		System.out.println(iObj + 10 - 10);
		// 출력 10

		a저장소.저장(10);
		i = (int)a저장소.주세요(); // 이 녀석이 리턴하는 것은 Object 형 리모콘 이지만 그것을 Integer 리모콘화 하겠습니다. 그리고 Integer 리모콘은 오토언박싱법칙에 의해서 int로도 자유롭게 전환이 되기 때문에 이 코드도 작동합니다.
		System.out.println(i);
		// 출력 10

		사람 a사람1 = new 사람();
		a저장소.저장(a사람1);
		a사람1 = (사람)a저장소.주세요();
		a사람1.걷다();
		// 사람이 걷습니다.
	}
}
class 저장소 {
	Object data;
	public void 저장(Object o) {
		this.data = o;
	}

	public Object 주세요() {
		return data;
	}
}
class 사람 {
	public void 걷다() {
		System.out.println("사람이 걷습니다.");
	}
}

