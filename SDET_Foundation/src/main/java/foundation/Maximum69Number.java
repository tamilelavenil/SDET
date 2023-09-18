package foundation;

import org.junit.Assert;
import org.junit.Test;

public class Maximum69Number {
	
	@Test
	public void test1() {
		Assert.assertEquals(9969, Max69(9669));	
	}
	@Test
	public void test2() {
		Assert.assertEquals(9999, Max69(9996));	
	}
	@Test
	public void test3() {
		Assert.assertEquals(9999, Max69(9999));	
	}

	public int Max69(int inp) {
		String str ="";
		str = str+inp;
		
		return Integer.parseInt(str.replaceFirst("6","9"));
}
}
