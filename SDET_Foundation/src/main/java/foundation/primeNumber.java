package foundation;

import org.junit.Assert;
import org.junit.Test;

public class primeNumber {

	@Test
	public void test1() {
		Assert.assertEquals(false, prime(111));
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, prime(4));
	}
	@Test
	public void test3() {
		Assert.assertEquals(true, prime(293));
	}
	public boolean prime(int input) {
		if(input<=1) {
			return false;
		}
		if (input==2||input==3) {
			return true;
		}
		
		if(input%2==0 || input%3==0) {
			return false;
		}
		
		for (int i = 5; i*i <= input; i+=6) {
			
			if (input%i==0 || input%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
}
