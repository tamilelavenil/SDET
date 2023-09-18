package foundation;

import org.junit.Assert;
import org.junit.Test;



public class RemoveElementArray {
	/*
	 *  Removing the target element from the array and returning the remaining 
	 *  1) Input a Int array and target values as input
	 *  2) Write a for loop , Iterate through the int array input and find the count of numbers remaining other than target element and store in a variable
	 *  3) declare a int array with size as counter found above
	 *  4) declare a variable index to add the values in output array without zeroes
	 *  5)write a for loop iterate over input again and set a If condition where inputarray[i] not equals the target element then the value is added to output array with
	 *  index --output[index] = input [j] now no zeroes will be added on target positions in array
	 *  6)return the output array.
	 *  
	 */
	
	@Test
	public void test1() {
		int[] input = RemoveElement(new int[] {2, 3, 3, 4, 5},3);
		
		Assert.assertArrayEquals(new int[] {2,4,5}, input);
	}

	
	public int[] RemoveElement(int[]input, int target) {
		int counter =0;
		int index =0;
		
		for (int i = 0; i < input.length; i++) {
			if(input[i]!=target) {
				counter++;
			}
		}

		int[] output = new int[counter];
		for(int j=0; j<input.length; j++) {
			if(input[j]!=target)
			{
				output[index]=input[j];
				index++;
			}		
			
		}
		return output;
	}
	
}

