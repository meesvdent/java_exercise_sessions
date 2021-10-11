package exercises_session_2;

public class Company {

    // variable decleration
    String companyName, location;
    static String compareLocation = "Belgium";

    public Company(String companyCompanyName, String companyLocation){
        // constructor method
        companyName = companyCompanyName;
        location = companyLocation;
    }

    // function which returns whether location is equal to belgium
    boolean isBelgian(){
        return location.equals(compareLocation);
    }

    public static void main(String[] args){
        Company microsoft = new Company("Microsoft", "US");
        Company jansen = new Company("Jansen", "Belgium");

        System.out.println(microsoft.isBelgian());
        System.out.println(jansen.isBelgian());
    }
}
