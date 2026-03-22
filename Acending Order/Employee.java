class EmployeeDetails{

    int eno = 12;
    String ename = "Dhanush Shetty";
    String eaddr = "Banglore";
    float esalary = 90000.0f;

    public void getEmployeeDeatils(){
        System.out.println("Employee details:");
        System.out.println("------------------------------");
        System.out.println("Employee Number : "+eno);
        System.out.println("Employee Name : "+ename);
        System.out.println("Employee Address : "+eaddr);
        System.out.println("Employee Salary : "+esalary);
    }

}

public class Employee{
    public static void main(String[] args){
        EmployeeDetails emp = new EmployeeDetails();
        emp.getEmployeeDeatils();
    }
}