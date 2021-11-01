package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		int i =1000;
		byte bNum =(byte)i;
		System.out.println(bNum);
		
		double dNum1 = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum1+(int)fNum; // 1 + 0
		int iNum2 = (int)(dNum1+fNum);  // 1.2 + 0.9
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
	
	
	}

}
