package foundation;

import org.junit.Assert;
import org.junit.Test;

public class PivotIndex {
	@Test
	public void Test1(){
		Assert.assertEquals(3, pivotIndex(new int[] {1,7,3,6,5,6}));
	}
	@Test
	public void Test2(){
		Assert.assertEquals(-1, pivotIndex(new int[] {1,2,3}));
	}
	@Test
	public void Test3(){
		Assert.assertEquals(0, pivotIndex(new int[] {2,1,-1}));
	}
	
	public int pivotIndex(int[] nums){
		
		//First for loop to get all the sum of array
		int totalsum = 0;
		int leftsum = 0;
		for (int i : nums) {
			totalsum = totalsum + i;
		}
		
		for (int i = 0; i < nums.length; i++) {
			//compare sum of leftsum with right sum if equals return index of number
			//ex: 11 == 28-11(subtract the left index from right)-6(subtract including pivot index expected)
			//so that we can get the right sum if equals return value
			if (leftsum == totalsum-leftsum-nums[i] ) {
				return i;
			}
			
			leftsum+=nums[i];
		}
	
		return -1;
	}
}
