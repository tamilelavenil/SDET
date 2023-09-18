package foundation;

import org.junit.Assert;
import org.junit.Test;

public class CoinStack {
	// initialize count 
			//copy the given n in another variable -- for reduced count 
			//conditional to check if count is greater than 0
			//loop : condition check if i <=n ; increment by 1
			// condition to check reduced count in greater than or equal to zero
			// decrement by the loop index and increase count
			//return the count -1


	//Method1
		public int stackCoin(int n) {
			int count=0;
			int c= n;
			if(n>0) {
				for (int i = 1; i <=n; i++) {
					if(c>=0) {
						c=c-i;
						count++;
					}
					else {
						break;
					}
				}
				return count-1;
			}
			else {
				return 0;
			}

		}

		
		@Test
		public void test1() {
			Assert.assertEquals(2, stackCoin(5));

		}
		@Test
		public void test2() {
			Assert.assertEquals(3, stackCoin(8));

		}

		@Test
		public void test4() {
			Assert.assertEquals(4, stackCoin(10));

		}
		@Test
		public void test3() {
			Assert.assertEquals(0, stackCoin(0));

		}
}
