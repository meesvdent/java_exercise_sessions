package exercises_session_4;

public class NotSoSmartCity {
    private String[] inhabitantNames;
    private double totalAmountOfMoney;
    private String name;
    private int nbInhabitants = inhabitantNames.length;

    public NotSoSmartCity(String name, double totalAmountOfMoney, String[] inhabitantNames){
        this.name = name;
        this.totalAmountOfMoney = totalAmountOfMoney;
        this.inhabitantNames = inhabitantNames;
    }

    public void printCityNameForEachInhabitant(){
        for(int i = nbInhabitants; i!=0;i--){
            System.out.println(this.name);
        }
    }

    public double getAverageAmountOfMoney(){
        return totalAmountOfMoney/nbInhabitants;
    }


    public static String babyNameGenerator(String beginning, int lettersToAdd){
        if(0 == lettersToAdd){
            return beginning;
        }
        else{
            return babyNameGenerator(beginning+getRandomLetter(), lettersToAdd -1);
        }
    }

    private static char getRandomLetter(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return alphabet.charAt((int) (Math.random()*alphabet.length()));
    }

    public void printInhabitantNames(){
        for(int i=0; i < nbInhabitants; i++){
            System.out.println(inhabitantNames[i]);
        }
    }

    public static void main(String[] args){
        String[] namesLengthThree = {"1", "2", "3"};
        NotSoSmartCity outOfBound = new NotSoSmartCity("name",14, namesLengthThree);
        try{
            outOfBound.printInhabitantNames();
        } catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("out of bounds");
        }

        try{
            String babyName = babyNameGenerator("This is gonna be long", 999999999);
        }catch (StackOverflowError so){
            System.out.println("stack overflow");
        }

        NotSoSmartCity nullPointer = new NotSoSmartCity("name", 10, null);

        try{
            nullPointer.printInhabitantNames();
        } catch(NullPointerException np){
            System.out.println("null pointer");
        }
    }

}
