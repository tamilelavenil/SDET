package classRoomWeekEnd1_TwoPointer;

import java.util.Arrays;

public class MoveZeroes {
//	Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//	Note that you must do this in-place without making a copy of the array.
//	 
//	Example 1:
//	Input: nums = [0,1,0,3,12]
//	Output: [1,3,12,0,0]
	/*
	 *  1) iterate through the array
	 *  2) keep pointer as 0 and 1 to iterate
	 *  3) if pointer 1 is greater than 0 swap two values
	 *  4) if pointer 1 and pointer 0 equals 0 increment pointer +1
	 *  5) if greater than 0 swap
	 *  6) return array
	 */	
	public static void main(String[] args) {
		//int[] nums = {0,1,0,3,12};
		int[] nums = {1,2,0,0,1};
		int index2 = 1;
		int index1 =0;
		
		while(index2!=nums.length) {
			if (nums[index2]>0) {
				int temp = nums[index1];
				nums[index1]=nums[index2];
				nums[index2]=temp;
			}
			else if(nums[index1]==nums[index2]) {
				index2++;
				int temp1 = nums[index1];
				nums[index1]=nums[index2];
				nums[index2]=temp1;
			}
			index1++;
			index2++;
		}
		
		System.out.println(Arrays.toString(nums));

	}

}
