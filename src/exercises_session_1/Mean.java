package exercises_session_1;

public class Mean {
    public static void main(String[] args) {

        double meanFloat;
        double floatOne = 1;
        double floatTwo = 2;
        double floatThree = 7;

        int meanInt;

        meanFloat = (floatOne + floatTwo + floatThree) / 3 ;
        meanInt = (int) meanFloat;

        System.out.println(meanFloat);
        System.out.println(meanInt);
    }
}
