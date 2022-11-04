package chapter32;

//code.oa.gg/java8/1350
// 문제 : 제너릭을 사용해서 중복을 제거해주세요.

class 제너릭을_이용해서_클래스_3개를_1개로_줄여주세요 {
	public static void main(String[] args) {

		저장소<Integer> a저장소1 = new 저장소<>();

		a저장소1.setData(30);
		int a = a저장소1.getData();

		System.out.println(a);

		저장소<Double> a저장소2 = new 저장소<>();

		a저장소2.setData(5.5);
		double b = a저장소2.getData();

		System.out.println(b);


		저장소<사과> a저장소3 = new 저장소<>();

		a저장소3.setData(new 사과());
		사과 c = a저장소3.getData();

		System.out.println(c);

		// Int저장소 a저장소1 = new Int저장소();
		//
		// a저장소1.setData(30);
		// int a = a저장소1.getData();
		//
		// System.out.println(a);
		//
		// Double저장소 a저장소2 = new Double저장소();
		//
		// a저장소2.setData(5.5);
		// double b = a저장소2.getData();
		//
		// System.out.println(b);
		//
		// 사과저장소 a저장소3 = new 사과저장소();
		//
		// a저장소3.setData(new 사과());
		// 사과 c = a저장소3.getData();
		//
		// System.out.println(c);
	}
}

class 저장소<T> {
	Object data;

	T getData() {
		return (T)data;
	}

	void setData(T inputedData) {
		this.data = inputedData;
	}

}

// class Int저장소 {
// 	Object data;
//
// 	int getData() {
// 		return (int)data;
// 	}
//
// 	void setData(Object inputedData) {
// 		this.data = inputedData;
// 	}
// }
//
// class Double저장소 {
// 	Object data;
//
// 	double getData() {
// 		return (double)data;
// 	}
//
// 	void setData(Object inputedData) {
// 		this.data = inputedData;
// 	}
// }

class 사과 {
}

// class 사과저장소 {
// 	Object data;
//
// 	사과 getData() {
// 		return (사과)data;
// 	}
//
// 	void setData(Object inputedData) {
// 		this.data = inputedData;
// 	}
// }