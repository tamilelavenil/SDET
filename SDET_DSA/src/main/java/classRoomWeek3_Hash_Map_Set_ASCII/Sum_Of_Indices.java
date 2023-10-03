package classRoomWeek3_Hash_Map_Set_ASCII;

import java.util.Arrays;
import java.util.Iterator;

public class Sum_Of_Indices {
	/* Pseudocode 
	 * https://leetcode.com/problems/two-sum/description/
	 * unsorted array
	 * 1)iterate from left and right
	 * 2)sum left and right values in array
	 * 3)if sum == target return index left and right
	 * 4)if less than add left if greater reduce right
	 * 5)continue until left<right
	 * 
	 * */
	public static void main(String[] args) {
		int[] ind = {3,2,4};
		
		int target = 6,sum=0, l = 0, r = ind.length-1;
		int out[]= new int[2];
		
		for (int i = 0; i < ind.length; i++) {
			if (target-ind[r]==ind[i]) {
				out[0]=i;
				out[1]=r;
			}
			else {
				r--;
			}
		}
		
		System.out.println(Arrays.toString(out));
		
	}

}
