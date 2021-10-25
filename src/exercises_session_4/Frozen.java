package exercises_session_4;

public class Frozen {

    public static void main (String [] args){

    int [] clientId = {1,2,3,4,5};
    String [] clientName = {"Anna", "Elsa", "Olaf", "Hans", "Kristoff"};
    double [] accountBalance = {1000, 5000, 9, 55, 23};

    for(int i = 1; i<=5; i++) {
        try{
            System.out.println(clientName[i]+" has "+accountBalance[i]+" dollars. \n");
        } catch(Exception exc){
            System.out.println("index out of bounds");
            break;
        }
    }
}

}
