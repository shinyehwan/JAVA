package chapter33;

//code.oa.gg/java8/1130
class HashMapV3 {
	public static void main(String[] args) {
		HashMap aMap = new HashMap();

		aMap.put(1, "안녕");
		aMap.put("A", false);
		aMap.put("A", true);

		System.out.println(aMap.get("A"));
		// 출력 : false
	}
}

class HashMap {
	Object[] values;
	Object[] keys;
	int lastIndex;

	HashMap() {
		values = new Object[100];
		keys = new Object[100];
		lastIndex  = -1;
	}

	void put(Object key, Object value) {
		int foundKey = getFoundKey(key);

		if (foundKey == -1) {
			lastIndex++;
			keys[lastIndex] = key;
			values[lastIndex] = value;
		} else {
			values[foundKey] = value;
		}
	}

	Object get(Object key) {
		Object value = null;

		int foundKey = getFoundKey(key);

		if ( foundKey != -1 ) {
			value = values[foundKey];
		}

		return value;
	}

	private int getFoundKey(Object key) {
		int foundKey = -1;

		// 입력받은 key와 일치하는 값이 있는지 keys 배열에서 찾아본다.
		for ( int i = 0; i <= lastIndex; i++ ) {
			// 객체 비교를 통해서 같다고 여겨지는 객체를 찾았다면
			if ( keys[i].equals(key) ) {
				// 찾았다는 표시를 남긴다.
				foundKey = i;
				break;
			}
		}
		return foundKey;
	}
}