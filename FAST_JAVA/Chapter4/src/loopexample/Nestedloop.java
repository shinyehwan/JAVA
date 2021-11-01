package loopexample;

public class Nestedloop {

	public static void main(String[] args) {

		
		int dan = 2;
		int count = 1;
		
		/*for( dan = 2; dan <= 9; dan++) {
			
			for(count = 1; count < 10; count++ ) {
				System.out.println(dan + "X" + count + "=" + dan * count);
				
			}
			System.out.println();
		}
		*/
		
		while( dan <= 9) {
			count = 1; // 카운트를 초기화 시켜줘야한다.
			while( count <= 9) {
				System.out.println(dan + "X" + count + "=" + dan * count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}

}
