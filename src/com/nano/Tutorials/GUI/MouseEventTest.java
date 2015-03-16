package com.nano.Tutorials.GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseEventTest extends JFrame{
	private JPanel mousePanel;
	private JLabel statusBar;
	
	public MouseEventTest(){
		super("The title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,400);
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);
	
		statusBar = new JLabel("default");
		add(statusBar, BorderLayout.SOUTH);
	
		//there are two types of mouse 
	
		Handler handler = new Handler();		
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}
		
	//implements is like extends, where you inherit everything, but you HAVE to override EVERY method.
	//you can also implement multiple classes, but you have to override all of the methods.  MouseListener has
	// one method, MouseMotionListener has two methods
	class Handler implements MouseListener, MouseMotionListener{
		
		//a mouse click is when you press and release REALLY quick, but only once
		public void mouseClicked(MouseEvent event){
			statusBar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
			
		}
			
		//a mouse press is when you hold down left click
		public void mousePressed(MouseEvent event){
			statusBar.setText("You pressed down the mouse");
						
		}
			
		//a mouse release is when you release the left click
		public void mouseReleased(MouseEvent event){
			statusBar.setText("You released the button");
				
		}
			
		//a mouse enter is when your mouse enters an area
		public void mouseEntered(MouseEvent event){
			statusBar.setText("You entered the area");
			mousePanel.setBackground(Color.RED);			
		}
				
		public void mouseExited(MouseEvent event){
			statusBar.setText("You exited the area");
			mousePanel.setBackground(Color.WHITE);
		}

		//mouse drag is pressing while moving
		public void mouseDragged(MouseEvent event){
			statusBar.setText("You are dragging the mouse");
			
		}

		//mouse move is moving without pressing
		public void mouseMoved(MouseEvent event){
			statusBar.setText("You moved the mouse");
		}
	}
	
	public static void main(String[] args){
		MouseEventTest window = new MouseEventTest();
		window.setVisible(true);		
	}
}