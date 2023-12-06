package mandatoryHomework.week8;

import java.util.Iterator;

public class IntersectionOfArrays {
	/*
	 * Test data
	 * only unique values in two arrays
	 * arr1= 1,2,3,4,5,6
	 * arr2= 4,5,6,7,8,9
	 * 
	 * 1)
	 */
	public static void main(String[] args) {
		int[] num1 = {1,2,3,4,5,6};
		int[] num2 = {4,5,6,7,8,9};
		
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if(num1[i]==num2[j]) {
					System.out.print(num1[i]+" ");
				}
			}
		}

	}

}
