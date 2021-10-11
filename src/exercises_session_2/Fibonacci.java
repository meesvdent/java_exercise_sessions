package exercises_session_2;

public class Fibonacci {


    public int fib(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args){
        Fibonacci newFib = new Fibonacci();
        System.out.println(newFib.fib(10));
    }
}
