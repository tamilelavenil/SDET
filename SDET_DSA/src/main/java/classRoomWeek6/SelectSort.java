package classRoomWeek6;

import java.util.Arrays;

public class SelectSort {
	/*1)min index is 0
	 * 2)search min in list
	 * 3)Swap with val at min location
	 * 4)Increment MIN to point to next element
	 * 5)repeat until list is sorted
	 * */
	public static void main(String[] args) {
		int[] a = {6,2,1,5,3,4};
		int left =0, right =1;
		while(left<a.length && right<a.length) {
			//if(a[left]>a[right]){
				int temp = a[right];
				while(right<a.length) {
					if(a[right]<temp) {
						temp=a[right];
					}
					right++;
				}
				a[right]=a[left];
				a[left]=temp;
				left++;
				right=left+1;
			}
		System.out.println(Arrays.toString(a));
		}
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				
//				
//			}
//		}
		
	}


