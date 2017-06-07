package com.demboiz.ancapclicker.model;

public class Asset {

	// Initialise variables.
		protected long income;
		protected long amount;
		protected String name;
		protected long cost;
		
		
		public Asset(String name, long income, long cost){
			this.name = name;
			this.income = income;
			this.amount = 0;
			this.cost = cost;
		}
		
		
		/**
		 * Increases amount by input.
		 */
		public void gainAsset(int amount){
			this.amount += amount;
			priceIncrease();
			incomeIncrease();
		}
		
		
		public void incomeIncrease(){
			if(amount == 100 || amount == 200 || amount == 300){
				income = income*2;
			}
		}
		
		public void priceIncrease(){
			cost = Math.round(cost*1 + 0.1*amount);
		}
		
		/**
		 * Returns amount.
		 */
		public long getAssetAmount(){
			return this.amount;
		}
		
		
		/**
		 * Returns income.
		 */
		public long getIncome(){
			return income;	
		}
		
		public long getCost(){
			return cost;
		}
		
		
	
}
