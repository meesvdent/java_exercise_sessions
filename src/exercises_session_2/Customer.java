package exercises_session_2;

public class Customer {
    //The name of the customer
    String name;
    //The age of the customer
    int age;
    // adultAge is the age at which a customer is an adult;
    // it is a class variable because it is the same for all class instances;
    // it is a static variable, because we should not be able to change it after initialization.
    final static int adultAge = 18;
    // isMarried is a private variable because it is not available from outside off the class.
    private boolean isMarried;

    public Customer(String customerName, int customerAge, boolean customerIsMarried){
        // constructor function has specific syntax
        // by defining public Class, the constructor function can be modified
        // this function does not need to return anything, as this is already defined by the constructor method
        name = customerName;
        age = customerAge;
        isMarried = customerIsMarried;
    }

    public boolean isAdult(){
        boolean isAdult;
        if(age < adultAge){
            isAdult = false;
        } else{
            isAdult = true;
        }

        return isAdult;
    }

    public static void main(String[] args){
        Customer myFirstCustomer;
        myFirstCustomer = new Customer("Maria", 19, false);

        System.out.println(myFirstCustomer.name);
        System.out.println(myFirstCustomer.isAdult());
    }
}
