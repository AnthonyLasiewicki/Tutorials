package com.nano.Tutorials.Polymorphism;

public class PotPie extends Food{
	
	//this is called overriding.  Basically, we're take the super classes method and overriding it to our own means, but we'll still have all the benifits of polymorphism as shown
	//in the Fatty class and by the polymorphic array in the Main class.
	public void eat(){
		System.out.println("This potpie is good.");
		
	}
	//also, you have to have the same return type throughout the overriding process, you also have to have the same argument types/amounts.  if not, you're polymorphism will be jank
	//when you have to many/little args or different access type/return type (private/public, void/int, etc) its called overloading. you're basically making a totally new class
	// but with the same name, if you call that class with those args, it'll work, but dont expect it to work with polymorphism
}
