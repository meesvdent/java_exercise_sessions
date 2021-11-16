package exercises_session_6.muffin_bakery;

public class Muffin {
    private final String name;
    private final Double price;

    public Muffin(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public Double getPrice() {
        return price;
    }
}
