package exercises_session_3;

public class Employee {

    String employeeType;
    int compYears;

    public Employee(String empEmpType, int empCompYears){
        employeeType = empEmpType;
        compYears = empCompYears;
    }

    public float calculateWage(){

        float baseWage = 1000;

        switch(employeeType){
            case "CLERK":
                baseWage = 1000;
                break;
            case "MIDLEVELMANAGER":
                baseWage = 2000;
                break;
            case "CIO":
                baseWage = 3000;
                break;
            case "CFO":
                baseWage = 3000;
                break;
            case "CEO":
                baseWage = 5000;
                break;
        }

        float wage = baseWage * (compYears * 0.1F);
        return wage;
    }

    public static void main(String[] args) {
        Employee testEmployee = new Employee("CFO", 15);
        Employee testEmployeeTwo = new Employee("CLERK", 1);

        System.out.println(testEmployee.calculateWage());
        System.out.println(testEmployeeTwo.calculateWage());
    }
}
