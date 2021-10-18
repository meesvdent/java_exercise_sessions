package exercises_session_3;

import java.util.ArrayList;

public class NbFirstPrimes {

    public static ArrayList<Integer> getFirstPrimeWhileLoop(int nbPrimes){
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(2);
        int i = 3;

        while(primeNumbers.size() < nbPrimes){
            boolean isPrime = true;
            int n = 2;
            while(isPrime){
                while(n < i) {
                    if(i % n == 0){
                        isPrime = false;
                    } else {
                        n++;
                        System.out.println("loop 1" + n);
                    }
                }
                primeNumbers.add(i);
                System.out.println(primeNumbers);
                break;
            }
            i++;
            System.out.println("loop 2" + i);
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        System.out.println(NbFirstPrimes.getFirstPrimeWhileLoop(5));
    }
}
