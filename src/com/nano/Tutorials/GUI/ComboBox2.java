package com.nano.Tutorials.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox2 extends JFrame{
	private JComboBox box;
	private JLabel picture;
	private static String[] filename = {"button1.png", "button2.png"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), 
			new ImageIcon(getClass().getResource(filename[1]))};
	
	public ComboBox2(){
		super("The title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename);
		
		//the inside thing is called an anonomous inner class
		// then in that if statement, we said if the state change is equal to selected which is probably just
		// a booleen constant in the ItemEvent class, than set the JLabel named picture to the picture in the array
		//the number in the array is retrieved through the method in the JComboBox class called getSelectedIndex() which
		//will output an int coresponding to which box is selected currently
		box.addItemListener(
				new ItemListener(){
					public void itemStateChanged(ItemEvent event){
						if(event.getStateChange() == ItemEvent.SELECTED){
							picture.setIcon(pics[box.getSelectedIndex()]);
						}
					}
				}
				);
		add(box);
		picture = new JLabel(pics[0]);
		add(picture);
	}
	
	
	
}
