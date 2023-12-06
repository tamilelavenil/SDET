package mandatoryHomework.week8;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxSumOfKElement {
	/*
	 * test data:
	 * int nums[] = {1,5,2,3,7,1}; int k=3;
	 * 
	 * 1)The window size is 3
	 * 2)first add three elements in the array
	 * 3)keep it as maxsum
	 * 4)now subtract the start value in subarray  and add the next value in array
	 * 5)check if the current sum is> maxsum and update
	 * 6)return maxsum 
	 * 
	 * 
	 */
	@Test
	public void test1() {
		int nums[] = {1,5,2,3,7,1}; int k=3;
		Assert.assertEquals(12,maxSumOfSubArray(nums,k));
	}
	public int maxSumOfSubArray(int nums[], int k) {
//		int maxSum=0;//int currSum=0;
//		for(int i=0; i<k; i++) {
//			maxSum +=nums[i];
//		}
//		int l=0, r=k;
//		while(r<nums.length) {
//			
//			
//			int currSum = maxSum-nums[l];
//			currSum = currSum+nums[r];
//			maxSum = Math.max(maxSum, currSum);
//			l++;r++;
//		}
//		
//		return maxSum;
		
		int maxSum=0;//int currSum=0;
//		for(int i=0; i<k; i++) {
//			maxSum +=nums[i];
//		}
		int  l=0,r=0;
		while(r<nums.length) {
			if(r<k) {
				maxSum +=nums[r];
				r++;
			}
			else {
			int currSum = maxSum-nums[l];
			currSum = currSum+nums[r];
			maxSum = Math.max(maxSum, currSum);
			l++;r++;}
			
		}
		
		return maxSum;
	}

}
