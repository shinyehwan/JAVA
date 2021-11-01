package loopexample;

public class BreakContinueTest {

	public static void main(String[] args) {

		int dan;
		int count;
		
		for ( dan = 2; dan <= 9; dan++) {
			
			if( (dan % 2) != 0) continue; // 1번째
			
			for(count = 1; count <= 9; count++) {
				
				if ( count > dan) break; // 2번째
				System.out.println(dan + "X" + count + "=" + dan * count);
				
			}
			System.out.println();
		}
	}

}
