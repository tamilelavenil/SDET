package classRoomWeekdays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class IntersectionOfTwoArraysII_TwoPointers {
	/* 
	 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
	 * Output: [2,2]
	 * 
	 * 1)Take output arrays length as the minimum of two array len given
	 * 2)keep left pointer in lesser length of array and right pointer in high len array
	 * 3)move right pointer from 0 till len
	 * 4)if value matches add in output array move left++ right ++
	 * 5)else right=0 left+1
	 * 
	 *  */
	public static void main(String[] args) {
		
		int[] nums1 = {4, 5, 9}, nums2= {4, 4, 8, 9, 9};
		List<Integer> list = new ArrayList();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		int left =0, right =0;
		
		while(left<nums1.length && right<nums2.length) {
			if (nums1[left]<nums2[right]) {
				left++;	
			}
			else if(nums1[left]>nums2[right]) {
				right++;
			}
			else{
			     list.add(nums1[left]);
			     left++;right++;
			     
			}	
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=list.get(i);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
}


