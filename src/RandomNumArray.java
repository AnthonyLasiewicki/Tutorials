import java.util.Random;

public class RandomNumArray {
	public static void main(String[] args){
		Random rand = new Random();
		//its 7 cuz we need 1-6, but not 0
		int freq[] = new int[7];
		
		for(int i = 1; i<=1000; i++){
			++freq[1+rand.nextInt(6)];			
		}
		
		System.out.println("Face\tFrequency");
		
		for(int j = 1; j <freq.length; j++){
			System.out.println(j + "\t" + freq[j]);
		}
	}

}
