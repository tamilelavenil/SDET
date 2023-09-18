package foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber {

	

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
	public int MissingNum(int[]input) {
		int count =0;
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			if (input[i]==count) {
				count++;
			}
			
		}
		
		return count;
		
	}
	
	
}
