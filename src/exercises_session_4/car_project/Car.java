package exercises_session_4.car_project;

public class Car {

    private String brand;
    private double fuelConsumption;

    // constructor method
    public Car(String br, double fc){
        brand = br;
        fuelConsumption = fc;
    }

    public void setBrand(String b){
        brand = b;
    }

    public void setFuelConsumption(double fc){
        fuelConsumption = fc;
    }

    // methods to return brand and fuelConsumption
    public String getBrand(){
        return brand;
    }

    public double getFuelConsumption(){
        return fuelConsumption;
    }
}
