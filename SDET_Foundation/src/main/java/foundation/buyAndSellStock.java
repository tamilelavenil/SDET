package foundation;

import org.junit.Test;

import junit.framework.Assert;

public class buyAndSellStock {

	/*
	 * Given Input is array of prices value where prices[i] is the price of a given stock on the ith day.
	 * We need to buy the stock in the lowest price and sell 
	 * it to the highest price and display the profit as output
	 *  If we cannot achieve any profit, return 0/ Buying in future and selling in past is not possible
	 *  
	 *  1) Receive input prices in a Array
	 *  2) Declare a nested for Loop and check the difference between prices and return the maximum profit 
	 */
	@Test
	public void test1() {
		Assert.assertEquals(5, maxProfit(new int[] {7,1,5,3,6,4}));	
	}


	@Test
	public void test2() {
		Assert.assertEquals(0, maxProfit(new int[] {7,6,4,3,1}));	
	}
	

	public int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if (prices[j]-prices[i]>profit) {
					profit = prices[j]-prices[i];
				}
			}
		}
      return profit;  
    }
}
