package foundation;

import org.junit.Test;
import org.junit.Assert;

public class ReverseDigits {
	
@Test
public void Test1() {
	Assert.assertEquals(2, Reverse(200));
}

@Test
public void Test2() {
	Assert.assertEquals(122, Reverse(221));
}

	public int Reverse(int n) {
		int rem=0;
		
		int s=0;
		
		while(n>0) {
			rem = n%10;
			s= (s*10)+rem;
			n= n/10;
		}
		return s;
		
		

	}

}
