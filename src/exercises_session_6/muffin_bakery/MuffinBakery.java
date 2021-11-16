package exercises_session_6.muffin_bakery;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MuffinBakery {

    public static ArrayList<Muffin> readPrices(String filename){
        String header = null;
        ArrayList<Muffin> muffins = new ArrayList<>();
        try(Scanner scan = new Scanner(new FileReader(filename));){
            header = scan.nextLine();
            System.out.println(header);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                Scanner lineScan = new Scanner(line).useLocale(Locale.US);
                lineScan.useDelimiter(", ");
                String muffinName = lineScan.next();
                System.out.println("Muffin name: " + muffinName);
                double muffinPrice = lineScan.nextDouble();
                System.out.println("Muffin price: " + muffinPrice);
                muffins.add(new Muffin(muffinName, muffinPrice));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return muffins;
    }

    public static Integer readOrders(String filename){
        String header = null;
        ArrayList<Order> orderArrayList = new ArrayList<>();
        try(Scanner scan = new Scanner(new FileReader(filename));){
            header = scan.nextLine();
            System.out.println(header);
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(", ");
                String name = lineScan.next();
                System.out.println(name);
                String blueberry = lineScan.next();
                System.out.println(blueberry);
                Integer chocolate = lineScan.nextInt();
                Integer velvet = lineScan.nextInt();
                return velvet;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    return 0;
    }



    public static void main(String[] args) {
        ArrayList<Muffin> muffins = readPrices("src/exercises_session_6/muffin_bakery/prices.txt");
        Integer orders = readOrders("src/exercises_session_6/muffin_bakery/orders.txt");
        System.out.println(muffins);
        System.out.println(orders);
    }
}
