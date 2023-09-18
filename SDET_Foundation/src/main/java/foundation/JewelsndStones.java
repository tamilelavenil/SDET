package foundation;

import org.junit.Assert;
import org.junit.Test;

public class JewelsndStones {
	@Test
	public void Test1(){
		Assert.assertEquals(3, Jewel("aA","aAAbbbb"));
	}
	
	@Test
	public void Test2(){
		Assert.assertEquals(0, Jewel("z","ZZ"));
	}
	
	
	public int Jewel(String jewels, String stones) {
		char[] array = jewels.toCharArray();
		char[] array2 = stones.toCharArray();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (char c : array2) {
				if (c==array[i]) {
					count++;
				}
			}
						
			}
		return count;
		}

	}
