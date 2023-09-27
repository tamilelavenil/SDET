package mandatoryHomework.week2.DynamicSlidingWindow;

import java.util.Iterator;

public class MinimumRecoloursToGetKConsecutiveBlackBlocks {
	/*
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-
	 * blocks/description/
	 * 
	 * Input: blocks = "WBBWWBBWBW", k = 7
		Output: 3
		
		1)iterate through the string upto length-k
		2)for each string of index (iterate from i to k position)
		3)take the count of W
		4)compare it with previous value and have the minimum value as the latest one
	 */	public static void main(String[] args) {
		String blocks = "WWBBBWBBBBBWWBWWWB";
		
		int k =16 , output=Integer.MAX_VALUE, count=0;
		System.out.println(blocks.length());
		if(k==blocks.length()) {
		for (int j = 0; j < blocks.length(); j++) {
			if (blocks.charAt(j)=='W') {
				count++;							//O[N]
		}}
		System.out.println(count);
	}	
		
		
		for (int i = 0; i <= blocks.length()-k; i++) {
			int pointer = i, white =0;					//O[N]
			while(pointer<i+k) {
				if (blocks.charAt(pointer)=='W') {
					white++;
			}
				pointer++;
			}
			
			output = Math.min(white, output);
	}
	 
		
		System.out.println(output);					//O[2N]
		
		

	}

}
