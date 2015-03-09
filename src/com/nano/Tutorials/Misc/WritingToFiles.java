package com.nano.Tutorials.Misc;

import java.util.Formatter;

public class WritingToFiles{

	private Formatter x;
	
	public void openFile(){
		try{
			x = new Formatter("chinese.txt");
			
		}
		catch(Exception e){
			System.out.println("You have an error");
			
		}
	}
	
	public void addRecords(){
		x.format("%s%s%s", "20 ", "bucky ", "roberts");
	}
	
	public void closeFile(){
		x.close();
	}
	
}
