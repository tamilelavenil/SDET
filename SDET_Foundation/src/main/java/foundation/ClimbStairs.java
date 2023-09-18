package foundation;

import org.junit.Assert;
import org.junit.Test;

public class ClimbStairs {
/*
 * The claim stairs logic follows Palindrome method
 * 
 * 
 */
	@Test
	public void Test1() {
		Assert.assertEquals(21, stairs(7));
	}
	public int stairs(int num) {
		int x=0,y=1,temp;
		
		
		for(int i=0; i<=num; i++) {
			temp = x;
			x =x+y;
			y = temp;
			
		}
		return x;
	}
}
