package chapter31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제 : 사용자에게 5개의 숫자를 받고 배열에 저장해주세요.
// 조건 : 배열에 있는 모든 값을 더한 총합을 출력해주세요.
// 조건 : 개념부분은 파악하고 지운 후 시작해주세요.

class 사용자에게_숫자_5개_입력받고_ArrayList에_저장V2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in(키보드)를 스캔하는 스캐너 객체 생성

		ArrayList al = new ArrayList();

		final int inputCount = 5;

		for ( int i = 0; i < inputCount; i++ ) {
			System.out.print(i + "번째 숫자를 입력해주세요 : ");
			al.add(sc.nextInt());
		}

		int sum = 0;

		for( int i = 0; i < al.size(); i++ ) {
			sum += (int)al.get(i);
		}

		System.out.println("당신이 입력한 숫자들의 총합은 " + sum +  "입니다.");

		System.out.println("== 총합 v2 ==");
		sum = 0;

		sum += (int)al.get(0);
		sum += (int)al.get(1);
		sum += (int)al.get(2);
		sum += (int)al.get(3);
		sum += (int)al.get(4);

		System.out.println("당신이 입력한 숫자들의 총합은 " + sum +  "입니다.");

		System.out.println("== 총합 v3 ==");
		sum = (int)al.get(0) + (int)al.get(1) + (int)al.get(2) + (int)al.get(3) + (int)al.get(4);

		System.out.println("당신이 입력한 숫자들의 총합은 " + sum +  "입니다.");
	}
}

class ArrayList {
	private Object[] datas;
	private int lastIndex;

	public ArrayList() {
		datas = new Object[3]; // 이 부분은 수정할 수 없습니다.
		lastIndex = -1;
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