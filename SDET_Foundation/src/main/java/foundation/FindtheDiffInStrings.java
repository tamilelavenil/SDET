package foundation;



import org.junit.Assert;
import org.junit.Test;

public class FindtheDiffInStrings {

	@Test
	public void Test1(){
		Assert.assertEquals('e', Difference("abcd","abcde"));
	}
	
	public char Difference(String s, String t) {
		
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		char c = 0;
		for (char d : a) {
			c ^= d;
		}
		for (char e : b) {
			c ^= e;
		}
		
		return c;

	}
}
