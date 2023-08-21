package redoPrograms;

import org.junit.Test;

import org.junit.Assert;

public class ArrangingCoins {
	/*
	https://leetcode.com/problems/arranging-coins/

	input n number of coins given
	build a staircase with given coins the ith row contains ith coins
	return the complete number of rows built

	iterate through the steps we need to build
	eg 1 step needs 1 coin get from coins we have
	iterate through and subtract coins for each step return the complete rows
	*/
	@Test
	public void Test1() {
		Assert.assertEquals(3,Steps(5));
	}
	
	
	public int Steps(int n) {
		int coins=n; //o 1
		for(int steps=1; steps<=n; steps++){ //o n
			coins-=steps;
		if(coins<=0){ // o 1
		return steps; // o 1
		}
		

		}
		return 0; // o 1
		

	}

}
