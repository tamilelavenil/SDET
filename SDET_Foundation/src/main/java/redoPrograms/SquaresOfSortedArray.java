package redoPrograms;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		int count =1;
		int swap =0;
		for(int i = 0; i<nums.length; i++){
			nums[i]= nums[i] * nums[i];
	}
		for (int j = 0; j < nums.length; j++) {
			
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
