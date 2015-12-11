package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import button.BackButton;
import render.Resource;

public class StatScreen extends JPanel {
	public StatScreen() {
		// TODO Auto-generated constructor stub
		setPreferredSize(new Dimension(640, 800));
		setLayout(null);
		
		BackButton backButton = new BackButton();
		add(backButton);
		backButton.setLocation(475, 640);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Resource.iBlack);
		g2d.fillRect(0, 0, 640, 800);
		
		g2d.drawImage(Resource.gold, 120, 160, 45, 45, null);
		g2d.drawImage(Resource.silver, 120, 230, 45, 45, null);
		g2d.drawImage(Resource.bronze, 120, 300, 45, 45, null);
		
		g2d.setFont(Resource.standardFont);
		g2d.setColor(Color.WHITE);
		g2d.drawString("DewJi", 250, 190);
		g2d.drawString("500", 440, 190);
		g2d.drawString("Obama", 250, 260);
		g2d.drawString("400", 440, 260);
		g2d.drawString("John", 250, 330);
		g2d.drawString("300", 440, 330);
	}
}


