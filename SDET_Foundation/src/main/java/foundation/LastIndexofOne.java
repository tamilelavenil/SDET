package foundation;

import org.junit.Assert;
import org.junit.Test;

public class LastIndexofOne {
/*
 * Convert S to char Array
 * Iterate through the values of array in reverse
 * If array[i[ equals 1 return i
 */
	
	public int Index(String inp) {
	char [] arr = inp.toCharArray();
	int out = 0;
	if (inp=="0") {
		return -1;
	}
	for (int i = arr.length-1 ;i>=0; i--) {
		if (arr[i]=='1') {
			out = i;
			break;
		}			
	}
	return out;
	}
	
	
	@Test
	public void Test1() {
		Assert.assertEquals(4, Index("00001"));
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(2, Index("00100"));
	}
	@Test
	public void Test3() {
		Assert.assertEquals(-1, Index("0"));
	}
}
