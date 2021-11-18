package exercises_session_6.muffin_bakery;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class MuffinBakery {

    private ArrayList<Muffin> muffins;
    private ArrayList<Customer> customers = new ArrayList<>();

    public void setMuffins(ArrayList<Muffin> muffins){
        this.muffins = muffins;
    }

    public ArrayList<Muffin> getMuffins(){
        return this.muffins;
    }

    public Integer existsCustomer(String customerName){
        boolean notUnique = false;
        for(int i=0; i<this.customers.size(); i++){
            if(this.customers.get(i).getName().equals(customerName)){
                return i;
            }
        }
        return -1;
    }

    public Customer addCustomer(String customerName){
        Customer addedCustomer;
        Integer i = this.existsCustomer(customerName);
        if(i == -1){
            addedCustomer = new Customer(customerName);
            this.customers.add(addedCustomer);
        }
        else {
            addedCustomer = this.getCustomer(i);
        }
        return addedCustomer;
    }

    public ArrayList<Customer> getCustomers(){
        return this.customers;
    }

    public Customer getCustomer(Integer i){
        return this.customers.get(i);
    }

    public void readPrices(String filename){
        String header = null;
        ArrayList<Muffin> muffins = new ArrayList<>();
        try(Scanner scan = new Scanner(new FileReader(filename))){
            header = scan.nextLine();
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                Scanner lineScan = new Scanner(line).useLocale(Locale.US);
                lineScan.useDelimiter(", ");
                String muffinName = lineScan.next();
                double muffinPrice = lineScan.nextDouble();
                muffins.add(new Muffin(muffinName, muffinPrice));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.setMuffins(muffins);
    }

    public void readOrders(String filename){
        String header = null;
        try(Scanner scan = new Scanner(new FileReader(filename));){
            header = scan.nextLine();
            System.out.println(header);
            while (scan.hasNextLine()){

                // Read next line
                String line = scan.nextLine();
                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(", ");

                // Add current customer or select if already exists
                String name = lineScan.next();
                Customer curCustomer = this.addCustomer(name);

                // Create orders from amounts and add to customer, assumes same order in muffin list and orders
                for(int i=0; i<this.muffins.size(); i++){
                    Integer amount = lineScan.nextInt();
                    curCustomer.addOrder(new Order(this.muffins.get(i), amount));
                    System.out.println(curCustomer.getOrders());
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        MuffinBakery bakery = new MuffinBakery();
        bakery.readPrices("src/exercises_session_6/muffin_bakery/prices.txt");
        bakery.readOrders("src/exercises_session_6/muffin_bakery/orders.txt");
        System.out.println(bakery.getMuffins());
        for(Customer customer : bakery.customers){
            System.out.println("Customer: " + customer.getName());
            for(Order order : customer.getOrders()){
                System.out.println("Muffin type: " + order.getMuffin().getName() + ", amount: " + order.getAmount());
            }
        }
    }
}
