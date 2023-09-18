package foundation;

import org.junit.Assert;
import org.junit.Test;

public class CountingElements {
/*
 * Given an integer array arr, count how many elements x there are, 
 * such that x + 1 is also in arr.
 *
 * If there're duplicates in arr, count them seperately.
 * 
 * example 1: input = [1, 2, 3]
 *			  output = 2
 *			explanation: when x is 1, we see x+1 (2) is present in input
 *						 when x is 2, we see x+1 (3) is present in input
 *						 when x is 3, we see x+1 (4) is not present in input
 *						so no of presence of x+1 is 2
 *	1)Get input as a Integer Array 	
 *  2)add 1 to all the numbers in array and check the sum is available in array
 *  3)if x+1 is available in array if available count +1
 *  4) return count finally	
 */ 
	@Test
	public void test1() {
		
		Assert.assertEquals(3, countEle(new int[] {1,2,3,4}));
		
	}
	
	public int countEle(int[] input) {
		int count=0;
	for (int i = 0; i < input.length; i++) {
		  for (int j = 0; j < input.length; j++) {
			  if(input[i]+1==input[j]) {
				  count+=1;
			  }
		    }
	    }
		return count;
}
}
