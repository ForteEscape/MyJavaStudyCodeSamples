package com.sehun.main;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {
		String result = "���� ��ư:";
		JFrame fr = new JFrame("This is Frame");
		JPanel pn = new JPanel();
		JPanel rightPn = new JPanel();
		JLabel lbl = new JLabel(result);
		JButton[] btn = new JButton[4];
		
		for(int i = 0; i<4; i++) {
			btn[i] = new JButton(i+"��");
			rightPn.add(btn[i]);
			btn[i].addActionListener(new ActionListener() {	
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton thisButton = (JButton) e.getSource();
					lbl.setText(result+thisButton.getText());
				}
			});
		}
		
		rightPn.setLayout(new GridLayout(4, 1));
		pn.setLayout(new GridLayout());
		fr.setContentPane(pn);
		pn.setBackground(new Color(255,125,125));
		rightPn.setBackground(new Color(125, 255, 125));
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		pn.add(lbl);
		pn.add(rightPn);
		
		fr.setSize(600, 400);
		fr.setVisible(true);
	}

}