package com.sehun.problem2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Problem2 {
	static String language0;
	static String language1;
	static String language2;
	
	static String gender;
	
	public static void main(String[] args) {
		
		JFrame myJFrame = new JFrame("This is Frame");
		JPanel pn = new JPanel();
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		JPanel pn3 = new JPanel();
		JPanel pn4 = new JPanel();
		JPanel pn5 = new JPanel();
		JButton resultBtn = new JButton();
		
		JLabel lb1 = new JLabel();
		JLabel lb2 = new JLabel();
		JLabel lb3 = new JLabel();
		JLabel lb4 = new JLabel();
		JLabel resultLabel = new JLabel();
		
		JCheckBox[] chk = new JCheckBox[3];
		
		JRadioButton rbMale = new JRadioButton("����");
		JRadioButton rbFemale = new JRadioButton("����");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		
		for(int i = 0; i<3; i++) {
			chk[i] = new JCheckBox();
		}
		
		chk[0].setText("C");
		chk[1].setText("C++");
		chk[2].setText("java");
		
		chk[0].addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox chk = (JCheckBox)e.getSource();
				
				if(language0 == null)language0 = chk.getText();
				else language0 = null;
			}
		});
		
		chk[1].addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				JCheckBox chk = (JCheckBox)e.getSource();
				
				if(language1 == null)language1 = chk.getText();
				else language1 = null;
				
			}
		});
		
		chk[2].addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				JCheckBox chk = (JCheckBox)e.getSource();
				
				if(language2 == null) language2 = chk.getText();
				else language2 = null;
				
			}
		});
		
		rbMale.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JRadioButton rbMale = (JRadioButton)e.getSource();
				
				gender = rbMale.getText();
			}
		});
		
		rbFemale.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JRadioButton rbFemale = (JRadioButton)e.getSource();
				
				gender = rbFemale.getText();
			}
		});
		
		resultBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(language0 == null && language1 == null && language2 == null) {
					resultLabel.setText("����� ���� ������, " + "������ " + gender + "�Դϴ�.");
				}
				
				else if(language0 == null && language1 != null && language2 != null) {
					resultLabel.setText("����� ���� " + language1 + "," + language2 + "�̸�, " + "������ " + gender + "�Դϴ�.");
					
				}
				
				else if(language0 != null && language1 == null && language2 != null) {
					resultLabel.setText("����� ���� " + language0 + "," + language2 + "�̸�, " + "������ " + gender + "�Դϴ�.");
					
				}
				
				else if(language0 != null && language1 != null && language2 == null) {
					resultLabel.setText("����� ���� " + language0 + "," + language1 + "�̸�, " + "������ " + gender + "�Դϴ�.");
					
				}
				
				else if(language0 == null && language1 == null && language2 != null) {
					resultLabel.setText("����� ���� " + language2 + "�̸�, " + "������ " + gender + "�Դϴ�.");
					
				}
				
				else if(language0 == null && language1 != null && language2 == null) {
					resultLabel.setText("����� ���� " + language1 + "�̸�, " + "������ " + gender + "�Դϴ�.");
					
				}
				
				else if(language0 != null && language1 == null && language2 == null) {
					resultLabel.setText("����� ���� " + language0 + "�̸�, " + "������ " + gender + "�Դϴ�.");
					
				}
				
				else if(language0 != null && language1 != null && language2 != null) {
					resultLabel.setText("����� ���� " + language0 + "," + language1 + "," + language2 + "�̸�, " + "������ " + gender + "�Դϴ�.");
					
				}
			}
		});
		
		resultBtn.setText("������");
		
		lb1.setText("���������� �Դϴ�.");
		lb2.setText("1.������ ���: ");
		lb3.setText("2.������ �����ּ���: ");
		lb4.setText("���:");
		
		GridLayout gl = new GridLayout(5,1);
		
		pn.setLayout(gl);
		
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		pn.add(pn5);
		
		pn1.add(lb1);
		pn2.add(lb2);
		pn3.add(lb3);
		pn4.add(lb4);
		pn4.add(resultLabel);
		pn5.add(resultBtn);
		
		for(int i = 0; i<chk.length; i++) {
			pn2.add(chk[i]);
		}
		
		pn3.add(rbMale);
		pn3.add(rbFemale);
		
		myJFrame.setContentPane(pn);
		myJFrame.setSize(800, 800);
		myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myJFrame.setVisible(true);
	}
}