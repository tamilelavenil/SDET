package foundation;

import org.junit.Assert;
import org.junit.Test;

public class CheckifAllAAppearsBeforeAllB {

	@Test
	public void test1() {
		
		Assert.assertEquals(true, CheckAppear("aaabbb"));
	}
	
	@Test
	public void test2() {
		
		Assert.assertEquals(false, CheckAppear("abab"));
	}
	
	@Test
	public void test3() {
		
		Assert.assertEquals(true, CheckAppear("bbb"));
	}
	
	public boolean CheckAppear(String input) {
		
		if (input.contains("ba")) {
			return false;
		}
		
		return true;
	}
}
