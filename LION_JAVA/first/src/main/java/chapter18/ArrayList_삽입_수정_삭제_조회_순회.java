package chapter18;

import java.util.ArrayList;
import java.util.List;

class ArrayList_삽입_수정_삭제_조회_순회 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); // 추가
        list.add(20);
        list.add(30);
        list.set(0, 50); // 0번 인덱스 데이터 교체
        System.out.println(list);
        list.remove(1); // 1번 인덱스 제거
        System.out.println(list);
        list.remove(new Integer(50)); // 50 삭제
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0)); // 30

        list.add(2000);
        list.add(3000);

        list.add(200);
        list.add(300);

        System.out.println("== 순회 v1 ==");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("== 순회 v2 ==");
        for (int num : list) {
            System.out.println(num);

        }

    }
}