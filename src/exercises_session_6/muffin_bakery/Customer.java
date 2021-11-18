package exercises_session_6.muffin_bakery;

import java.util.ArrayList;

public class Customer {

    private final String name;
    ArrayList<Order> orders;

    public Customer(String name){
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order){
        this.orders.add(order);
    }

    public ArrayList<Order> getOrders(){
        return this.orders;
    }

}
