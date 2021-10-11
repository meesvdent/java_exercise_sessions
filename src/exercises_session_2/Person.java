package exercises_session_2;

public class Person {

    // declare variables
    String name;
    int age;
    Person spouse;

    public Person(String personName, int personAge){
        name = personName;
        age = personAge;
        spouse = null;
    }

    // takes two Person instances and sets their isMarried value to true.
    public void marry(Person self, Person other){
        self.spouse = other;
        other.spouse = self;
    }

    public static void main(String[] args){
        Person firstPerson = new Person("name1", 58);
        Person secondPerson = new Person("name2", 24);

        firstPerson.marry(firstPerson, secondPerson);
        System.out.println("Married: " + firstPerson.spouse.name + " " + secondPerson.spouse.name);
    }
}
