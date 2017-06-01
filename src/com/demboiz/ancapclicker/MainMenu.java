package com.demboiz.ancapclicker;

import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainMenu {

	private JFrame frame;
	private GridLayout layout;
	private JButton newGame;
	private JButton loadGame;
	private JButton options;
	
	public MainMenu() {
		
	frame = new JFrame("An-Cap Clicker");
	layout = new GridLayout(5,1);
	frame.setLayout(layout);
	
	JLabel title = new JLabel("An-Cap Clicker");
	title.setHorizontalAlignment(SwingConstants.CENTER);
	frame.add(title);
	newGame = new JButton("New Game");
	frame.add(newGame);
	loadGame = new JButton("Load Game");
	frame.add(loadGame);
	options = new JButton("Options");
	frame.add(options);
	JLabel team = new JLabel("Team Demboiz");
	team.setHorizontalAlignment(SwingConstants.CENTER);
	
	
	frame.add(team);
	frame.setSize(300, 500);
	frame.setVisible(true);
	}
}
