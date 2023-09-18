package foundation;

import org.junit.Assert;
import org.junit.Test;

public class PowerofTwo {

	
	/*
	 * Given an integer n, return true if it is a power of two. Otherwise, return false.

		An integer n is a power of two, if there exists an integer x such that n == 2x.
		
		1) Get the integer as 'n'.
		
		2) Write a while loop to check whether the 'n' is greater than 1
		
		3) Repeatedly run the loop n / 2. Until n value equals 1 Return True.
		
		 4) Else false
	 */
	@Test
	public void test1() {
		Assert.assertEquals(true, power(4));
	}
	public boolean power(int n) {
		if(n<=0) {
			return false;
		}
	while(n%2 == 0) {
		n = n/2;
	}
	return n==1;
	}
	}

