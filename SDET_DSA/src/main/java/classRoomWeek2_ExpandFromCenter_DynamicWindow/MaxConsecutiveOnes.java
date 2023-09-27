package classRoomWeek2_ExpandFromCenter_DynamicWindow;

public class MaxConsecutiveOnes {
	/*
	 * https://leetcode.com/problems/max-consecutive-ones/description/
	 * Input: nums = [1,1,0,1,1,1]
		Output: 3
	 * 1)Iterate through the array if number =1 count ++
	 * 2)if not equals 1 send the max count to output and make counter as zero
	 * 
	 * Algorithm:
	 * 	1. Initialise left and right
        2. increase right till 1
        3. if number is zero, calculate the window of right-left and reset right and left as current index
	 */	public static void main(String[] args) {
		//bruteforce
		 
		  int[] nums = {1,1,0,1,1,1};
		  
		  int left =0 , right =0 , count =0, maxCount =0;
			
			while(right<nums.length) {
				if(nums[left]==nums[right]) {
					right++;
				}
				
				else {
					count = right - left;
					maxCount = Math.max(count, maxCount);
					left = right;
					right++;
					
				}
				
			}
			
			if (right==nums.length) {
				count = right - left;
				maxCount = Math.max(count, maxCount);
			}
			
			System.out.println(maxCount);
		 
	}

}
