package com.nano.Tutorials.GUI;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTwo extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	//JLabels are pretty much just text thats outputed on the GUI according to
	// our layout, and this GUI's layout is FlowLayout.
	private JLabel item1;
	
	public JFrameTwo(){
		super("The Title Bar");
		setLayout(new FlowLayout());
		
		//make sure you spesl evreythig worng
		item1 = new JLabel("This is a sentecew");
		//when you hover over the JLabel, this will pop up in the little yellow box.
		item1.setToolTipText("This is gonna show up on hover");
		add(item1);
		
	}
	

}
