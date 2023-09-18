package foundation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNoOfOccurences {
/*
 * Given an Integer Array
 * Output Boolean
 * 
 * Use Map
 * In key value add the Number and pair we get the count of number
 * 
 * Check for duplicates in Map
 * 
 * if no duplicates return true if not false
 */
	@Test
	public void test1() {
		Assert.assertEquals(true, unique(new int[] {1,2,2,1,1,3}));	
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, unique(new int[] {1,2}));	
	}
	@Test
	public void test3() {
		Assert.assertEquals(true, unique(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));	
	}
	
	public boolean unique(int []array) {
	
		
		Arrays.sort(array);//[1,1,1,2,2,3]
		
		Set<Integer> set = new HashSet<Integer>();
		for (Integer integer : array) {
			set.add(integer);
		}
		
		System.out.println(set);
		int[] arr = new int[2002];
		String str = "";
		for (int i : set) {
			
			for (int j = 0; j < array.length; j++)	 {
				
				if (i==array[j]) {
					arr[i+1000]++;
				}	
			 }		
			}
		
		for (int i = 0; i < arr.length; i++) {
			
				if(arr[i] != 0 && arr[i] == arr[i + 1]) {
					return false;
				}
			}

		
		return true;
		
	}
}
