package com.nano.Tutorials.GUI;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdapterGUI extends JFrame{
	
	private String details;
	private JLabel statusBar;
	
	public AdapterGUI(){
		super("Adapter");
		
		statusBar = new JLabel("Default");
		add(statusBar, BorderLayout.SOUTH);
		addMouseListener(new MouseClass());
		
	}
	
	//basically, mouse Adapter is the extends version of MouseListener.  You don't have
	//to override every single method, just the ones you want.
	private class MouseClass extends MouseAdapter{
		
		public void mouseClicked(MouseEvent event){
			details = String.format("You clicked %d", event.getClickCount());
			
			if(event.isMetaDown()){
				details += "with right mouse button";
			}else if(event.isAltDown()){
				details += "with center mouse button";					
			}else{
				details += "with left mouse button";
			}
			statusBar.setText(details);
		}
		
	}
	
}
