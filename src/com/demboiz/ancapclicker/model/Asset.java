package com.demboiz.ancapclicker.model;

public class Asset {

	// Initialise variables.
		protected int income;
		protected int amount;
		protected String name;
		
		
		
		public Asset(String name, int income){
			this.name = name;
			this.income = income;
			this.amount = 0;
		}
		
		
		/**
		 * Increases amount by input.
		 */
		public void gainAsset(int amount){
			this.amount += amount;
		}
		
		
		/**
		 * Returns amount.
		 */
		public int getAssetAmount(){
			return this.amount;
		}
		
		
		/**
		 * Returns income.
		 */
		public int getIncome(){
			return income;	
		}
		
		
	
}
