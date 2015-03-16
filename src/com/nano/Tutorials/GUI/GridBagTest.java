package com.nano.Tutorials.GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridBagTest extends JFrame{

	JLabel text = new JLabel("text area");
	JButton button1 = new JButton("button 1");
	JButton button2 = new JButton("button 2");
	JButton button3 = new JButton("button 3");
	JButton button4 = new JButton("button 4");
	GridBagLayout gL = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public GridBagTest(){
		super("the title");
		setLayout(gL);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,400);
		gbc.insets = new Insets(15,15,15,15);
		
		gbc.weightx = 0.5;
		gbc.weighty = 0.5;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(text, gbc);

		gbc.weighty = 10;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		add(button1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(button2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(button3, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		add(button4, gbc);
		
		//gbc.fill = vertical, horizontal, both, maybe others
		//gbc.anchor = FIRST_LINE_START will do top left, then end is top left, LAST line is bottom left and right
		
		
	}
	
	public static void main(String[] args) {
		GridBagTest window = new GridBagTest();
		window.setVisible(true);
		
	}

}
