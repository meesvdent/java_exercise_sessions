package exercises_session_4;

import java.util.Scanner;

public class BMICalculator {
    // Main method
    public static void main(String[] args){
        // declare variables
        double weight;
        double height;
        // set variables
        weight = askDouble();
        height = askDouble();
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

    public static double askDouble(){
        double askDouble;
        Scanner scan = new Scanner(System.in);
        askDouble = scan.nextDouble();

        return askDouble;
    }

}
