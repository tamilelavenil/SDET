package mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class CheckifNumberHasEqualDigitCountandDigitValue {
	/*
	 * https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit
	 * -value/description/
	 * 1)iterate through the num.toCharArray()
	 * 2)check for the the i value in num array
	 * 3)if i and values in arr[i] equals increase counter ++;
	 * 4)if array[i] eg: 1 equals counter keep flag as true else false and break
	 */	
	@Test
	public void test1() {
		Assert.assertEquals(true,digitcount("1210"));
	}
	 @Test
	 public void test2() {
			Assert.assertEquals(true,digitcount("1210"));
		}
	 @Test
	 public void test3() {
			Assert.assertEquals(false,digitcount("1000"));
		}
	 
	public boolean digitcount(String num) {
		
		//char[] charArray = num.toCharArray();
		boolean check = false;
		for (int i = 0; i < num.length(); i++) {
			int count =0;
			for (int j = 0; j < num.length(); j++) {
				//System.out.println(charArray[j]);
				if (i==Character.getNumericValue(num.charAt(j))) {
					count++;
				}
			}
			if (count==Character.getNumericValue(num.charAt(i))) {
				check = true;
			}
			if (count!=Character.getNumericValue(num.charAt(i))) {
				return false;
			}
			
		}
		
		
		return check;
	}
}
