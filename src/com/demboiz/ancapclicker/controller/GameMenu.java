package com.demboiz.ancapclicker.controller;

import java.awt.GridLayout;
import javax.swing.JFrame;



public class GameMenu {

	private JFrame frame;
	private GridLayout layout;
	
	public GameMenu(){
		frame = new JFrame("An-Cap Clicker");
		layout = new GridLayout(3,5);
		frame.setLayout(layout);
		
		frame.setSize(300, 500);
		frame.setVisible(true);
		
		
	}
}