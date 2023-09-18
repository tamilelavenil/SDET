package foundation;

import java.util.Arrays;

import org.junit.Assert;

import org.junit.Test;

public class indices_sum{
	 /*Pseudo code:
	     * 
	     * 1) Initialize the integer array num and variable target
	     * 2) iterate num array 
	     * 3) Traverse through the entire array from  0 < then array length.
	     * 4) if sum of a[i] +a[i+1] = = target
	     *             return arrayPosition
	     */ 
@Test
public void test1() {
	int[] actual = indices(new int[] {2,7,11,15},9);
	
	Assert.assertArrayEquals(new int[] {0,1}, actual);
}


public int[] indices(int[] ind,int target) {
	
	int[] intArray = new int[1];
	for (int i = 0; i < ind.length; i++) {
		for (int j = i+1; j < ind.length; j++) {
			if (ind[i]+ind[j]==target) {
				return new int[] {i,j};
			}
		}
	}
  return new int[] {-1,-1};  
}
}