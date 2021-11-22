package exercises_session_7.BMICalculator;

public class BMICalculator {

    private final double weight;
    private final double height;
    private double BMI;

    public double getBMI(){
        return this.BMI;
    }

    public BMICalculator(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public void calculateBmi(){
        this.BMI = this.weight / (this.height * this.height);
    }
}
