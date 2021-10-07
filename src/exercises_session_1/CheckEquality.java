package exercises_session_1;

public class CheckEquality {

    // declare variables
    double[] firstArray, secondArray;
    String[] indexArray;
    boolean[] equalArray;

    public CheckEquality(){

        // initialize arrays
        firstArray = new double[] {0.1, 0.8, 1.4};
        secondArray = new double[] {1.4, 9.1, 1.4};
        indexArray = new String[] {"first", "second", "third"};
        equalArray = new boolean[3];
    }

    public void checkEquality(){
        for (int i=0; i<3; i++){
            equalArray[i] = (firstArray[i] == secondArray[i]);
        }
    }

    public void printResult(){
        for (int i=0; i<3; i++){
            System.out.println("The " + indexArray[i] + " elements of the arrays are equal: " + equalArray[i]);
        }
    }



    public static void main(String[] args){
        CheckEquality oneEqual = new CheckEquality();
        oneEqual.checkEquality();

        // print results
        oneEqual.printResult();

    }
}
