//this program just sums the array values
public class EnhancedForLoop {
	public static void main(String[] args){
		int bucky[]={1,2,3,4,5};
		int total = 0;
		
		//this is all called an enhanced for statement.  It works with arrays to loop through the array EASILY (why its enhanced i suppose)
		//the int describes the type of data (it's called the type actually)
		// the x is called the identifier. it's the counter and ALSO the place in the array (this is why its so enhanced see. it makes things a lot easier)
		//then you have to put the array you're working with. Very cool and easy
		//yes, this is NOT neccisary, we have done this before, its just a special thing for looping through arrays.
		for(int x: bucky){
			total += x;
		}
		System.out.println(total);
	}
}
