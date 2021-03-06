package exercises_session_4.car_project;

import java.util.Scanner;

public class CarProject {

    public static void main(String[] args) {
		// create new instance of car
        Car car1 = new Car("BMW",7);

        // ask user how many miles he wants to drive

        System.out.println("Please enter how many miles you want to drive");
        Scanner scan = new Scanner(System.in);
        double miles = scan.nextDouble();

        // convert the miles to km
        double km = DistanceConverter.convert(miles);

        // calculate the liters fuel needed
        double litersFuel = ( (km/100) * car1.getFuelConsumption() );

        System.out.println("Driving " + miles + " miles with this " +
                car1.getBrand() + " will consume " + litersFuel + " liters fuel.");

        scan.close();
    }

}
