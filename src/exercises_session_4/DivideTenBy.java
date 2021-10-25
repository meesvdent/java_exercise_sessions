package exercises_session_4;

import java.lang.Math;

public class DivideTenBy {

    public static void main(String[] args){
        int[]  myArray = {2,6,8,1,9,0,10,23,7,5,3};

        for (int j : myArray) {
            int divided = 0;

            System.out.println("Number: " + j);
            if(j%2 == 0) {
                try {
                    divided = 10/j;
                } catch (ArithmeticException ae) {
                    System.out.println("You divided by zero!");
                    continue;
                }
                System.out.println(divided);
            } else {
                System.out.println("This number is odd.");
            }
        }
    }
}
