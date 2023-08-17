package redoPrograms;

public class FindSingleNumber {

	public static void main(String[] args) {
		int[] nums = {2,2,1};
		 int ans =0;
         
	        for(int i=0;i<nums.length;i++) {
	        	/*
	        	 * ans = 0 XOR 2 = 2(ans is 2)
	        	 * ans = 2 XOR 2 = 0(ans is 0)
	        	 * ans = 0 XOR 1 = 1(ans is 1)
	        	*/
	            ans ^= nums[i];
	        }
	        System.out.println(ans);

	}

}
