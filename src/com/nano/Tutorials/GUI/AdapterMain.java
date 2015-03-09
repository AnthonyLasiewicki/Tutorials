package com.nano.Tutorials.GUI;

import javax.swing.JFrame;

public class AdapterMain extends JFrame{
	
public static void main(String[] args){
		
		AdapterGUI window = new AdapterGUI();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(320, 200);
		window.setVisible(true);
		
		
	}

}
