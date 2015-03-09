package com.nano.Tutorials.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultiListGUI extends JFrame{
	private JList leftList;
	private JList rightList;
	private JButton moveButton;
	private static String[] foods = {"bacon","wings","ham","beef","more bacon"};
	
	public MultiListGUI(){
		super();
		setLayout(new FlowLayout());
		
		leftList = new JList(foods);
		leftList.setVisibleRowCount(3);
		add(new JScrollPane(leftList));
		
		moveButton = new JButton("Move --->");
		moveButton.addActionListener(
				new ActionListener(){
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent event){
						rightList.setListData(leftList.getSelectedValuesList().toArray());
						
						}
					}
				);
				add(moveButton);
				
				//because its empty (no string array as a parameter), it actually wont even appear
				//on the screen
				rightList = new JList();
				rightList.setVisibleRowCount(3);
				rightList.setFixedCellWidth(100);
				rightList.setFixedCellHeight(15);
				rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
				add(new JScrollPane(rightList));	
	}

}
