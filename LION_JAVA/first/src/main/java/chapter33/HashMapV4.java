package chapter33;

import java.util.HashSet;
import java.util.Set;

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : ages객체 put 메서드는 인자로 String, Integer 만 입력가능해야 합니다.
// 조건 : ages객체의 get 메서드는 Integer 를 리턴해야 합니다.
// 조건 : everyone객체 put 메서드는 인자로 String, Object 만 입력가능해야 합니다.
// 조건 : everyone객체의 get 메서드는 Object 를 리턴해야 합니다.
class HashMapV4 {
	public static void main(String[] args) {
		HashMap<String, Integer> ages = new HashMap<>();
		ages.put("영희", 22);
		ages.put("철수", 23);
		ages.put("민서", 25);
		ages.put("철수", 27);

		ages.remove("영희");
		ages.put("광수", 27);

		for ( String name : ages.keySet() ) {
			System.out.println("이름 : " + name + ", 나이 : " + ages.get(name));
		}
		/* 출력결과 */
		// 이름 : 철수, 나이 : 27
		// 이름 : 민서, 나이 : 25
		// 이름 : 광수, 나이 : 27
		HashMap<String, Object> everyone = new HashMap<>();
		everyone.put("사람", new 사람());
		everyone.put("원숭이", new 원숭이());
		((사람)everyone.get("사람")).말하다();
		// 출력 => 사람이 말합니다.
		((원숭이)everyone.get("원숭이")).묘기를_부리다();
		// 출력 => 원숭이가 묘기를 부립니다.
	}
}

class HashMap<K, V> {

	private Object[] keys;
	private Object[] values;
	private int lastIndex;

	HashMap() {
		keys = new Object[1];
		values = new Object[1];
		lastIndex = -1;
	}



	public void put(K key, V value) {
		if (isFull()) {
			extendArraySize();
		}

		int foundKeyIndex = getFoundKeyIndex(key);

		if (foundKeyIndex == -1) {
			lastIndex++;
			keys[lastIndex] = key;
			values[lastIndex] = value;
		} else {
			values[foundKeyIndex] = value;
		}
	}

	private boolean isFull() {
		if (lastIndex >= keys.length -1) {
			return true;
		}
		return false;
	}
	private void extendArraySize() {
		Object[] newKeysArraySize = new Object[(keys.length * 2)];
		Object[] newValuesArraySize = new Object[(values.length * 2)];

		for (int i = 0; i <= lastIndex; i++) {
			newKeysArraySize[i] = keys[i];
			newValuesArraySize[i] = values[i];
		}

		keys = newKeysArraySize;
		values = newValuesArraySize;
	}

	private int getFoundKeyIndex(K key) {
		int foundKeyIndex = -1;
		for (int i = 0; i <= lastIndex; i++) {
			if (keys[i].equals(key)) {
				foundKeyIndex = i;
				break;
			}
		}
		return foundKeyIndex;
	}

	public void remove(K key) {
		int foundKeyIndex = getFoundKeyIndex(key);

		if (foundKeyIndex == -1) {
			System.out.println("제거 할 것이 없습니다.");
		}

		for (int i = foundKeyIndex; i < lastIndex; i++) {
			keys[i] = keys[i + 1];
			values[i] = values[i + 1];
		}
		lastIndex--;

	}

	public V get(K key) {
		int foundKeyIndex = getFoundKeyIndex(key);
		if (foundKeyIndex != -1) {
			Object value = values[foundKeyIndex];
			return (V)value;
		}
		return null;
	}

	Set<K> keySet() {
		Set<K> keySet = new HashSet<>();

		for ( int i = 0; i <= lastIndex; i++ ) {
			keySet.add((K)keys[i]);
		}
		return keySet;
	}
}

class 사람 {
	void 말하다() {
		System.out.println("사람이 말합니다.");
	}
}

class 원숭이 {
	void 묘기를_부리다() {
		System.out.println("원숭이가 묘기를 부립니다.");
	}

}