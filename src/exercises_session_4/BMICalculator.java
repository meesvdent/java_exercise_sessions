package exercises_session_4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class BMICalculator {
    // Main method
    public static void main(String[] args){
        // declare variables
        // set variables
        try{
            System.out.println("Enter person weight: ");
            double weight = inputDouble();
            System.out.println("Enter person height: ");
            double height = inputDouble();
            // calculate BMI
            double BMI = calculateBMI(weight, height);
            // print to screen
            System.out.println("Your BMI is " + BMI + ".");
        } catch(InputMismatchException im){
            System.out.println("Arguments for weight and height should be double!");
            main(null);
        }
    }

    // method calculating BMI
    public static double calculateBMI(double weight,double height){
        double BMI;
        BMI = weight/(height*height);
        return BMI;
    }

    public static double inputDouble(){
        double input_double;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        input_double = scan.nextDouble();
        return input_double;
    }
}
