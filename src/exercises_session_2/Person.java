package exercises_session_2;

public class Person {

    // declare variables
    String name;
    int age;
    boolean isMarried;

    public Person(String personName, int personAge, boolean personIsMarried){
        name = personName;
        age = personAge;
        isMarried = personIsMarried;
    }

    // takes two Person instances and sets their isMarried value to true.
    public void marry(Person personOne, Person personTwo){
        personOne.isMarried = true;
        personTwo.isMarried = true;
    }

    public static void main(String[] args){
        Person firstPerson = new Person("name1", 58, false);
        Person secondPerson = new Person("name2", 24, false);

        System.out.println("Married: " + firstPerson.isMarried + " " + secondPerson.isMarried);
        firstPerson.marry(firstPerson, secondPerson);
        System.out.println("Married: " + firstPerson.isMarried + " " + secondPerson.isMarried);
    }
}
