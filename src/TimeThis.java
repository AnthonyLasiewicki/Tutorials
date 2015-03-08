
public class TimeThis {
	private int hour;
	private int minute;
	private int second;
	
	public TimeThis(){
		this(0,0,0);
	}
	
	public TimeThis(int h){
		this(h,0,0);
	}
	
	public TimeThis(int h, int m){
		this(h,m,0);
	}
	
	public TimeThis(int h, int m, int s){
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s){
		setHour(h);
		setMinute(m);
		setSecond(s);	
	}
	
	public void setHour(int h){
		hour = ((h>=0 && h<24) ? h:0);
	}
	public void setMinute(int m){
		minute = ((m>=0 && m<60) ? m:0);
	}
	public void setSecond(int s){
		hour = ((s>=0 && s<60) ? s:0);
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	public String toMilitary(){
		//so this is how the String.format thing works (or my attempt at it)
		//there are 2 parameters you need to put in for the format() method of the String object
		//first, you need to put a string that describes the formating
		//this is just a bunch of jibberish, but what bucky used says that the three variables that will follow
		//need 2 decimal places.  You always put a % to say that there will be formatting following, and you separate
		//the formats for each of the variables with colons(i believe).
		//after the formating string comes the three variables or in this case numbers that will be used. It then will apply the format
		// to them and give it all in a string form. you would need to put extra print() statements before and after this make sense to the reader
		// but we will be doing that later because this is just for a return.
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	///////////////NOTE/////////////
	//If you want to build another class that calls all of the constructors, you can, but i dont see it
	// necessary since i already know all of this.
	
	
}
