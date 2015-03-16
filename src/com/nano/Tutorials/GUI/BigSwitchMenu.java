package com.nano.Tutorials.GUI;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BigSwitchMenu extends JFrame{

	JButton switchButton = new JButton("Questions");
	static JPanel panelCont = new JPanel();
	JPanel panelMenu = new JPanel();
	static CardLayout cL = new CardLayout();
	BigQuestionMenu questionMenu = new BigQuestionMenu();
	BigSwitchQuestion questionPane = new BigSwitchQuestion();
	
	public BigSwitchMenu(){
		super("Big Switch Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		
		panelCont.setLayout(cL);
		panelCont.add(panelMenu, "1");
		panelCont.add(questionMenu, "2");
		panelCont.add(questionPane, "3");
		add(panelCont);
		
		switchButton.addActionListener(e -> cL.show(panelCont, "2"));
		panelMenu.add(switchButton);
		panelMenu.setBackground(Color.BLUE);
		cL.show(panelCont, "1");
	}
	
	public static void main(String[] args){
		BigSwitchMenu window = new BigSwitchMenu();
		window.setVisible(true);
		
	}
	
}
