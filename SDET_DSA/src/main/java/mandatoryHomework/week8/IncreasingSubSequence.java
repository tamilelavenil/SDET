package mandatoryHomework.week8;

public class IncreasingSubSequence {
	/*
	 * Given an unsorted array of integers nums, return the length of the longest
	 * continuous increasing subsequence (i.e. subarray).
	 * 
	 * Test Data:
	 * int nums[] = {1,3,5,4,7} Output: 3
	 * int nums[] ={7,4,6,12,14,14,3} Output 4
	 * 
	 * 1)have left and right pointer at 0 and 1
	 * 2)increase right alone when it is in increasing order
	 * 3)update max count every time
	 * 4)when right is less than previous right break and do left =right and right = right+1
	 * 5)return the final value
	 * 
	 */
	public static void main(String[] args) {
		//int[] nums = {1,3,5,4,7};
		int[] nums = {2,4,3,5,0,7,11,12,13,14,15};
		//left = 0, right = 0, max_length = 1, current_length = 1
		int left =0, right =0, count =0,maxCount=0;
		
		while(right<nums.length-1) {
			if(nums[right+1]>nums[right]&& right < nums.length) {
				right++;
				count = right - left +1;
				if(count>maxCount) maxCount=count;
			}
			else {
				right++;
				left = right;
			}
			
		}
		
		System.out.println(maxCount);
		
		
	}

}
