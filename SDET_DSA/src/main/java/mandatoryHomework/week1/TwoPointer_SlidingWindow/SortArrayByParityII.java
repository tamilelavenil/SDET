package mandatoryHomework.week1.TwoPointer_SlidingWindow;

import java.util.Arrays;

public class SortArrayByParityII {
	/*
	 * https://leetcode.com/problems/sort-array-by-parity-ii/description/
	 * 
	 * Example 1:

		Input: nums = [4,2,5,7]
		Output: [4,5,2,7]
		Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
		
		1)have a output array to return result
		2)iterate through the nums array take all the odd digits and add it in odd position of out array
		3)iterate through the nums array take all the even digits and add it in even position of out array
		4)return the out array
	 */	
	public static void main(String[] args) {
		int[] nums = {4,2,5,7};
		
		int out[] = new int[nums.length];
		int index = 0, index1=1, left=0, right = nums.length-1;
		
		 for (int i = 0; i < nums.length; i++) {
		 	if(nums[i]%2==0&& index<out.length) {
		 	out[index]= nums[i];
		 	index+=2;}
		 		if(nums[i]%2!=0 && index1<out.length) {
		 	out[index1]= nums[i];
		 	index1+=2;}
		 }
		

		System.out.println(Arrays.toString(out));
	}

}
