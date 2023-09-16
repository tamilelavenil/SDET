package classRoomWeek1TwoPointer;

import java.util.Arrays;

public class SortedArray {
//	Given a sorted array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//			Input: nums = [2,3,5,7], target = 9
//			Output: [0,3]
//			Output: Because nums[0] + nums[3] == 9, we return [0, 3].
	//iterate until sum !=target
	//if sum> target indice 2-- else indice1 ++
	// return index 1 and 2 in output array

	public static void main(String[] args) {
		int[] nums = {2,3,5,7}; 
		int target =9;
		int[] out = new int[2];	
		int ind1 = 0;
		int ind2 = nums.length-1;
		int sum=0;
		while(sum!=target) {
			sum = nums[ind1]+nums[ind2];
			if (sum>target) {
				ind2--;
			}
			if (sum<target) {
				ind1++;
			}
				
			if (sum==target) {
			out[0]=ind1;
			out[1]=ind2;
		}
			
		}
		
		System.out.println(Arrays.toString(out));

	}

}
