package exercises_session_6.muffin_bakery;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MuffinBakery {

    public static String readPrices(String filename){
        String header = "empty";
        try(Scanner scan = new Scanner(new FileReader(filename));){
            header = scan.nextLine();
            System.out.println(header);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return header;
    }

    public static void main(String[] args) {
        System.out.println(readPrices("src/exercises_session_6/muffin_bakery/prices.txt"));
    }
}
