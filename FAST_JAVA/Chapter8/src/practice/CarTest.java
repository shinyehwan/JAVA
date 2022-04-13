package practice;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Sonata());
        carList.add(new Genesis());
        carList.add(new Grandeur());
        carList.add(new Avante());
        
        for(Car car : carList){
            car.run();
            System.out.println("=============");
        }
    }
}
