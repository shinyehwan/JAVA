package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalColar = 'A';
		
		switch(rank) {
			case 1 : medalColar = 'G';
				System.out.println("�ݸ޴�");
				break; //break�� �ݵ�� �־� ���ƾ��Ѵ�.
			case 2 : medalColar = 'S';
				System.out.println("���޴�");
				break;
			case 3 : medalColar = 'B';
				System.out.println("���޴�");
				break;
			//default : medalColar = 'A';
			
		}
		System.out.println(rank + "���� " + medalColar + "�޴��Դϴ�.");
		
	}

	
}
