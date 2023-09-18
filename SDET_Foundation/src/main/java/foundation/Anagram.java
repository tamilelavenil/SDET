package foundation;

import org.junit.Assert;
import org.junit.Test;

public class Anagram {
	@Test
	public void Test1() {
		Assert.assertEquals(true, AnagramCheck("anagram","nagaram"));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(false, AnagramCheck("rat","car"));
	}
	
	public boolean AnagramCheck(String a, String b) {
		int inp1 = 0;
		int inp2 = 0;
		for (char i : a.toCharArray()) {
			inp1+=i;
		}
		for (char j : b.toCharArray()) {
			inp2+=j;
		}
	
		return inp1==inp2;
	}
}
