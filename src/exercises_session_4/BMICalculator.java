package exercises_session_4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class BMICalculator {
    // Main method
    public static void main(String[] args) {
        // declare variables
        double weight, height, BMI;
        boolean BMIUnassigned;
        // set variables
        BMIUnassigned = true;

        while(BMIUnassigned){
            System.out.println("Enter person weight: ");
            weight = inputDouble();
            System.out.println("Enter person height: ");
            height = inputDouble();
            // calculate BMI
            BMI = calculateBMI(weight, height);
            BMIUnassigned = false;
            // print to screen
            System.out.println("Your BMI is " + BMI + ".");
        }
    }

    // method calculating BMI
    public static double calculateBMI(double weight,double height)throws ArithmeticException{
        if(weight <= 0 | weight > 1000){
            throw new ArithmeticException();
        } else if(height <= 0 | height > 4){
            throw new ArithmeticException();
        } else{
            double BMI;
            BMI = weight/(height*height);
            return BMI;
        }
    }

    public static double inputDouble() throws InputMismatchException{
        double input_double;
        try{
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            input_double = scan.nextDouble();
            return input_double;
        } catch(InputMismatchException im){
            System.out.println("Arguments for weight and height should be double!");
            input_double = inputDouble();
            return input_double;
        }
    }
}
