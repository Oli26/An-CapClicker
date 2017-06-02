package com.demboiz.ancapclicker.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.demboiz.ancapclicker.MainMenu;

public class NewGameAction extends AbstractAction {
	MainMenu menu;
	
	public NewGameAction(MainMenu menu){
		this.menu = menu;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		menu.newGame();

	}

}
