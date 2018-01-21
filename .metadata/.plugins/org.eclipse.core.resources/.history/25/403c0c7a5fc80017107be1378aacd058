package com.sehun.image;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test {
	public static int x;
	public static int y;
	
	public static void main(String[] args) {
		JFrame fr = new JFrame("This is Frame");
		JPanel pn = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				ImageIcon ii = new ImageIcon("panda.png");
				Image img = ii.getImage();
				g.drawImage(img, x, y, this.getWidth(), this.getHeight(), this);
			}
		};
		fr.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					x-=10;
					pn.repaint();
					break;
					
				case KeyEvent.VK_RIGHT:
					x+=10;
					pn.repaint();
					break;
					
				case KeyEvent.VK_UP:
					y-=10;
					pn.repaint();
					break;
					
				case KeyEvent.VK_DOWN:
					y+=10;
					pn.repaint();
					break;
				}
			}
		});
		
		fr.setContentPane(pn);
		fr.setSize(500,500);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
