package chapter30;

class ArrayList_총정리 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(true);
		al.add(new 사람());

		int a = (int)al.get(0);
		boolean b = (boolean)al.get(1);
		사람 c = (사람)al.get(2);
	}
}

class ArrayList {
	private Object[] datas;
	private int lastIndex;

	public ArrayList() {
		datas = new Object[3]; // 이 부분은 수정할 수 없습니다.
		lastIndex = -1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for ( int i = 0; i <= lastIndex; i++ ) {
			sb.append(i + ",");
		}

		return sb.toString();
	}

	private void sizeUpDatas() {
		// 기존에 연결된 업체 버리고
		// 더욱 더 큰 새 업체를 datas에 연결
		Object[] newDatas = new Object[datas.length * 2];
		// datas => 구 업체를 조종하는 리코몬
		// newDatas = 신 업체를 조종하는 리코몬
		for ( int i = 0; i < datas.length; i++ ) {
			newDatas[i] = datas[i];
		}
		// 업체 새로 계약
		datas = newDatas;
	}
	private void sizeUpDatasIfFull() {
		if ( isFull() ) {
			int oldDatasLength = datas.length;
			sizeUpDatas();
			int newDatasLength = datas.length;
			System.out.println("배열 증가 : " + oldDatasLength + " => " + newDatasLength);
		}
	}

	public void add(Object data) {
		sizeUpDatasIfFull();
		lastIndex++;
		datas[lastIndex] = data;
	}

	public void add(Object data, int index) {
		sizeUpDatasIfFull();

		for ( int i = lastIndex; i >= index; i-- ) {
			datas[i + 1] = datas[i];
		}

		datas[index] = data;
		lastIndex++;
	}

	public Object get(int index) {
		return datas[index];
	}

	private boolean isFull() {
		return lastIndex + 1 == datas.length;
	}

	public int size() {
		return lastIndex + 1;
	}

	public void removeAt(int index) {
		for ( int i = index; i < lastIndex; i++ ) {
			datas[i] = datas[i + 1];
		}
		lastIndex--;
	}

	public void showAllValues() {
		System.out.println("== 전체 데이터 출력 ==");

		for ( int i = 0; i <= lastIndex; i++ ) {
			System.out.println(i + " : " + datas[i]);
		}
	}
}

class 사람 {
}