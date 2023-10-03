package classRoomWeekdays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nested_List_Hackerrank_Array_Queries_Sub_Array {

	public static void main(String[] args) {
		int[] ss = {9, 8, 7, 6, 5, 4, 3, 2, 1,0};
		
		List<Integer> arrr = new ArrayList(Arrays.asList(ss));
		System.out.println(arrr.get(0));
		
		 List<Integer> arr = new ArrayList<Integer>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1,0));
//	    List<List<Integer>> operations = new ArrayList(Arrays.asList(Arrays.asList(0, 9), Arrays.asList(4, 5)));
		 
		 List<List<Integer>> operations = new ArrayList(Arrays.asList(Arrays.asList(0,9),
				 Arrays.asList(4, 5),
	                Arrays.asList(3, 6),
	                Arrays.asList(2, 7),
	                Arrays.asList(1, 8),
	                Arrays.asList(0, 9))
				 );
		 for(List<Integer> list : operations) {
			 int left = list.get(0);
			 int right = list.get(1);
			 reverse(arr,left,right);
		 }
//	    
//	    for (List<Integer> list : operations) {
//	    	 int left = list.get(0);
//	 	     int right = list.get(1);
//	 	    rev(arr,left,right);
//		}
//	    
	    System.out.println(arr);
	    
	}
	
	public static void reverse (List arr,int left,int right) {
		
		while(left<right) {
			int temp = (Integer)arr.get(left);
			arr.set(left, arr.get(right));
			arr.set(right,arr.get(left));
			left++;right--;
		}
	}
	
	
	
	
	
	
	
//	public static void rev(List arr, int left, int right) {
//		while (left < right) {
//            int temp = (Integer) arr.get(left);
//            arr.set(left, arr.get(right));
//            arr.set(right, temp);
//            left++;
//            right--;
//        }
//	}
}
