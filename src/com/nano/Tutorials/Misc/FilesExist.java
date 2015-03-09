package com.nano.Tutorials.Misc;

import java.io.File;

public class FilesExist{
	public static void main(String[] args){
		
		 File x = new File("C:\\development\\test\\test.txt");
		 
		 if (x.exists())
		 	System.out.println(x.getName() + " exists!");
		 else
			 System.out.println(x.getName() + " does not exist");
		 
		
	}

}
