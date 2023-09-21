package classRoomWeekdays;

import java.util.Arrays;

public class ProductOfElementExceptIndex {
	/*
	 * given a array of nums {1,2,3} return output array with product of elts except
	 * elt at index output = {6,3,2}
	 * 1)iterate through the array multiply the array values except the index position update the value in output array
	 * 2)
	 */
	public static void main(String[] args) {
		//int[] nums= {1,2,3};
		int[] nums= {0,1,2};
		int [] out = new int[nums.length];
		int prod =1;
		boolean zero = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0) {
				prod*=nums[i];
			}
			if (nums[i]==0) {
				zero=true;
			}
		}
		
		for (int i = 0; i < out.length; i++) {
			if(zero==true&&nums[i]==0) {
				out[i]=prod;
			}
			if (zero==false) {
				out[i]=prod/nums[i];
			}
			
		}
		System.out.println(Arrays.toString(out));
	}

}

//for (int i = 0; i < nums.length; i++) {
//int product =1;
//for (int j = 0; j < nums.length; j++) {
//	if (j!=i) {
//		product *= nums[j];
//	}
//}
//
//out[i]=product;
//}
