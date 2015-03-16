package com.nano.Tutorials.GUI;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaneSwitch extends JFrame{
	
	private JPanel panelCont, panel1, panel2;
	private JButton button1;
	private JButton button2;
	private CardLayout cLayout;
	
	public PaneSwitch(){
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 200);
		
		cLayout = new CardLayout();
		button1 = new JButton("Switch to panel 2");
		button2 = new JButton("Switch to panel 1");
		
		panelCont = new JPanel();
		panelCont.setLayout(cLayout);
				
		panel1 = new JPanel();
		panel2 = new JPanel();
		add(panelCont);
		
		panel1.add(button1);
		panel2.add(button2);
		panel1.setBackground(Color.BLUE);
		panel2.setBackground(Color.GREEN);
		
		panelCont.add(panel1, "1");
		panelCont.add(panel2, "2");
		cLayout.show(panelCont, "1");
		
		button1.addActionListener(e -> cLayout.show(panelCont, "2"));
		button2.addActionListener(e -> cLayout.show(panelCont, "1"));
		
		
		
		
	}
	
	public static void main(String[] args){
		
			PaneSwitch window = new PaneSwitch();
			window.setVisible(true);
		
	}

}
