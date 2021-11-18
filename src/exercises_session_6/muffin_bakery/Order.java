package exercises_session_6.muffin_bakery;

public class Order {

    private final Muffin muffin;
    private final Integer amount;

    public Order(Muffin muffin, Integer amount){
        this.muffin = muffin;
        this.amount = amount;
    }

    public Muffin getMuffin() {
        return muffin;
    }

    public Integer getAmount() {
        return amount;
    }
}
