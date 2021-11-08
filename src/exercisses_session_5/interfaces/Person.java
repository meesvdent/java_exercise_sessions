package exercisses_session_5.interfaces;

public class Person implements CanSing, PersonalizedPrint{

    String name;
    String gender;

    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public void sing(){
        System.out.println("then a shear drop");
    }

    public String prettyPrint(){
        return "********$$$$$*******************PERSON: "+this.name+"  GENDER: "+this.gender+"**********$$$$$*****************";
    }

    public static void main(String[] args) {
        Person newPerson = new Person("Mees", "male");
        newPerson.sing();
        System.out.println(newPerson.prettyPrint());
    }
}
