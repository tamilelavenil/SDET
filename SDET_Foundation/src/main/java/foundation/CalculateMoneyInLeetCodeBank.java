package foundation;

import org.junit.Test;
import org.junit.Assert;

public class CalculateMoneyInLeetCodeBank {

	
	/*
	 * Declare a sum and dollar as 0
	 * Declare a int array as days 1-7
	 * Iterate from 1st day to n- number of days
	 * 
	 * add value of day and dollar
	 * 
	 * every monday dollar value is added by 1$ and counter for days is made as zero
	 */
	@Test
	public void Test1() {
		Assert.assertEquals(96, LeetCodeBank(20));
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(37, LeetCodeBank(10));
	}
	
	@Test
	public void Test3() {
		Assert.assertEquals(10, LeetCodeBank(4));
	}
	
	
	
	public int LeetCodeBank(int inp) {
		int n = 20, sum = 0;
		int dollar = 0;

		int[] days = { 1, 2, 3, 4, 5, 6, 7 };

		int counterdays = 0; // this counter is used to iterate days array

		for (int i = 1; i <= n; i++) {
			sum += days[counterdays] + dollar;
			counterdays++;
			if (i % 7 == 0) {    //Increasing dollar and making counterdays as 0
				dollar = dollar + 1; 
				counterdays = 0;
			}

		}
		return sum;

	}

}
