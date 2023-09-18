package foundation;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceAllDigitswithCharacters {

	@Test
	public void Test1(){
		Assert.assertEquals("abcdef", ReplaceDigitsWithChar("a1c1e1"));
	}
	
	@Test
	public void Test2(){
		Assert.assertEquals("abbdcfdhe", ReplaceDigitsWithChar("a1b2c3d4e"));
	}
	
	
	public String ReplaceDigitsWithChar(String input) {
		char[] a = input.toCharArray();
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>0) {
				b[i]=a[i];
			}
		}
		for (int i = 1; i < b.length; i++) {
			if (i%2!=0) {
				b[i] = b[i-1]+b[i]-'0';
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			a[i]= (char)b[i];
		}
		String output = new String(a);
		return output;	
	}
}
