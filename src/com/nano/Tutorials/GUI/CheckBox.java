package com.nano.Tutorials.GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CheckBox extends JFrame{
	
	private JTextField textBox;
	private JCheckBox boldBox;
	private JCheckBox italicsBox;

	
	public CheckBox(){
		super("Check Box Test");
		setLayout(new FlowLayout());
		setSize(420, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// the 20 arg makes 20 the max characters
		textBox = new JTextField("This is a swentence", 20);
		// three args, the first is the font (has to be java compatable) the next is the font style like italics, plain, bold; next is font size
		textBox.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textBox);
		
		boldBox = new JCheckBox("Bold");
		add(boldBox);
		
		italicsBox = new JCheckBox("Italics");
		add(italicsBox);
		
		Handler handler = new Handler();
		boldBox.addItemListener(handler);
		italicsBox.addItemListener(handler);
		
	}
	
	private class Handler implements ItemListener{
		
		public void itemStateChanged(ItemEvent event){
			
			//this if statement NEEDS to be first.  I think its a general rule that the one that includes all of the conditions needs to be first.
			if(boldBox.isSelected() && italicsBox.isSelected()){
				textBox.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 14));
			}
			else if(boldBox.isSelected()){
				textBox.setFont(new Font("Serif", Font.BOLD, 14));
			}			
			else if(italicsBox.isSelected()){
				textBox.setFont(new Font("Serif", Font.ITALIC, 14));
			}
			else{
				textBox.setFont(new Font("Serif", Font.PLAIN, 14));
			}
		}
	}
	
	public static void main(String[] args){		
		CheckBox window = new CheckBox();
		window.setVisible(true);		
	}
}
