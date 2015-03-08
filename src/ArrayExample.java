
public class ArrayExample {
	public static void main(String[] args){
		//put \t right after something to tab over.
		System.out.println("Index\tValue");
		int bucky[] = {16, 5, 78, 21, 2};
		
		//int[] array = new int[3];
		//array = {1,2,3};
		//you get an error for this cuz you cant use this type of array setting unless its in the initialization
		
		//this is the correct way.
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		
		// the reason its < and not <= is because arrays start at 0.
		//this array has a length of five, so we want to go 0-4 (five places)
		// if it was <=, it would go to the five spot of the array
		//which doesn't exist.
		// also, bucky.length will get you the length as an int i believe
		for(int i = 0; i < bucky.length; i++){
			System.out.println(i + "\t" + bucky[i]);
			
		}
		
	}
}
