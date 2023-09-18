package foundation;
import org.junit.Assert;
import org.junit.Test;

public class AddDigits {
/*
 * Given an integer num, 
 * repeatedly add all its digits until the result has only one digit, and return it. 
 * 
 * 1) receive a num as integer
 * 2) set a while loop to break until the num become single digit
 * 3) set a variable to store the quotient of num/10
 * 4) set a variable to store the remainder of num%10
 * 5)add both the variables and run the simplification again
 * 6)move the sum value to num 
 * 7) return sum
 */
	
	@Test
	public void Test1() {
		Assert.assertEquals(2, addInt(83));
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(0, addInt(0));
	}
	
	public int addInt(int num) {
		while(num>10) {
			int a = num/10;
			int b = num%10;
			num = a + b;
			
		}
		return num;
	}
}
