public class LowestAge {
	public static void  main (String args[]){
		int[] ages = {20,22,25,35,87,75,18,25,13};
		
		int lowestAge = ages[0];

		for ( int age : ages){
			if (lowestAge > age ){
				lowestAge = age;
			}
		}
		System.out.println("The lowest age is : "+lowestAge);
	}
}