package com.sehun.main;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sehun.test.Person;

//JFrame, JPanel, JTextField�� Ŭ������ ��Ŭ���� ������ ���͵��� ����, Ctrl + Space�� ġ�� import�� �ڵ��ϼ����ش�.

public class HelloSwing {

	public static void main(String[] args) {
		JFrame fr = new JFrame("This ������");
		JPanel pn = new JPanel();
		JTextField tf = new JTextField();
		JButton[] btn = new JButton[10];
		
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.CENTER);
		pn.setLayout(fl);
		
		for(int i = 0; i< btn.length; i++) {
			btn[i] = new JButton("Button" + i);
			pn.add(btn[i]);
		}
		
		fr.setContentPane(pn);
		
		fr.setSize(400, 300);
		fr.setVisible(true);
	}

}
