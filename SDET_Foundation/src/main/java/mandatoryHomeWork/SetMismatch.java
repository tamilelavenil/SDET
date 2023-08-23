package mandatoryHomeWork;

import java.util.Arrays;
import java.util.Iterator;

public class SetMismatch {
/*
 * https://leetcode.com/problems/set-mismatch/
 * You have a set of integers s, which originally contains all the numbers from 1 to n.
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, 
 * which results in repetition of one number and loss of another number.
  You are given an integer array nums representing the data status of this set after the error.
  Find the number that occurs twice and the number that is missing and return them in the form of an array.
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:
Input: nums = [1,1]
Output: [1,2]









Test Data:
{1,2,2,4}
{2,2}
{3,2,2};
{1,5,3,2,2,7,6,4,8,9};
{3,2,3,4,6,5};
1)receive the input as integer
2)create a arrayfor len of array
3)iterate through input array and save the repeated number in output array and update duplicate to zero
4)now do xor operation for two arrays and save difference in output array
return the output as integer
 */
	public static void main(String[] args) {
		int[] nums ={1,5,3,2,2,7,6,4,8,9};		
		int[] res = new int[2];		
		Arrays.sort(nums); 
		//number missed
		int len = nums.length;
		int[] compare = new int[len];
		int a =1;
		
		//adding the array of numbers with respect to nums length
		//creating compare array
		for (int l = 0; l < len; l++) {
			compare[l]=a;
			a=a+1;
		}
		//number repeated
				for (int k = 0; k < nums.length; k++) {
					if (nums[k]==nums[k+1]) {
						res[0]=nums[k];
						nums[k]=0;
						break;
					}
				}
				//Arrays.sort(nums);			
		//comparing both nums and compare array
				int xor =0;
				for (int i : nums) {
					xor ^= i;
				}
				
				for (int j : compare) {
					xor ^= j;
				}
		
				res[1]=xor;
		
		System.out.println(Arrays.toString(res));
	}
}

