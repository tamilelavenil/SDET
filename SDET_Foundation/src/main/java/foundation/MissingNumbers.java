package foundation;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumbers {
	@Test
	public void Test1(){
		Assert.assertEquals(2, MissingNum(new int[] {3,0,1}));
	}
	@Test
	public void Test2(){
		Assert.assertEquals(2, MissingNum(new int[] {0,1}));
	}
	@Test
	public void Test3(){
		Assert.assertEquals(8, MissingNum(new int[] {9,6,4,2,3,5,7,0,1}));
	}
	public int MissingNum(int[] arr)  {
		
		int a = arr.length;
		
		int n = (a*(a+1))/2;
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return n-sum;
		

	}

}
