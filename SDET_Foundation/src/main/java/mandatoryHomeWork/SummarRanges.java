package mandatoryHomeWork;

import java.util.ArrayList;

public class SummarRanges {
	/*https://leetcode.com/problems/summary-ranges/
	Sample:
	Input: nums = [0,1,2,4,5,7]
	Output: ["0->2","4->5","7"]

	Input: nums = [0,2,3,4,6,8,9]
	Output: ["0","2->4","6","8->9"]

	1) Receive the integer array as input
	2) Iterate through the array check if numbers in array are sequential 
	3)If there group the start and end as "2->4" also 
	4) check if the arr[i] +1 and -1 is available if not add the value as "2".
	5) add both the values in ascending order to the list and return
	*/
	public static void main(String[] args) {
		int [] nums = {0,1,2,4,5,7};
		String con = "";
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < nums.length; i++) {
			
		    if ( i < nums.length - 1 &&nums[i+1] - nums[i] == 1) {
		        if (con.isEmpty()) { //even if condition satisfy until string is empty it will not come inside if so it will iterate through range
		            con += nums[i];  // Add the first number of the range //0
		        }
		    } else {
		        if (!con.isEmpty()) {// when the if cond fails it add the end range num
		            con += "->" + nums[i];  // Add the last number of the range
		            list.add(con);
		            con = "";
		        } else { //if all of the above condition fails it will come to else and add single number
		            list.add(Integer.toString(nums[i]));  // Single number
		        }
		    }
		}

		System.out.println(list);
}
}
