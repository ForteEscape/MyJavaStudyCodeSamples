package com.sehun.main;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {
	
	JFrame myJFrame;
	JLabel myJLabel;
	Container myContainer;
	
	private void start() {
		createUI();
		KeyListener();
		MouseListener();
	}
	
	private void createUI() {
		myJFrame = new JFrame("This is Frame");
		myJLabel = new JLabel();
		myContainer = new Container();
		
		myJFrame.getContentPane().add(myContainer);
		
		this.myJLabel = new JLabel();
		this.myJLabel.setText("ABCD");
		this.myJLabel.setBounds(500,500,500,500);
		this.myJLabel.setVisible(true);
		this.myJLabel.setBackground(Color.WHITE);
		
		myContainer.add(myJLabel);
		
		myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myJFrame.setSize(500, 500);
		myJFrame.setVisible(true);
		
	}
	
	private void KeyListener() {
		myJLabel.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				Integer keyCode = Integer.valueOf(e.getKeyChar());
				
				if(keyCode == 8) {
					inputBackspace();
				}
				
				else {
					String myText = myJLabel.getText();
					myJLabel.setText(myText+e.getKeyChar());
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	private void MouseListener() {
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
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	private void inputBackspace() {
		String myText = myJLabel.getText();
		
		myJLabel.setText(myText.substring(0, myText.length()-1));
	}
	
	public static void main(String[] args) {
		new Test().start();
	}
}
