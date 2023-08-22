package mandatoryHomeWork;

import org.junit.Assert;

import org.junit.Test;


public class CanPlaceFlowers {
	/*
	You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

	Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

	 

	Example 1:

	Input: flowerbed = [1,0,0,0,1], n = 1
	Output: true
	Example 2:

	Input: flowerbed = [1,0,0,0,1], n = 2
	Output: false

	1) Receive input as an integer array and a integer
	2)Iterate throught the given array and place1(flowers for every third iteration)
	3) Reduce the number of flowers and check wther we have remaining
	4)If we have remaining false else true.
	*/
	@Test
	public void Test1() {
		Assert.assertEquals(true,PlaceFlowers(new int[] {1,0,0,0,1}, 1));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(false,PlaceFlowers(new int[] {1,0,0,0,1}, 2));
	}
	@Test
	public void Test3() {
		Assert.assertEquals(true,PlaceFlowers(new int[] {1,0,0,0,0}, 2));
	}
	public boolean PlaceFlowers(int[] flowerbed, int n) {
		int count=0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i]-1==0&&flowerbed[i]+1==0) {
				count++;
				
			}
		}
		return count==n;

//	for(int i=0; i<flowerbed.length; i=i+2){ //O[N]
//		if(flowerbed[i]!=1) {
//			flowerbed[i] = 1;
//			n= n -1;
//		}
//		if (n==0) {
//			break;
//		}	
//	}
//		return n==0;

}
}
