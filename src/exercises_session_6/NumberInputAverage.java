package exercises_session_6;

import java.io.IOError;
import java.io.IOException;
import java.util.*;

public class NumberInputAverage {

    public static void main(String[] args) {
        List<Double> inputDoubles = new ArrayList<>();


        try(Scanner scan  = new Scanner(System.in)){
            scan.useLocale(Locale.US);
            System.out.print("Enter an integer: ");
            double nextDouble = scan.nextDouble();
            while (nextDouble != 0){
                System.out.printf("%nEnter another integer or close with 0: ");
                inputDoubles.add(nextDouble);
                nextDouble = scan.nextDouble();
            }

            double total = 0;
            for(double i : inputDoubles){
                total = total + i;
            }
            double average = (double) total / (double) inputDoubles.size();

            System.out.println("The average of input integers is: " + average);

        } catch (InputMismatchException e){
            e.printStackTrace();
        }



    }
}
