package foundation;
import org.junit.Test;
import junit.framework.Assert;


public class nextBigCharacter {
	
	/*
	 * // Given a sorted character array and a target character, // find the next
	 * biggest character in the array. // Example : Input char[] inputArray ={b,d,h} Target Input = 'e'
	 * Pseudo Code:
	 * 1) Get Inputs as Character Array and character variable and provide inputs to the array and char variable
	 * 
	 * 2) Write a For Loop to traverse through the Character Array
	 * 
	 * 3) Check with a If condition whether the char[i] is greater than Target Input
	 * 
	 * 4) If the Char is greater than Target Input then Print the Character as next Big Character
	 * 
	 * 5) If the Target Input is 'z' then there will not be greater than 'z' so return 1st value in array.
	 * 
	 */

	@Test 
	public void test1()
	
	{
		Assert.assertEquals('b',nextBigCharacter( new char[] {'b','d','h'}, 'z'));;
		
	}
	@Test 
    public void test2()
	
	{
		Assert.assertEquals('b',nextBigCharacter( new char[] {'b','d','h'}, 'A'));;
		
	}

	

	public char nextBigCharacter(char[] input, char target) {
		for (int i = 0; i < input.length-1; i++) {
			
			if (input[i]>target) {
				return input[i];
			}
			
		}
		return input[0];
	}
	
}
