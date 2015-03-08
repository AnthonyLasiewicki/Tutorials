package com.nano.Tutorials.Polymorphism;

//abstract means you cant create objects for that class but you can still make subclasses and have them extend, etc.
abstract public class Food {
	
	//an abstract method is a method that must be overwriten by a subclass if it wants to be a subclass
	// if not, you will get an error if you dont override it.  you also cannot have an abstract method if your class isnt' abstract
	//abstract classes can have un abstract methods though (obviously).
	abstract public void eat();
		
		//this is the code for when it wasn't abstract{
		//System.out.println("This food is good");  }
		


}
