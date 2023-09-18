package foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class CountPrimesAlternateApproach {
	@Test
	public void test1() {
		Assert.assertEquals(4, CountPrime(10));
	}
	@Test
	public void test2() {
		Assert.assertEquals(0, CountPrime(0));
	}
	@Test
	public void test3() {
		Assert.assertEquals(0, CountPrime(1));
	}
	@Test
	public void test4() {
		Assert.assertEquals(25, CountPrime(100));
	}
	
	public int CountPrime(int inp) {
		int count = 0;
		for (int i = 2; i <= inp; i++) {
			if (isprime(i)) {
				count++;
			}
		}
		return count;
	}
	
	public boolean isprime(int j) {
		if(j<=1) {
			return false;
		}
		if (j==2||j==3) {
			return true;
		}
		
		if(j%2==0 || j%3==0) {
			return false;
		}
		
		for (int i = 5; i*i <= j; i+=6) {
			
			if (j%i==0 || j%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
}
