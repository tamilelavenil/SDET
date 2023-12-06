package mandatoryHomework.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareOfNumbersInAscending {
	/*
	 * Given an integer array nums sorted in non-decreasing order, return an array
	 * of the squares of each number sorted in non-decreasing order.
	 * 
	 * Example 1: Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation:
	 * After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes
	 * [0,1,9,16,100]. Example 2: Input: nums = [-7,-3,2,3,11] Output:
	 * [4,9,9,49,121]
	 * 
	 * 1)square the numbers for the given array and update the same array
	 * 2)now sort the array and return array value [either arrays.sort or swap and sort using two pointer]
	 *
	 */
	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10,-12,-15 };
//		for (int i = 0; i < nums.length; i++) {
//			int sq = nums[i] * nums[i];
//			nums[i] = sq;
//
//		}
		int left = 0, right = nums.length-1;
		
		int[] result = new int[nums.length];
		
		for(int i=nums.length-1;i>=0;i--) {
			if(Math.abs(nums[left])<Math.abs(nums[right])) {
				result[i] = nums[right]*nums[right];
				right--;
			}
			else {
				result[i] = nums[left]*nums[left];
				left++;
			}
		}
		System.out.println(Arrays.toString(result));
//		while (left < nums.length - 1) {
//			if (nums[left] > nums[right] ) {
//				int a = nums[right];
//				nums[right] = nums[left];
//				nums[left] = a;
//				right++;
//			}			
//			if (right == nums.length - 1) {
//				left++;
//				right = left + 1;
//			}
//			
//			else if (nums[right] > nums[left] ) {
//				right++;
//			}
//		}
		//System.out.println(Arrays.toString(nums));
	}

}
