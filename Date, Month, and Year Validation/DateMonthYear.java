import java.util.Scanner;
public class DateMonthYear{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the day : ");
		int day = sc.nextInt();
		if(day > 31 || day <= 0 ){
			System.out.println("Enetr the valid day !");
		}
		
		
		System.out.println("Enetr the month : ");
		int month = sc.nextInt();
		if(month > 12 || month <= 0){
			System.out.println("Enetr the valid month !");
		}

		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		if(year > 9999 || year <= 999){
			System.out.println("Enetr the valid year !");

		}

		System.out.println("Date is : "+day+"/"+month+"/"+year);
		
	}
}