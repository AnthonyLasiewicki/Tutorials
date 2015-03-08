
public class ArraySumming {
	public static void main(String[] args){
		int bucky[] = {21, 16, 53, 2, 49};
		int sum = 0;
		
		for(int i = 0; i < bucky.length; i++){
			sum += bucky[i];
		}
		
		System.out.println("The sum of these numbers is " + sum + ".");
	}
}
