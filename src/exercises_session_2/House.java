package exercises_session_2;

public class House {

    static int maxInhabitants;
    Person[] inhabitants;

    public House(int houseMaxInhabitants, Person[] houseInhabitants){
        maxInhabitants = houseMaxInhabitants;
        inhabitants = houseInhabitants;
    }

    public void assessLivingConditions(){
        if(inhabitants.length < maxInhabitants){
            System.out.println("There is still room in the house");
        }
        else if(inhabitants.length == maxInhabitants){
            System.out.println("The house is full");
        }
        else if(inhabitants.length > maxInhabitants){
            System.out.println("There are too many people living in this house!");
        }
    }

    public static void main(String[] args){
        Person firstPerson = new Person("name1", 58);
        Person secondPerson = new Person("name2", 24);
        Person[] personArray = {firstPerson, secondPerson};

        House firstHouse = new House(1, personArray);

        firstHouse.assessLivingConditions();
    }
}
