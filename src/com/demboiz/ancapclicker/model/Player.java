package com.demboiz.ancapclicker.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

	// Initialise variables.
	private long money;
	private List<Asset> assets= new ArrayList<Asset>();
	
	
	/**
	 * Constructor.
	 */
	public Player(){
		money += 10;
		assets.add(new Asset("Asset1", 1,10));
		assets.add(new Asset("Asset2", 5,55));
	}
	
	
	
	/**
	 * Update.
	 */
	public void update(){
		for(Asset asset:assets){
			gainMoney(asset.getIncome()*asset.getAssetAmount());
		}
	}
	
	
	/**
	 * Increase the amount of a specific asset.
	 */
	public void gainAsset(int type,int amount){
		try{
			if(money - assets.get(type).getCost() < 0){
				
				
			}else{
				money = money - assets.get(type).getCost();
				assets.get(type).gainAsset(amount);
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("Fail");
		}
	}
	
	public Asset returnAsset(int type){
		return assets.get(type);
	}
	
	
	/**
	 * Returns money.
	 */
	public long getMoney(){
		return money;
	}
	
	/**
	 * Set money. Input amount.
	 */
	public void setMoney(long money){
		this.money = money;
	}
	
	/**
	 * Gain money. Input amount.
	 */
	public void gainMoney(long gain){
		this.money += gain;
	}
	
	/**
	 * Lose money. Input amount.
	 */	
	public int spendMoney(long loss){
		if(money - loss < 0){
			return 0;
		}else{
			money -= loss;
			return 1;
		}
	}
	
}
