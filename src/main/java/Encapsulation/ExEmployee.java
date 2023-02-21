package Encapsulation;

public class ExEmployee {

    private String employeeID="Initial Name";
    private int salary;

    public void GetEmployeeID(){
        System.out.println("Read Employee ID is: " + employeeID);
    }

    public void SetEmployeeID(String inEmployeeID){
        employeeID = inEmployeeID;
        System.out.println("Employee ID is now set as: " + employeeID);
    }

}
