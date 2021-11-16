package exercises_session_6;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileAverage {

    public static void main(String[] args) throws IOException {
        String fileName = "src/exercises_session_6/number_input.txt";
        ArrayList<Double> doubleArrayList = new ArrayList<>();

        System.out.println("Relative path to file: " + fileName);
        try(Scanner inPut = new Scanner(new FileReader(fileName));){
            while(inPut.hasNext())
            {
                try {
                    doubleArrayList.add(inPut.nextDouble());
                } catch (InputMismatchException mismatch) {
                    System.out.println("Invalid entry in file, stop reading from file.");
                    break;
                }
            }
            double total = 0;
            for(double curDouble : doubleArrayList){
                total = total + curDouble;
            }
            double average = total / doubleArrayList.size();
            System.out.println("The average is " + average + ".");
        } catch (FileNotFoundException e) {
            //also catches fileName permission issues
            System.out.println("File Not Found");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.exit(0);
        }
    }
}
