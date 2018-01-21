package com.sehun.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border_Layout {
	private final static int BUTTON_SIZE = 5;
	
	public static void main(String[] args) {
		JFrame fr = new JFrame("this is Frame");
		JPanel pn = new JPanel();
		
		JButton[] btn = new JButton[BUTTON_SIZE];
		int []width = {100,150,200,250,300};
		int []height = {50,150,200,250,300};
		pn.setLayout(null);
		
		for(int i = 0; i<BUTTON_SIZE; i++) {
			btn[i] = new JButton("Button"+i);
			btn[i].setBounds(100, 50, width[i], height[i]);
			pn.add(btn[i]);
		}
		
		fr.setContentPane(pn);
		fr.setSize(500, 500);
		fr.setVisible(true);
	}

}
