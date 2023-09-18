package foundation;

import org.junit.Test;

import org.junit.Assert;

public class ThreeDivisors {

	@Test
	public void Test1() {
		Assert.assertEquals(false, divisors(12));
	}
	public boolean divisors(int n){
		int count =0;
		 
		for (int i = 1; i <=n; i++) {
			if (n%i==0) {
				count++;
			}
		}
		return count==3;
	}
	}


