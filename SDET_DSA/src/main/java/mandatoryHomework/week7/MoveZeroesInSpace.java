package mandatoryHomework.week7;

import java.util.Arrays;

public class MoveZeroesInSpace {
	//https://leetcode.com/problems/move-zeroes/
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		
		 int left =0, right =0;

         while(right<nums.length){
            if(nums[left]==0&&nums[right]==0){
                right++;
            }
            // System.out.println(Arrays.toString(nums));     
            else if(nums[right]!=0){
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++; right++;
            }
             

            System.out.println(Arrays.toString(nums));            
        }
	}

}
//bruteforce N2 swap
//public int[] moveZeroes(int[] nums) {
//    for(int i = 0; i<nums.length; i++){
//        for(int j=i+1; j<nums.length; j++){
//
//            if(nums[i]==0){  
//            int temp = nums[i];
//
//            nums[i]=nums[j];
//
//            nums[j]=temp;}
//          
//        }
//    }
//    return nums;
//   }

