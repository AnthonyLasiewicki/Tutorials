package com.nano.Tutorials.GUI;

import javax.swing.JFrame;

public class GraphicsMain extends JFrame{
	public static void main(String[] args){
		JFrame f = new JFrame("The titlee");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Graphics2 p = new Graphics2();
		f.add(p);
		f.setSize(400, 250);
		f.setVisible(true);
		
		
	}

}
