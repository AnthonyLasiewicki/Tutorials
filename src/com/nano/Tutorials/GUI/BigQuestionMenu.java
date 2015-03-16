package com.nano.Tutorials.GUI;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BigQuestionMenu extends JPanel{
	
	JButton questionButton = new JButton("Question 1");
	JButton menuButton = new JButton("Back to menu");
			
	public BigQuestionMenu(){
		setBackground(Color.CYAN);
		
		menuButton.addActionListener(e -> BigSwitchMenu.cL.show(BigSwitchMenu.panelCont, "1"));
		questionButton.addActionListener(e -> BigSwitchMenu.cL.show(BigSwitchMenu.panelCont, "3"));
		add(menuButton);
		add(questionButton);
		
		
		
		
	}
	
}
