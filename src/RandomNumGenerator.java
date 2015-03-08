import java.util.Random;

public class RandomNumGenerator {
	public static void main(String[] args){
		Random dice = new Random();
		int number;
		
		//i is the counter if you didn't already know.
		for(int i = 1; i <= 10; i++ ){
			//nextInt method is asking for a "new int" basically. 
			//It's parameter is how many options (aka sides to a dice)
			//the +1 is cuz its 0 - 5, but we want 1-6
			number = 1 + dice.nextInt(6);
			System.out.println(number);
		}
		
	}
}
