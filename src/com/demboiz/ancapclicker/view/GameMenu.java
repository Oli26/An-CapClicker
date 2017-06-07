package com.demboiz.ancapclicker.view;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.demboiz.ancapclicker.model.Player;



public class GameMenu {

	private JFrame frame;
	private GridLayout layout;
	private Graphics g;
	
	public GameMenu(){
		// Game variables
		Player player = new Player();
		
		
		
		
		frame = new JFrame("An-Cap Clicker");
		layout = new GridLayout(15,0);
		frame.setLayout(layout);

		
		// Team label.
		JLabel team = new JLabel("Team Demboiz");
		team.setHorizontalAlignment(SwingConstants.RIGHT);
		team.setVerticalAlignment(SwingConstants.TOP);
		frame.add(team);
		
		// Money label.
		JLabel moneyLabel = new JLabel("Money: " + player.getMoney() + "$");
		moneyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Make money button.
		AbstractAction makeMoney = new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player.gainMoney(player.getClickAmount());
				moneyLabel.setText("Money: " + player.getMoney() + "$");
			}
		};
		JButton makeMoneyButton = new JButton(makeMoney);
		makeMoneyButton.setText("Make big bucks");
		frame.add(makeMoneyButton);
		frame.add(moneyLabel);
		
		
		// Asset labels.
		JLabel asset1Label = new JLabel("Laborers: " + player.returnAsset(0).getAssetAmount());
		JLabel asset2Label = new JLabel("Primative machines: " + player.returnAsset(1).getAssetAmount());
		asset1Label.setHorizontalAlignment(SwingConstants.CENTER);
		asset2Label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(asset1Label);
		frame.add(asset2Label);
		
		
		
		// Update
		TimerTask updateTask = new TimerTask(){
			public void run(){
				player.update();
				moneyLabel.setText("Money: " + player.getMoney() + "$");
			}
			
		};
		
		Timer timer = new Timer();
		long time0 = 0;
		long time1000 = 1000;
		timer.schedule(updateTask, time0, time1000);
		
		
		
		
		// Asset1 button creation.
		AbstractAction buyAsset1Action = new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player.gainAsset(0, 1);
				asset1Label.setText("Laborers: " + player.returnAsset(0).getAssetAmount());
				moneyLabel.setText("Money: " + player.getMoney() + "$");
			}
		};
		JButton buyAsset1 = new JButton(buyAsset1Action);
		buyAsset1.setText("Buy laborer");
		frame.add(buyAsset1);
		
	
	  
		
		// Asset2 button creation.
		AbstractAction buyAsset2Action = new AbstractAction(){
				@Override
				public void actionPerformed(ActionEvent e) {
					player.gainAsset(1, 1);
					asset2Label.setText("Primative machines: " + player.returnAsset(1).getAssetAmount());
					moneyLabel.setText("Money: " + player.getMoney() + "$");
					
				}
		};
		JButton buyAsset2 = new JButton(buyAsset2Action);
		buyAsset2.setText("Buy primative machine");
		frame.add(buyAsset2);
				
				

		
		AbstractAction buyClickUpgrade = new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player.upgradeClickAmount();
				
			}
		};
		JButton buyClickUpgradeButton = new JButton(buyClickUpgrade);
		buyClickUpgradeButton.setText("Upgrade clicker");
		frame.add(buyClickUpgradeButton);
		
		
		
		frame.setSize(500, 800);
		frame.setVisible(true);
		
		
		
		
		
	}
}
