package com.sehun.test;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test2 {
	
	public static void main(String[] args) {
		JFrame myJFrame = new JFrame("this is Frame");
		JLabel myJLabel = new JLabel();
		JPanel myJPanel = new JPanel();
		
		GridLayout gl = new GridLayout(1,1);
		
		myJLabel.setOpaque(true);
		myJLabel.setText("");
		myJLabel.setBackground(Color.white);
		myJLabel.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				Integer keyCode = Integer.valueOf(e.getKeyChar());
				
				if(keyCode == 8) {
					String myText = myJLabel.getText();
					
					myJLabel.setText(myText.substring(0, myText.length()-1));
				}
				else {
					String text = myJLabel.getText();
					
					myJLabel.setText(text + e.getKeyChar());
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		myJLabel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				((JComponent)e.getSource()).requestFocus();
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		myJPanel.add(myJLabel);
		
		myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myJFrame.setSize(500, 500);
		myJFrame.setVisible(true);
		myJPanel.setLayout(gl);
		
		myJFrame.setContentPane(myJPanel);
	}
}
