import java.util.Scanner;
public class Date{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Date : ");
		int num = sc.nextInt();

		if(num <= 31 ){
			System.out.println("Date is valid  ");
		}
		else{
			System.out.println("Date is not valid ");
		}
	}
}