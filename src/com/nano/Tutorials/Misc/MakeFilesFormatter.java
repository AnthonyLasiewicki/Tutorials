package com.nano.Tutorials.Misc;

import java.util.Formatter;

public class MakeFilesFormatter{
	public static void main(String[] args){
		
		final Formatter x;
		
		try{
			x = new Formatter("fred.txt");
			System.out.println("you created a file");
			
		}
		catch(Exception e){
			System.out.println("you got an error");
			
		}
		
		
	}

}
