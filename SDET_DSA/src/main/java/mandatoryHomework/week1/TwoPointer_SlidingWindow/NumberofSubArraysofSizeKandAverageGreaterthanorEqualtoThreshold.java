package mandatoryHomework.week1.TwoPointer_SlidingWindow;

public class NumberofSubArraysofSizeKandAverageGreaterthanorEqualtoThreshold {
	/*
	 * https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-
	 * greater-than-or-equal-to-threshold/description/
	 * Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
		Output: 3
		1) add the numbers upto k
		2) check the avg/k >= threshold
		3) if the average of sum is greater than or equal to threshold increment output 
		4) iterate through the next numbers upto length of array and break when pointer < length of array
		5)from the average already found add the latest number
		6)remove the 1st index so latest 3numbers will be got.
		7) check for the condition and increment the output.
	 */	public static void main(String[] args) {
		int[] nums = {11,13,17,23,29,31,7,5,2,3};

		int k = 3, threshold = 5, pointer = 0, avg = 0, output = 0;

		while (pointer < k) {
			avg += nums[pointer++];
		}
		if (avg / k >= threshold) {
			output++;
		}
		while (pointer < nums.length) {
			avg += nums[pointer];
			avg -= nums[pointer - k];
			pointer++;
			if (avg / k >= threshold) {
				output++;
			}

		}

		System.out.println(output);
			

	}

}
