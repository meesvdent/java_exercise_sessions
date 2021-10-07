package exercises_session_1;

public class ChangeToFahrenheit {

    public static void main(String[] args) {
        // An application that converts 37 degrees Celsius to Fahrenheit.
        double celsius = 37; // Celsius
        double a = 1.8;
        double b = 32;
        double fahrenheit; // Fahrenheit

        fahrenheit =  (celsius*a)+b;

        System.out.println(celsius + " degrees celsius equal "+ fahrenheit + " degrees Fahrenheit.");
    }
}
