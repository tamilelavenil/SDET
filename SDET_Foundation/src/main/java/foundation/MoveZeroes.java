package foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroes {
	@Test
	public void test1() {
		int[] num = zero(new int[] {0,1,0,3,12});
		
		Assert.assertArrayEquals(new int[] {1, 3, 12, 0, 0}, num);
	}
	@Test
	public void test2() {
		int[] num = zero(new int[] {0});
		
		Assert.assertArrayEquals(new int[] {0}, num);
	}
	public int[] zero(int[] num) {
		int len = num.length;
		
		Arrays.sort(num);
		int count = 0;
		
		
		for (int i=0; i<num.length; i++) {
			if (num[i]>=1) {
				num[count] = num[i];
				count++;
			}
		}
	
		int sum = len -count;
		for (int j = len-1; j >=count; j--) {
			num[j]=0;
		}
		return num;
	}
}
