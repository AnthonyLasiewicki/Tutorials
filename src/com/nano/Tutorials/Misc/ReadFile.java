package com.nano.Tutorials.Misc;

import java.io.File;
import java.util.Scanner;

public class ReadFile{
	
	private Scanner x;
	
	public void openFile(){
		try{
			x = new Scanner(new File("chinese.txt"));
		}catch(Exception e){
			System.out.println("could not find file");
		}		
	}
	
	public void readFile(){
		//the hasNext() method returns a booleen if there is more stuff in the file.
		// so the way we set up our file lay out was we had an id num, first name, then last name
		//the next method
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s\n", a, b, c);

		}		
	}
	
	public void closeFile(){
		x.close();
		
	}

}


