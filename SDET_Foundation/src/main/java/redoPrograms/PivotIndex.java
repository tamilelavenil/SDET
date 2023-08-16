package redoPrograms;

import java.util.Iterator;
import org.junit.Test;
import org.junit.Assert;

public class PivotIndex {
	/*
	Input Int array output integer

	test data
	{1,7,3,6,5,6}
	{1,2,3}
	{2,1,-1}

	1)Iterate through the array and get the sum of array
	2)Now iterate through the array check whether left sum = right sum
	3) if left sum = right sum equals return the index of value else return -1
	*/
	@Test
	public void Test1() {
		Assert.assertEquals(3, Pivot(new int[] {1,7,3,6,5,6}));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(-1, Pivot(new int[] {1,2,3}));
	}
	@Test
	public void Test3() {
		Assert.assertEquals(0, Pivot(new int[] {2,1,-1}));
	}
	
	public int Pivot(int[]arr) {		
		int totalsum = 0;
		for(int i = 0; i<arr.length; i++){
			totalsum += arr[i];

		}
		int leftsum =0;
		for(int j= 0; j<arr.length; j++){
			 
			if(leftsum==totalsum-arr[j]-leftsum){
				return j;
			}
			
			leftsum+=arr[j];

		}
		
		return -1;
	
		
	
	}	
		
		
		


	

}
