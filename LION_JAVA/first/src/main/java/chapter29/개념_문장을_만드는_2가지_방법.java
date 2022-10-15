package chapter29;
// 개념 : 문장을 만드는 2가지 방법

class 개념_문장을_만드는_2가지_방법 {
    public static void main(String[] args) {
        String s1 = "카";
        String s2 = new String("카");

		/*
		만약,
		String s1 = "카"; // 처음에서는 객체를 만듬
		String s2 = "카"; // 문장절약 방식으로 객체 하나를 바라본다.
		System.out.println(s1 == s2);

		true가 나온다.
		새 객체가 아니라 재활용한 것이다.
		정석대로 위의 내용처럼 만들면 재활용 모드는 꺼진다.
		*/

        System.out.println(s1 == s2);

    }
}


