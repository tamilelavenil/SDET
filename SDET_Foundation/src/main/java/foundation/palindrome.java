package foundation;

import org.junit.Test;

import org.junit.Assert;

public class palindrome {
	/*
	 * Receiving a number as input, Check whether the number is  Palindrome
	 * 1)Declare a variable as zero to perform simplification and store the value in sum, declare a remainder var also.
	 * 2)assign a temp variable and assign the input to it to compare finally
	 * 3)write a while loop to perform simp until it becomes zero
	 * 4) finally complete the loop and check whether the input number and reverse number equals
	 */
	@Test
	public void test1() {

		Assert.assertEquals(true, CheckPalindrome(121));
	}
	@Test
	public void test2() {

		Assert.assertEquals(false, CheckPalindrome(1212));
	}

	public boolean CheckPalindrome(int n) {
		
		int sum = 0;
		int temp = n;
		int r;
		while(n>0) {
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
				
		}
		if (temp==sum) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
