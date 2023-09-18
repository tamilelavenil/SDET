package foundation;

import org.junit.Assert;
import org.junit.Test;

public class powerOfThree {
	@Test
	public void Test1() {
		Assert.assertEquals(true, power(27));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(false, power(0));
	}
	@Test
	public void Test3() {
		Assert.assertEquals(false, power(-1));
	}
	public boolean power(int input) {
		
		int a = input/10;
		int b = input%10;
		input = a + b;
		if(input==3||input==6||input==9) {
			return true;	
		}
		else {
			return false;
		}
	}
}
