package exercises_session_6;

import java.util.Locale;
import java.util.Scanner;

public class BMIProject {
    public static void main(String [] args){
        // declare variables
        String name = new String();
        double weight = 60;
        double height = 1.70;
        double BMI;

        // Ask the user for inputs
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name");
        name = scan.nextLine();
        System.out.println("Please enter weight [kg]");
        weight = scan.nextDouble();
        System.out.println("Please enter height [m]");
        height = scan.nextDouble();

        // calculate BMI
        BMI = calculateBMI(weight,height);

        // Here: Commands formatting the output and print to screen
        Locale.setDefault(Locale.US);
        System.out.format("%s weighs %2.1f and is %2.1f m tall. %nThe BMI is %2.3f.%n", name, weight, height, BMI);
    }

    // method calculating BMI
    public static double calculateBMI(double w,double h){
        double BMI;
        BMI = w/(h*h);
        return BMI;
    }

}
