public class DiceGame {

	public static void main(String args[]){
		int dice = 1;

		while(dice <=6 ){
			if (dice != 6 ){
				System.out.println("Not yatzy");
			}else{
				System.out.println("Yatzy");
			}
			dice ++ ;
		}
	}
}