package foundation;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class CountingDuplicates {
	@Test
	public void tst1() {
		Assert.assertEquals(false, checkDup(new int[] {1,2,3,4}));	
	}

	@Test
	public void tst2() {
		Assert.assertEquals(true, checkDup(new int[] {1,2,3,4,1}));	
	}

	@Test
	public void tst3() {
		Assert.assertEquals(false, checkDup(new int[] {}));	
	}
	public boolean checkDup(int[] num) {

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]==num[j]) {
					return true;
				}
			}
		}
		return false;

	}

}
