package hiding;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date = new MyDate();
		
		/*date.day = 100;
		date.month = 70;
		date.year = 2021;*/
		
		date.setYear(2021);
		date.setMonth(1);
		date.setDay(24);
		
		date.showDate();
	}

	
}
