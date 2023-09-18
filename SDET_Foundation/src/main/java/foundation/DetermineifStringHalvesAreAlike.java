package foundation;

import org.junit.Test;
import org.junit.Assert;

public class DetermineifStringHalvesAreAlike {
	@Test 
	public void test1()
	{
		char[] vowels = new char[] {'a','e','i','o','u','A','E','I','O','U'};
		
		Assert.assertEquals(true, StringHalves(vowels,"book"));
	}
	
	@Test 
	public void test2()
	{
		char[] vowels = new char[] {'a','e','i','o','u','A','E','I','O','U'};
		
		Assert.assertEquals(false, StringHalves(vowels,"textbook"));
	}
	
public boolean StringHalves(char[]vowels,String input) {
	int len = input.length()/2;
	
	String a = input.substring(0, len);
	
	String b = input.substring(len);
	int count1= 0;
	int count2= 0;
		
	for (int i = 0; i < vowels.length; i++) {
		for (int j = 0; j < a.length(); j++) {
			if(a.charAt(j)==vowels[i]) {
				count1++;
			}	
			if(b.charAt(j)==vowels[i]) {
				count2++;
			}
		}}
	return count1==count2;
	
}	
	
	
	
	
	
	
	
	
}
