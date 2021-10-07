package exercises_session_1;

public class PrintNames {

    // declare variables
    String[] nameArray, countArray;

    public PrintNames(){

        // Initialize array
        nameArray = new String[5];
        countArray = new String[5];

        // Fill array with variables
        nameArray[0] = "John";
        nameArray[1] = "Anna";
        nameArray[2] = "Bob";
        nameArray[3] = "Peter";
        nameArray[4] = "Helen";

        countArray[0] = "first";
        countArray[1] = "second";
        countArray[2] = "third";
        countArray[3] = "fourth";
        countArray[4] = "fifth";

    }

    public static void main(String[] args) {

        PrintNames printNames = new PrintNames();

        for (int i = 0; i < 5; i++) {
            System.out.println("The name of the " + printNames.countArray[i] + "person is " + printNames.nameArray[i]);
        }

    }
}
