package foundation;
import org.junit.Test;

import org.junit.Assert;

public class LengthofLastWord{
	
	/*
	 *  trim the input string with leading and trailing spaces
	 *  
	 *  write a for loop to iterate from reverse
	 *  
	 *  write a if condition to check the first space and in else break the loop and return length 
	 */
	@Test
	public void test1() {
		
		Assert.assertEquals(5, LastWord("Hello World"));
	}
	
	
	public int LastWord(String input) {
		
		String temp = input.trim();
		
		int result =0;
		
		for (int i = temp.length()-1; i >=0; i--) {
			
			if (temp.charAt(i)!=' ') {
			//	result = result + temp.charAt(i);
				result++;
			}
			else {
				break;
			}
			
		}
		return result; //we can also bring the string here and return length of string
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}