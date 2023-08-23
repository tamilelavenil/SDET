package mandatoryHomeWork;

import java.util.Arrays;

import org.junit.Test;

import org.junit.Assert;

public class ArrayPartition {
/*
 * https://leetcode.com/problems/array-partition
 * 
 * Test data:
 * 
 * [1,4,3,2] || [6,2,6,5,1,2]
 * 
 * 1)Sort the given int array in ascending order
 * 2)now all the miniumum maximum numbers get paired
 * 3)iterate through the array add i and iterate i+2 to get only minimum numbers
 * 4)sum the numbers and return
 */
	@Test
	public void test1() {
		Assert.assertEquals(4, Partition(new int[] {1,4,3,2}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(9, Partition(new int[] {6,2,6,5,1,2}));
	}
	public int Partition(int[]nums) {
		
		  Arrays.sort(nums);
	        int sum = 0;
	        for(int i=0; i<nums.length; i=i+2){
	            sum+=nums[i];
	        }
	        return sum;

	}

}
