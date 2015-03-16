package com.nano.Tutorials.GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends JFrame{
	JRadioButton bb;
	JRadioButton pb;
	JRadioButton ib;
	JRadioButton bib;
	
	ButtonGroup group;
	
	Font bf = new Font("Serif", Font.BOLD, 14);
	Font itf = new Font("Serif", Font.ITALIC, 14);
	Font pf = new Font("Serif", Font.PLAIN, 14);
	Font bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
	
	JTextField text;
	
	public RadioButton(){
		super("Radio Button Program");
		setLayout(new BoxLayout(getContentPane(), JFrame.EXIT_ON_CLOSE));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 110);
		
		text = new JTextField("This is a senencwe", 20);
		text.setFont(pf);
		text.setSize(10,70);
		text.
		add(text);
		
		//the two args for the JRadioButton() constructor are the text next to the button, and a booleen for if it is by default turned on
		pb = new JRadioButton("Plain", true);
		add(pb);
		
		bb = new JRadioButton("Bold", false);
		add(bb);
		
		ib = new JRadioButton("Italic", false);
		add(ib);
		
		bib = new JRadioButton("Bold and Italic", false);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);

		pb.addItemListener(new Handler(pf));
		bb.addItemListener(new Handler(bf));
		ib.addItemListener(new Handler(itf));
		bib.addItemListener(new Handler(bif));
		
	}
	private class Handler implements ItemListener{
		
		Font font;
		Handler(Font f){
			font = f;
		}
		
		public void itemStateChanged(ItemEvent event){
			text.setFont(font);
			
		}

		
		
	}
	
	public static void main(String[] args) {
		RadioButton window = new RadioButton();
		
		window.setVisible(true);

	}

}
