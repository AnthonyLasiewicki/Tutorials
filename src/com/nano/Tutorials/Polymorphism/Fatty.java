package com.nano.Tutorials.Polymorphism;

public class Fatty {
	
	//this makes it so we can call the eat method of any food class or subclass, even if the code in the eat method is different.
	public void digest(Food x){
		x.eat();
		
	}
}
