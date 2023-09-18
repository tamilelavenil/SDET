package foundation;

import org.junit.Test;

import junit.framework.Assert;
public class majorityElement{
	/*
	 * Receiving Input as a Integer Array and Provide a solution to find the 
	 * Maximum number of occurences of a number in a Array. 
	 * Considering The majority element is the element that appears more than ⌊row length / 2⌋ times
	 * 
	 * 1)Initialize a Count and Output variable as 0
	 * 2)Write nested for Loop with i=0 and j=0 and compare the array
	 * 3) If the value matches increase the count
	 * 4 If the count is greater than row length/2 then that is the output
	 */

	@Test
	public void test1() {

		Assert.assertEquals(2, majorityEle(new int[] {2,2,1,1,1,2,2}));
	}

	@Test
	public void test2()
	{
		int[] inp2= {3,2,3};
		Assert.assertEquals(3, majorityEle(inp2));
	}
	
	public int majorityEle(int[] input) {
	
	int output=0;
	for(int i=0;i<input.length;i++)
	{
		int counter=0;
		for(int j=0;j<input.length;j++)
		{
			if(input[i]==input[j])
			{
				counter++;
			}
			
		}
		if(counter>input.length/2)
		{
			output=input[i];
		}
	}
	return output;
}


}

