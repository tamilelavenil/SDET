package foundation;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class SquaresofSortedArray {
@Test
	public void test1() {
		int[] num = squaresofArray(new int[] {-4,-1,0,3,10});
		
		Assert.assertArrayEquals(new int[] {0, 1, 9, 16, 100}, num);
	}
	
	public int[] squaresofArray(int[] num) {
		for(int i =0; i<num.length; i++) {
			num[i] = num[i] * num[i];
		}
		Arrays.sort(num);
		return num;
	}
}
