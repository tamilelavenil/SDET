package foundation;

import org.junit.Assert;
import org.junit.Test;

public class CheckOccurances {

	/*
	 * input: array of numbers and number to check for occurance output: return the
	 * occurance if any Logic: in a for loop, check for the number by comparing it
	 * with all the elements of loop if there is any match increment counter return
	 * the counter
	 */
	
	public int countOccurances(int[] num, int check) {
		int count=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]==check) {
				count++;
			}
		}
		return count;
		
	}
	
	@Test
	public void test1() {
		int result = countOccurances(new int[] {-1,0,1,2,2,3,3,3,4,4,4},-1);
		Assert.assertEquals(1, result);
		
	}
	@Test
	public void test2() {
		int result = countOccurances(new int[] {-1,0,1,2,2,3,3,3,4,4,4},5);
		Assert.assertEquals(0, result);
		
	}

	@Test
	public void test3() {
		int result = countOccurances(new int[] {-1,0,1,2,2,3,3,3,4,4,4},4);
		Assert.assertEquals(3, result);
		
	}
	@Test
	public void test4() {
		int result = countOccurances(new int[] {4},4);
		Assert.assertEquals(1, result);
		
	}
	@Test
	public void test5() {
		int result = countOccurances(new int[] {},0);
		Assert.assertEquals(0, result);
		
	}

}
