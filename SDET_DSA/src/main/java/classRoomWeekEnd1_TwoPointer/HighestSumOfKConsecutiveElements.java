package classRoomWeekEnd1_TwoPointer;

public class HighestSumOfKConsecutiveElements {
	/* input array = {1,5,2,3,7,1}
	 * K= 3
	 *  
	 * iterate through the array 
	 * sum = arr[i]+arr[i+1]+arr[i+2] store it in max sum
	 * find the sum upto len if the max sum is greater than current sum update the value
	 */
	public static void main(String[] args) {
		//int[] nums= {1,5,2,3,7,1};
		int[] nums= {1,5,2,3,7,1};
		int k= 3;
		 //1. one pointer should work
        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            currentSum += nums[pointer++];
        //3. continue the operation for rest of the array
        while( pointer < nums.length){
            max = Math.max(currentSum, max);
            currentSum += nums[pointer];
            currentSum-= nums[pointer-k];
            pointer++;
            //currentSum-= nums[pointer++-k];
           // currentSum += nums[pointer] - nums[pointer-k];
           //pointer++;
        }
        System.out.println(Math.max(currentSum, max));
        int a= Integer.MAX_VALUE, b= Integer.MAX_VALUE;
        System.out.println(a+b);
//		int maxsum = 0; 
//		for (int i = 0; i <= arr.length-k; i++) {
//			int sum=0;
//			for (int j = i; j < i+k; j++) {
//				sum+= arr[j];
//			}
//			if (sum>maxsum) {
//				maxsum=sum;
//				
//			}
//		}
//				
//		System.out.println(maxsum);
	}
//	 private int slidingWindow(int[] nums, int k){
//	        //1. one pointer should work
//	        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
//	        // not needed second pointer as this is balanced traversal ,right = k-1;
//	        //2. Do the required operation till k index
//	        while(pointer < k)
//	            currentSum += nums[pointer++];
//	        //3. continue the operation for rest of the array
//	        while( pointer < nums.length){
//	            max = Math.max(currentSum, max);
//	            currentSum += nums[pointer] - nums[pointer-k];
//	            pointer++;
//	        }
//	        return Math.max(currentSum, max);
//	    }

}
