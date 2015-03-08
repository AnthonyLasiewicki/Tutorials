package com.nano.Tutorials.Misc;

public class ToStringExample {
	private int month;
	private int day;
	private int year;
	
	public ToStringExample(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this);
		
	}
	
	//must name it toString(). its a specific thing java put in
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
	// basically, the whole reason why you do the toString() method is so that if you reference
	// to an object like its a string, it will be able to give an example.
	// so lets say you want to System.out.println(tuna), but tuna is ToStringExample tuna = new ToStringExample
	// well if you have a toString in your ToStringExample class, it will know what to do, because in that method
	// you described to the computer what to do if someone references to the object as a string.
}
