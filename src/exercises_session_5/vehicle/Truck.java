package exercises_session_5.vehicle;

public class Truck extends Vehicle{

    private double maxPayload;

    public Truck(double topSpeed, double mass, double maxPayload) {
        super(topSpeed, mass);
        this.maxPayload = maxPayload;
    }

    @Override
    public double calculateValue(){
        double old = super.calculateValue();
        return old * (this.maxPayload / 1000);
    }

    public double getMaxPayload(){
        return this.maxPayload;
    }

    public void setMaxPayload(double newMaxPayload){
        this.maxPayload = newMaxPayload;
    }
}
