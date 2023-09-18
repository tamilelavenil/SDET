package foundation;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class AliceCandies {
	/*
	 * Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.

		The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.

		Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
		
		1) Receive the type of candies as a int array
		
		2) remove the duplicates by declaring a for each loop and moving array to string
		
		3) declare a int variable to get the allowed candy alice can eat (n/2)
		
		4)use Math.min(set size, allowed candies to eat)
	*/
	
	@Test
	public void test1() {
		
		Assert.assertEquals(3, aliceCandy(new int[] {2, 3, 3, 4, 5}));
		
	}
	@Test
	public void test2() {
		
		Assert.assertEquals(2, aliceCandy(new int[] {1,1,2,3}));
		
	}
	@Test
	public void test3() {
		
		Assert.assertEquals(1, aliceCandy(new int[] {6,6,6,6}));
		
	}
	
	public int aliceCandy(int[] input) {
		
		int allowedcandy = input.length/2;
		
		Set<Integer> set = new HashSet<Integer> (); 
		
		for(int iterator: input) {
			set.add(iterator);
			}
		 //Alice is allowed to eat only allowed candy that is n/2 if the 
		//set size equals the allowed candy for example 3,3 the ouput is 3
		//if allowed candy value is 4 but set size is 1 alice is aloowed to eat only one per variety.
	  return(Math.min(set.size(), allowedcandy)); 
	
	}
}

