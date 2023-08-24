package classRoomWeekDays;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysLeftRotation {
/*
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 * 
 * input
 * a = 1 2 3 4 5 n = 1
 * output = 5 1 2 3 4
 * 
 * 1) iterate through the array until the d value and add in reverse order of new array
 * 2)iterate through the array again and add the values until d to new array
 * 3) return the new array
 */
	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int n = 2;
		int c = a.length-n;
		int len =a.length;
		int[] b = new int[a.length];
		//add the numbers till n need to be rotated
		for (int i = 0; i < n; i++) {
			b[len-n] = a[i];
			len++;
		}
		int count =0;
		// add the remaining digits to array
		for (int i = n; i < a.length; i++) {
			b[count]=a[i];
			count++;
		}
		
		System.out.println(Arrays.toString(b));
	}

}
