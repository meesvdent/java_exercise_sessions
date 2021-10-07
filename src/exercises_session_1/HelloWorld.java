package exercises_session_1;

public class HelloWorld {

    // declare variables
    String message;

    public HelloWorld(){
        message = "Hello World!";
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.message);
    }

}
