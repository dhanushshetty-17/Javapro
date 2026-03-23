class StudentDetails{

    int stno = 011;
    String stname = "Dhanush Shetty";
    int stsem = 5;
    float stpercent = 94.25f;

    public void getStudentDetails(){

        System.out.println("Student Details : ");
        System.out.println("---------------------------");
        System.out.println("Student ID : "+stno);
        System.out.println("Student name : "+stname);
        System.out.println("SEM : "+stsem);
        System.out.println("PERCENTAGE : "+stpercent);
    }
}

public class Student{
    public static void main(String[] args) {

        StudentDetails sd = new StudentDetails();
        sd.getStudentDetails();
    }
}