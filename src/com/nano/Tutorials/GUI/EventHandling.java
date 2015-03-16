package com.nano.Tutorials.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
//its just a place to input text
import javax.swing.JTextField;
//like JTextField but will put astrics instead of letters
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

//the extends JFrame makes this the GUI or JFrame class for your program basically.
//it makes it so you can use methods like add() easily.  I suppose you could make a JFrame object then do like
//JFrame bucky = new JFrame() then do like bucky.add(text) if you wanted, but this is easier. you would als
// want to do all that in your main method of your main class if you were to make your JFrame and object.
// this is cleaner though.
public class EventHandling extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public EventHandling(){
		super("The title");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,400);
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("enter text here", 10);
		add(item2);
		
		item3 = new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("password");
		add(passwordField);
		
		Handler hand = new Handler();
		item1.addActionListener(hand);
		item2.addActionListener(hand);
		item3.addActionListener(hand);
		passwordField.addActionListener(hand);
	
	}
	
	//when you make this class inside a class, it automatically inherites the upper class and its variables (extends).
	// we could've built another class file and said Handler extends EventHandlingTwo, but this is cleaner and we can set to private
	// which isnt particularly important, but its still kinda useful. It'd probably be more useful in a huge program where being able to set
	// variables to private as often as possible would be good so you can eliminate cross naming variables and methods etc.
	
	//if you're gonna want to handle events, you're pretty much gonna need an entire class built for handling events that
	//implements the ActionListener class.
	private class Handler implements ActionListener{

		// this is a built in class that needs to be called actionPerformed, and it basically says, when the action(for this
		// class i assume its automatically pressing enter) to do this stuff.  So pressing enter will do the code in the method.
		public void actionPerformed(ActionEvent event) {
			//so the first thing that happens when you press enter is it creates an empty string
			String string = "";
			
			// this if statement is for what to set that string to for each of the coresponding text fields
			//getSource() method just gets what object the event came from. pretty basic.
			if(event.getSource() == item1){
				string = String.format("field 1: %s", event.getActionCommand());
							
			}else if(event.getSource() == item2){
				string = String.format("field 2: %s", event.getActionCommand());
				
			}else if(event.getSource() == item3){
				string = String.format("field 3: %s", event.getActionCommand());
				
			}else if(event.getSource() == passwordField){
				string = String.format("password field is: %s", event.getActionCommand());
				
			}
			//then this simple JOptionPane will display whatever the string variable is on the center of the JOptionPane
			JOptionPane.showMessageDialog(null, string);			
		}		
	}
	
	public static void main(String[] args){
		EventHandling window = new EventHandling();
		window.setVisible(true);
	}
}