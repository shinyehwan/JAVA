package chapter27_배열2;


class 배열의한계와_ArrayList {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a.get(0) + a.get(1));
	}
}

class ArrayList {
	int[] arr;
	int size;

	ArrayList() {
		arr = new int[3];
		size = 0;
	}

	public void add(int data) {
		arr[size] = data;
		size++;
	}

	public int get(int index) {
		return arr[index];
	}
}
