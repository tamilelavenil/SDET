package mandatoryHomework.week8;

import java.util.ArrayList;
import java.util.List;

public class ListOfSubArraysWithTargetSum {
	/*
	 *1)Iterate through the array have left and right pointer
	 *2)if currsum equals target add to list increase left
	 *3)if greater also increase left
	 *4)if equals add to list -right = left
	 *
	 *babus Pseudocode
	 *•Start with first element 
	•If the sum is less than the desired sum, slide to the next element [Grow]
	•Again, sum that and check if it is lesser, equal or greater
	•If it is lesser, add the next element to slide [Grow]
	•If it is greater, than shrink the last element on the left [Shrink]
	•If it is equal, you got it and again do both Grow and Shrink [Slide]
	 *
	 */
	public static void main(String[] args) {
		int[] a = {1,7,4,3,1,2,1,5,1};
		int target =7;
		
		List<List<Integer>> list = new ArrayList();
		
		int left =0 , right =0;
		while(right<a.length) {
			int sum=0;
			if(left<a.length) sum += a[right];
			
			if(sum<target) {
				right++;
			}
			else if(sum>target) {
				left++;
			}
			else if(sum==target&&right<a.length) {
				
//				List<Integer> list1 = new ArrayList();
//				list1.add(a[right]);
//				if(left!=right) {
//					list1.add(a[left]);
//					list1.add(a[right]);}
//				list.add(list1);
				left++;right++;
			}
			
		}
		
		System.out.println(list);
	}

}
