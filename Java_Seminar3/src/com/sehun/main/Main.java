package com.sehun.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame fr = new JFrame("This is ������");
		JPanel pn = new JPanel();
		
		Admin admin = new Admin("�輼��", "����", 27, "�Ϲ���");
		Member mem0 = new Admin("��ī��", "�߼�", 100, "����");
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
