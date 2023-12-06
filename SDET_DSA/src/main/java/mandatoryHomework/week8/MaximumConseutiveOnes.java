package mandatoryHomework.week8;

public class MaximumConseutiveOnes {
	/*
	 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2 Output: 6
	 * 
	 * 1)Iterate through the array when there is ones
	 * 
	 * 2)if zeroes are there continue counting ones till k value
	 * 
	 * 3)after k value is 0 stop counting ones and update maximum ones
	 * 
	 * 4)now reset left and right pointer when again zero is there continue same logic and update count if greater
	 * 
	 */
	public static void main(String[] args) {
		
		int[]nums = {1,1,1,0,0,0,1,1,1,1,0};
		
		int k = 2, temp=k, left =0, right=0, count=0, maxCount=0;
		
		while(right<nums.length) {
			if(nums[right]==1) {
				right++;
				count = right - left;
				if(count>maxCount) maxCount=count;
				
			}
			else if(nums[right]==0 && temp>0) {
				temp=temp-1;
				right++;	
				count = right - left;
				if(count>maxCount) maxCount=count;
			}
		}
		
		
		
	}

}
