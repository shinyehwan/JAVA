package chapter33;

//code.oa.gg/java8/1127
class HashMapV2 {
	public static void main(String[] args) {
		HashMap aMap = new HashMap();

		aMap.put(1, "안녕");
		aMap.put("A", false);

		System.out.println(aMap.get("A"));
		// 출력 : false
	}
}

class HashMap {
	Object[] keys;
	Object[] values;
	int lastIndex;
	HashMap() {
		keys = new Object[100];
		values = new Object[100];
		lastIndex = -1;
	}

	public void put(Object key, Object value) {
		lastIndex++;
		keys[lastIndex] = key;
		values[lastIndex] = value;
	}

	public Object get(Object key) {
		int foundKey = -1;
		Object value = null;

		for (int i = 0; i <= lastIndex; i++) {
			if (keys[i].equals(key)) {
				foundKey = i;
				break;
			}
		}

		if (foundKey != -1) {
			value = values[foundKey];
		}

		return value;
	}
}


