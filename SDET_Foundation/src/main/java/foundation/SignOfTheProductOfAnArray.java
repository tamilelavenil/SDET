package foundation;

import org.junit.Test;

import org.junit.Assert;

public class SignOfTheProductOfAnArray {
	
	@Test
	public void Test1() {
		Assert.assertEquals(1, SignofProduct(new int[] {-1,-2,-3,-4,3,2,1}));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(0, SignofProduct(new int[] {1,5,0,2,-3}));
	}
	@Test
	public void Test3() {
		Assert.assertEquals(-1, SignofProduct(new int[] {-1,1,-1,1,-1}));
	}
	@Test
	public void Test4() {
		Assert.assertEquals(1, SignofProduct(new int[] {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100}));
	}
	
	public int SignofProduct(int[] c) {
	int a =1;
	int b =0;
	for (int i = 0; i < c.length; i++) {
		a*=c[i];
		if (c[i]==0) {
			b = 0;
			return b;
		}
		if (c[i]<0) {
			b= -1*1;
		}	
		if (a>1) {
			b = 1;
		}
		
	}
		return b;
	}
	
}
