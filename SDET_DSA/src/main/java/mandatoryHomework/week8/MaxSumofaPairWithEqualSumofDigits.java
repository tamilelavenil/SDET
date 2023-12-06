package mandatoryHomework.week8;

public class MaxSumofaPairWithEqualSumofDigits {
	/*
	 * Input: nums = [18,43,36,13,7] Output: 54 Explanation: The pairs (i, j) that
	 * satisfy the conditions are: - (0, 2), both numbers have a sum of digits equal
	 * to 9, and their sum is 18 + 36 = 54. - (1, 4), both numbers have a sum of
	 * digits equal to 7, and their sum is 43 + 7 = 50. So the maximum sum that we
	 * can obtain is 54.
	 * 
	 * 1)write a separete function for sum of digits
	 * 2)iterate through the nums and find the sum of digits
	 * 3)add the nums value directly to key and sum of digit to value
	 * 4)if two pairs have same value sum the key and have it in a max value count and update the maxcount every time
	 */
	public static void main(String[] args) {
		int[] nums = {18,43,36,13,7};	
		
		for(int i =0; i<nums.length; i++) {
			
			//System.out.println(addDigits(12));
		}

	}
	
	private int addDigits(int input) {
		int sum =0;
		while(input>0) {
			int num  = input % 10;
			sum+=num;
			input=input/10;
			
		}
		return sum;
	}

}
