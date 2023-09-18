package foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class PlusOne {
	@Test
	public void test1() {
		int[] input = Plus(new int[] {1,2,3});
		
		Assert.assertArrayEquals(new int[] {1,2,4}, input);
	}
	@Test
	public void test2() {
		int[] input = Plus(new int[] {4,3,2,1});
		
		Assert.assertArrayEquals(new int[] {4,3,2,2}, input);
	}
	@Test
	public void test3() {
		int[] input = Plus(new int[] {9});
		
		Assert.assertArrayEquals(new int[] {1,0}, input);
	}
	
	public int[] Plus(int[] input) {
		
		int len = input.length-1;
		
		if (input[len]==9) {
			int[] output1 = new int[2];
			output1[0] = 1;
			output1[1] = 0;
			return output1; 
		}
		
		if (len==0) {
			input[len]= input[len] + 1;
			return input; 
		
		}
		
		else {
			input[len] = input[len] +1;
			return input; 
		}
	}
}
