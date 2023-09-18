package foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class CountPrimes {
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
	
	public int CountPrime(int inp) {
		
		if (inp==0||inp==1) {
			return 0;
		}
		
		if (inp==2) {
			return 1;
		}
		
		if(inp==3) {
			return 2;
		}
		
		else {
			int[] arr = new int[inp];
			int count=0;
			for (int i = 1; i < inp; i++) {
				arr[i]=i;
			}
			arr[0]= inp;
			Arrays.sort(arr);
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]%2==0) {
					continue;
				}
				
				else {
					count++;
				}
			}
			return count-1;
		}
	
	
	
	}
	}

