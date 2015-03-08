package com.nano.Tutorials.GUI;

import javax.swing.JFrame;

public class EventHandlingOne {
	public static void main(String[] args){
		EventHandlingTwo window = new EventHandlingTwo();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1920,1040);
		window.setVisible(true);
	}

}
