package exercises_session_4;

public class BMICalculator {
    // Main method
    public static void main(String[] args){
        // declare variables
        double weight = 60;
        double height = 1.70;
        // calculate BMI
        double BMI = calculateBMI(weight,height);
        // print to screen
        System.out.println("Your BMI is " + BMI + ".");
    }

    // method calculating BMI
    public static double calculateBMI(double weight,double height){
        double BMI;
        BMI = weight/(height*height);
        return BMI;
    }

}
