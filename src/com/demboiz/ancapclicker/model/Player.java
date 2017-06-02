package com.demboiz.ancapclicker.model;


public class Player(){
	
	// Initialise variables.
	private int money;
	
	
	
	/**
	 * Returns money.
	 */
	public int getMoney(){
		return money;
	}
	
	/**
	 * Set money. Input amount.
	 */
	public void setMoney(int money){
		this.money = money;
	}
	
	/**
	 * Gain money. Input amount.
	 */
	public void gainMoney(int gain){
		this.money += gain;
	}
	
	/**
	 * Lose money. Input amount.
	 */	
	public int spendMoney(int loss){
		if(money - loss < 0){
			return 0
		}else{
			money -= loss;
			return 1;
		}
	}
	
		
}