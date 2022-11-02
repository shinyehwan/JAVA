package chapter27;

//code.oa.gg/java8/988

// 문제 : a와 b와 c를 저장하는 char 배열을 만들어주세요.[정답]

class 문자_a_b_c가_저장_되는_캐릭터_배열을_만들어주세요 {
	public static void main(String[] args) {
		char[] chars = new char[3];
		chars[0] = 'a';
		chars[1] = 'b';
		chars[2] = 'c';

		for ( int i = 0; i < chars.length; i++ ) {
			System.out.println(chars[i]);
		}
	}
}
