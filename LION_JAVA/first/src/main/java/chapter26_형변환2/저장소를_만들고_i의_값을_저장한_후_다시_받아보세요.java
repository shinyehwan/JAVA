package chapter26_형변환2;

//code.oa.gg/java8/975
// 문제 : 저장소를 만들고 i의 값을 저장한 후 다시 받아보세요.

/**
 * Object i = 20;
 * Object i = new Integer(20);
 * Object i = (Object)new Integer(20);
 */
class 저장소를_만들고_i의_값을_저장한_후_다시_받아보세요 {
	public static void main(String[] args) {
		int i = 10;

		저장소 a저장소 = new 저장소();
		/*Integer iObj = new Integer(i); // 수동 박싱
		a저장소.저장(iObj);
		Object obj = a저장소.주세요();
		iObj = (Integer)obj;
		i = iObj.intValue(); // 수동 언박싱, 다시 숫자화 시킨다.*/

		/*Integer iObj = i; // 오토 박싱
		a저장소.저장(iObj);*/
		// Integer iObj;
		a저장소.저장(i);
		/*Object obj = a저장소.주세요();
		iObj = (Integer)obj;*/
		/*iObj = (Integer)a저장소.주세요();
		i = iObj; // 수동 언박싱, 다시 숫자화 시킨다.*/
		// i = ((Integer)a저장소.주세요()).intValue();
		// i = (Integer)a저장소.주세요();
		i = (int)a저장소.주세요();


		System.out.println(a저장소.주세요());
		// 출력 : 10
	}
}
class 저장소 {
	Object data;
	void 저장(Object o) {
		data = o;
	}
	Object 주세요() {
		return data;
	}
}


