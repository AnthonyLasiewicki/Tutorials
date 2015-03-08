
public class ArraysInMethods {
	public static void main(String[] args){
		int bucky[] = {1,2,3,4,5};
		change(bucky);
		
		for(int x:bucky){
			System.out.println(x);
		}
	}
	//your parameter is an int array
	public static void change(int x[]){
		for(int i = 0; i <x.length;i++){
			x[i]+=5;
		}
	}
}
