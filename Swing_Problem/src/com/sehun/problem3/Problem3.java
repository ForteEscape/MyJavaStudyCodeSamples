package com.sehun.problem3;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Problem3 {
	
	static String name;
	static String gender;
	static String age;
	
	static String getNameText;
	static String getGenderText;
	static String getAgeText;
	
	static String getNameArray;
	static String getGenderArray;
	static String getAgeArray;
	
	static String[] ListStr;
	static int ListStrIdx = 0;
	
	public static void main(String[] args) {
		Person p = new Person();
		
		ListStr = new String[100];
		
		JFrame myFrame = new JFrame("this is frame");
		
		JPanel pn = new JPanel();
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		JPanel pn3 = new JPanel();
		
		JPanel pn4 = new JPanel();
		JPanel pn4_1 = new JPanel();
		JPanel pn4_2 = new JPanel();
		JPanel pn4_3 = new JPanel();
		JPanel pn4_4 = new JPanel();
		
		JPanel pn5 = new JPanel();
		
		JList myList = new JList(ListStr);
		
		JLabel nameLabel = new JLabel();
		JLabel genderLabel = new JLabel();
		JLabel ageLabel = new JLabel();
		JLabel nameLabelTf = new JLabel();
		JLabel genderLabelTf = new JLabel();
		JLabel ageLabelTf = new JLabel();
		
		JButton addBtn = new JButton();
		
		JTextField nameTf = new JTextField(10);
		JTextField genderTf = new JTextField(10);
		JTextField ageTf = new JTextField(10);
		
		nameLabel.setText("�̸� : ");
		genderLabel.setText("���� : ");
		ageLabel.setText("���� : ");
		
		nameLabelTf.setText("�̸� : ");
		genderLabelTf.setText("���� : ");
		ageLabelTf.setText("���� : ");
		
		addBtn.setText("�߰�");
		myList.setBackground(Color.white);
		
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getNameText = nameTf.getText();
				getGenderText = genderTf.getText();
				getAgeText = ageTf.getText();
				
				nameLabel.setText("�̸� : " + getNameText);
				genderLabel.setText("���� : " + getGenderText);
				ageLabel.setText("���� : " + getAgeText);
				
				p.setname(getNameText);
				p.setgender(getGenderText);
				p.setage(getAgeText);
				
				//ListStr[ListStrIdx] = getNameText;
				//ListStrIdx++;
			}
		});
		
		
		myList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(e.getSource() == myList) {
					getNameArray = p.returnName();
					getAgeArray = p.returnAge();
					getGenderArray = p.returnGender();
					
					nameLabel.setText(getNameArray);
					genderLabel.setText(getGenderText);
					ageLabel.setText(getAgeArray);
				}
				
			}
		});
		
		GridLayout gl = new GridLayout(1, 3);
		GridLayout gl1 = new GridLayout(3, 1);
		GridLayout gl2 = new GridLayout(4, 1);
		
		pn.setLayout(gl);
		
		pn2.add(myList);
		pn.add(pn2);
		pn.add(pn1);
		
		pn3.setLayout(gl1);
		pn3.add(nameLabel);
		pn3.add(genderLabel);
		pn3.add(ageLabel);
		pn.add(pn3);
		
		pn4.setLayout(gl2);
		
		pn4_1.add(nameLabelTf);
		pn4_1.add(nameTf);
		pn4_2.add(genderLabelTf);
		pn4_2.add(genderTf);
		pn4_3.add(ageLabelTf);
		pn4_3.add(ageTf);
		pn4_4.add(addBtn);
		
		pn4.add(pn4_1);
		pn4.add(pn4_2);
		pn4.add(pn4_3);
		pn4.add(pn4_4);
		
		pn.add(pn4);
		
		myFrame.setContentPane(pn);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(900, 500);
		myFrame.setVisible(true);
	}
}