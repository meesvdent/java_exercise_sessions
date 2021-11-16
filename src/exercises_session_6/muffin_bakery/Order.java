package exercises_session_6.muffin_bakery;

public class Order {

    private final Customer customer;
    private final Muffin muffin;
    private final Integer amount;

    public Order(Customer customer, Muffin muffin, Integer amount){
        this.customer = customer;
        this.muffin = muffin;
        this.amount = amount;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public Muffin getMuffin() {
        return muffin;
    }

    public Integer getAmount() {
        return amount;
    }
}
