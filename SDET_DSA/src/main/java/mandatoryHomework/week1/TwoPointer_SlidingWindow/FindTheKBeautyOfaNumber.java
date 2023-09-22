package mandatoryHomework.week1.TwoPointer_SlidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class FindTheKBeautyOfaNumber {
	/*
	 * https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/
	 * Input: num = 240, k = 2
		Output: 2
	 * 1) convert the input number as a string
	 * 2) iterate upto k digits and convert it as a num
	 * 3)now send the num to validate function and validate the divisor
	 * 4)if divisor returns true output plus1;
	 * 5)return the total output
	 */	
	@Test
	public void Test1() {
		Assert.assertEquals(2, Beauty(430043,2));
	}
	public int Beauty(int num, int k) {
		String no = Integer.toString(num);
		int output =0;
		for (int i = 0; i <= no.length()-k; i++) {
			String sub = no.substring(i,i+k);
			if(Integer.parseInt(sub)>0) {
				if (num%Integer.parseInt(sub)==0  ) {
					output++;
				}
			}
		}
		
		
		return output;
	}

}
