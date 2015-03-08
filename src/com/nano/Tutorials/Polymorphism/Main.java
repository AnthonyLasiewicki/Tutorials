package com.nano.Tutorials.Polymorphism;

public class Main {
	public static void main(String[] args){
		
		PotPie potObject = new PotPie();
		Tuna tunaObject = new Tuna();
		Food po = new PotPie();
		Food to = new Tuna();
				
		Food[] foodArray = {potObject, tunaObject, po, to};
		
		for(Food i: foodArray){
			i.eat();
			
		}
		
		//we just made this so we can access its methods lol. we couldve just made digest a static method, but watevs man.
		Fatty fatObj = new Fatty();
		
		//this is just to show that we can put different types of food in the digest method and it'll work.  I didnt feel like making ANOTHER for loop, so i just did the 0 part of
		// our array
		fatObj.digest(foodArray[0]);
		
		
	}
}
