package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalColar = 'A';
		
		switch(rank) {
			case 1 : medalColar = 'G';
				System.out.println("금메달");
				break; //break를 반드시 넣어 놓아야한다.
			case 2 : medalColar = 'S';
				System.out.println("은메달");
				break;
			case 3 : medalColar = 'B';
				System.out.println("동메달");
				break;
			//default : medalColar = 'A';
			
		}
		System.out.println(rank + "등은 " + medalColar + "메달입니다.");
		
	}

	
}
