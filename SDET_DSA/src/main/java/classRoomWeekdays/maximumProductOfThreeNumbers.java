package classRoomWeekdays;

import java.util.Arrays;

public class maximumProductOfThreeNumbers {
	/* test data:
	 * n =  [3,5,8,1,2,0,6,4]
	 * n = [-1,-2,0,6,4,5,3,8,1]
	 * 	n = [1,5,6,6,7,10,11,3]
	 *
	 */
	public static void main(String[] args) {
		int[] n = {-20,-20,0,6,4,5,3,8,1};
		
		Arrays.sort(n);
		int l=0, r = n.length-1;
		
		int prod =1;
		
		if(n[l]*n[l+1]<=0) {
			
			prod = n[r]*n[r-1]*n[r-2];
		}
		
		else if(n[l]*n[l+1]>n[r]*n[r-1]) {
			prod = n[l]*n[l+1]*n[r];
		}
		
		else {
			prod = n[r]*n[r-1]*n[r-2];
		}
		
		System.out.println(prod);
	}

}
