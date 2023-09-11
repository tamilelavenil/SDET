package mandatoryHomeWork;

import java.util.Arrays;

public class HeightChecker {
	/*
	https://leetcode.com/problems/height-checker/description/

	1)Create a copy of heights as expectedHeight Array and sort it.
	2)Iterate through the heights array and check the corresponding ith position with expectedheight
	3)if the heights[i] != expectedheight[i]
	4)increase the output count +1
	*/
	public static void main(String[] args) {
		int[] heights = { 1, 1, 4, 2, 1, 3 };

		int output = 0;

		int[] expectedHeight = Arrays.copyOf(heights, heights.length);

		Arrays.sort(expectedHeight);

		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != expectedHeight[i]) {
				output++;
			}
		}

		System.out.println(output);

	}

}
