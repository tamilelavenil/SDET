package classRoomWeekdays;

public class MaximumSumOfK_ChargeBee {
	/*
	 * // 3) find the greatest sum of numbers based on the k value given: // input :
	 * [10,3,33,5,2,32,21,14,17,8,9] & k=3
	 * 
	 * 1)Iterate through the array for first k values
	 * 2)sum the values and keep it as max sum
	 * 3)now iterate through the rest of array and add latest to sum remove the latest-k value from sum
	 * 4)check if the latest sum is greater than the previous is greater have updated one to result
	 */
	public static void main(String[] args) {
		int[] arr = {10,3,33,5,2,32,21,14,17,8,9};
		
		int k =3, right = 0,left=0, sum=0, maxsum=0;
		
		while(right<k) {
			sum+=arr[right++];
		}
		if (sum>maxsum) maxsum = sum;
		
		while(right<arr.length) {
			
			sum-=arr[left];
			
			sum+=arr[right];
			
			if (sum>maxsum) maxsum = sum;
			
			left++;right++;
			
		}
		
		System.out.println(maxsum);

	}

}
