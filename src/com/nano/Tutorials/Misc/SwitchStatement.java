package com.nano.Tutorials.Misc;

public class SwitchStatement{
	public static void main(String[] args){
		int age;
		age = 3;
		
		//what goes in your parameters is the variable you want to test, then each
		//case is iff it equals this(1, 2, 3) then do this, and finish it off with a break
		//then you have the default option
		switch (age){
		case 1: 
			System.out.println("you can crawl");
			break;
		case 2:
			System.out.println("You can walk");
			break;
		case 3:
			System.out.println("You can talk");
			break;
		default:
			System.out.println("you're old");
			break;
		
		}		
	}
}
