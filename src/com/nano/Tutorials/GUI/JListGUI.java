package com.nano.Tutorials.GUI;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JListGUI extends JFrame{

	private JList list;
	private static String[] colorNames = {"Black","Blue","Red","White"};
	private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
	
	public JListGUI(){
		super("JList Program");
		setLayout(new FlowLayout());
		
		list = new JList(colorNames);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//JScrollPane() is basically an empty pane that you can add components like JLists into it,
		//and it will give you horizontal/vertical scrolbars
		add(new JScrollPane(list));
		
		//another anonomous inner class
		list.addListSelectionListener(
				new ListSelectionListener(){
					public void valueChanged(ListSelectionEvent event){
						//so basically background color is stored in a ContentPane object for the JFrame object (this is what i assume)
						//and we basically retrieved our JFrames ContentPane and we called the setBackground() method of that object
						// we then proceeded to retrieve the index number from our JList and put that in our square brackets as the int for the color
						//of that color array. the hardest, newest thing here is the getContentPane
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
						
					}
				}
				);
	}
	
}
