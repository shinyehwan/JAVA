package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas" , 10000);
		Student studentK = new Student("Kim", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
				
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		
		Taxi taxi5578 = new Taxi(5578);
		Taxi taxi1111 = new Taxi(1111);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentK.takeTaxi(taxi1111);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentK.showInfo();

		bus100.showBusInfo();
		bus500.showBusInfo();
		taxi1111.showTaxiInfo();
		
		subwayGreen.showSubwayInfo();
	}

}
