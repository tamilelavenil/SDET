package redoPrograms;

public class BuyandSellStock {
	/*
	 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	 * subtract i+1 - i and check greater than previous profit
	 * return the final profit
	 */	public static void main(String[] args) {
	int[] price = {7,1,5,3,6,4};
	int profit  =0;
	for (int i = 0; i < price.length; i++) {
		for (int j = 1; j < price.length; j++) {
			if (price[j]-price[i]>profit) {
				profit = price[j]-price[i];
			}
		}
	}
	System.out.println(profit);

	}

}
