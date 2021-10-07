package exercises_session_1;

public class ChangeUnit {

    // define variables
    static double a = 1.8;
    static double b = 32;

    public static double changeToFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = (celsius*a)+b;
        return fahrenheit;
    }

    public static double changeToCelsius(double fahrenheit) {
        double celsius;
        celsius = (fahrenheit-b)/a;
        return celsius;
    }

    public static void main(String[] args) {
        // An application that converts 37 degrees Celsius to Fahrenheit.
        double celsius; // Celsius
        double fahrenheit; // Fahrenheit

        celsius = 37.5;

        fahrenheit = changeToFahrenheit(celsius);
        celsius = changeToCelsius(fahrenheit);

        System.out.println(celsius + " degrees celsius equal "+ fahrenheit + " degrees Fahrenheit.");

    }
}
