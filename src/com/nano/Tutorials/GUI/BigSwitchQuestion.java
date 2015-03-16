package com.nano.Tutorials.GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BigSwitchQuestion extends JPanel{
	
	private JButton menuButton2 = new JButton("Back to Questions Menu");
	
	public BigSwitchQuestion(){
		setBackground(Color.GREEN);
		
		menuButton2.addActionListener(e -> BigSwitchMenu.cL.show(BigSwitchMenu.panelCont, "2"));
		add(menuButton2);
		
		
	}

}
