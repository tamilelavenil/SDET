package mandatoryHomework.week1.TwoPointer_SlidingWindow;

public class FindTheArrayConcatenationValue {
	/*
	 * https://leetcode.com/problems/find-the-array-concatenation-value/description/
	 * 
	 * Input: nums = [7,52,2,4]
	 *	Output: 596
	 *
	 *1)itearate through the string with two pointer start and end
	 *2)take it as a string = nums[left]+nums[right]
	 *3)for the next iteration add it as number by converting string to num
	 *4)when there is no pair the middle number in array is directly added to result and return
	 * 
	 */	public static void main(String[] args) {
		int[] nums = {5,14,13,8,12};
		int left =0, right= nums.length-1;
		String concat="";
		long output = 0;
		
		while(left<right) {
			concat = Integer.toString(nums[left])+Integer.toString(nums[right]);
			if(concat!=null) {
			output+= Integer.parseInt(concat);}
			
			left++; right--;
			
			concat="";
			
		}
		
		if (nums.length%2!=0) {
			output+= nums[left];
		}
		
		System.out.println(output);
	}

}
