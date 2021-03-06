package com.sehun.main;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Question {
	public static void main(String[] args) {
		JFrame fr = new JFrame("Calculater");
		JPanel pn = new JPanel();
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		JButton[] btn = new JButton[16];
		JTextField tf = new JTextField();
		JLabel lb = new JLabel();
		
		BorderLayout bl = new BorderLayout();
		GridLayout gl = new GridLayout(4, 3);
		
		pn.setLayout(bl);
		pn2.setLayout(gl);
		
		for(int i = 0; i<16; i++) {
			btn[i] = new JButton();
			pn2.add(btn[i]);
		}
		//set button name;
		btn[0].setText("1");
		btn[1].setText("2");
		btn[2].setText("3");
		btn[3].setText("+");
		btn[4].setText("4");
		btn[5].setText("5");
		btn[6].setText("6");
		btn[7].setText("-");
		btn[8].setText("7");
		btn[9].setText("8");
		btn[10].setText("9");
		btn[11].setText("x");
		btn[12].setText("");
		btn[13].setText("0");
		btn[14].setText("입력");
		btn[15].setText("/");		
		
		pn1.add(tf);
		pn1.add(lb);
		tf.setText("텍스트");
		lb.setText("Label");
		
		pn.add(pn1, BorderLayout.NORTH);
		pn.add(pn2, BorderLayout.CENTER);
		
		fr.setContentPane(pn);
		
		fr.setSize(400, 400);
		fr.setVisible(true);
	}

}
