package chapter33;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

class 개념_리스트와맵 {
	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		ages.add(10); // 영수나이, 키 : 0
		ages.add(15); // 철수나이, 키 : 1
		ages.add(13); // 영희나이, 키 : 2

		System.out.println(ages.get(2));

		Map<String, Integer> ages2 = new LinkedHashMap<>();
		ages2.put("철수", 15); // 철수나이, 키 : 철수
		ages2.put("영수", 10); // 영수나이, 키 : 영수
		ages2.put("영희", 13); // 영희나이, 키 : 영희

		for (String 이름 : ages2.keySet()) {
			System.out.println(이름 + " : " + ages2.get(이름));

		}
	}
}




