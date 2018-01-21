package com.sehun.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame fr = new JFrame("This is 프레임");
		JPanel pn = new JPanel();
		
		Admin admin = new Admin("김세훈", "남자", 27, "일반인");
		Member mem0 = new Admin("피카츄", "중성", 100, "동물");
		Admin mem = (Admin) mem0;
		
		JLabel lb1 = new JLabel(admin.toString());
		JLabel lb2 = new JLabel(mem.toString());
		
		
		pn.setLayout(new BorderLayout());
		fr.setContentPane(pn);
		
		pn.add(lb1, BorderLayout.NORTH);
		pn.add(lb2, BorderLayout.SOUTH);
		
		fr.setSize(600, 400);
		fr.setVisible(true);
	}
}
