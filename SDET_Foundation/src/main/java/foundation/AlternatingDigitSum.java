package foundation;

import org.junit.Assert;

import org.junit.Test;

public class AlternatingDigitSum {
/*
 * Receive input as num and output as num
 * 
 * remainder = num % 10
 * if even position subtract from and store it in var 
 * if odd position add the value to var
 * return the var
 */
	@Test
	public void Test1() {
		Assert.assertEquals(4, Sum(521));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(-3, Sum(591));
	}
	@Test
	public void Test3() {
		Assert.assertEquals(1, Sum(111));
	}
	@Test
	public void Test4() {
		Assert.assertEquals(0, Sum(886996));
	}
	@Test
	public void Test5() {
		Assert.assertEquals(-1, Sum(12));
	}
	
	public int Sum(int inp) {
		int sum = 0,rem =0, count =0, count1=1;
		String a = Integer.toString(inp);
		if (a.length()%2==0) {
			while(inp>0) {
				rem = inp%10;
				
				if (count%2==0) {
					sum-=rem;
				}
				else {
					sum+=rem;
				}
				
				count++;
				inp = inp/10;
			}
		}
			else {
			while(inp>0) {
					rem = inp%10;
					
					if (count1%2==0) {
						sum-=rem;
					}
					else {
						sum+=rem;
					}
					
					count1++;
					inp = inp/10;
				}
		}
		return sum;
		}
}
	