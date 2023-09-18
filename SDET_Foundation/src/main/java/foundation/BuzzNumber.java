package foundation;

import org.junit.Test;
import org.junit.Assert;

public class BuzzNumber {
//	Check Buzz Number in Java:
//
//		A number which either ends with 7 or divisible by 7 is called Buzz number. 
//		For example, 35 is a Buzz number as it is divisible by 7, similarly 47 is also a Buzz number as it ends with 7. 
//		In this tutorial,
//		 we will write java programs to check Buzz number and print Buzz numbers in a given range.

		/*
		Test data - 35, 47, 88, 86
		1) Input is a Integer and Output will be boolean

		2) check the input number is divisible by 7 Or the input number is ending with 7 then return true

		3)If not return false
		*/
		@Test
		public void Test1() {
			Assert.assertEquals(true, Buzz(7));
		}
		
		@Test
		public void Test2() {
			Assert.assertEquals(true, Buzz(47));
		}
		@Test
		public void Test3() {
			Assert.assertEquals(false, Buzz(88));
		}
		@Test
		public void Test4() {
			Assert.assertEquals(false, Buzz(0));
		}
		@Test
		public void Test5() {
			Assert.assertEquals(true, Buzz(-47));
		}
		@Test
		public void Test6() {
			Assert.assertEquals(true, Buzz(-7));
		}
	
		public boolean Buzz(int n) {
			if (n==0) {
				return false;
			}
			if (n % 7 == 0 || n % 10 == 7 || n % 10 == -7) {
				return true;
			}

			else {
				return false;
			}
		}

}
