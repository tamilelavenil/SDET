package mandatoryHomework.week1.TwoPointer_SlidingWindow;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class LexicographicallySmallestPalindrome {
	/*
	 * https://leetcode.com/problems/lexicographically-smallest-palindrome/
	 * description/
	 * Input: s = "egcfe"
	 * Output: "efcfe"
	 * 
	 * 1)have two pointers on the start and end of string
	 * 2)check whether both are same, if same ++l and --r
	 * 3)if not same check which is smaller l or r
	 * 4)if l is smaller change r as l
	 * 5)if r is smaller change l as r
	 * 6)return output string
	 */	
	@Test
	public void Test1() {
		Assert.assertEquals("efcfe", Palindrome("egcfe"));
	}
	
	public String Palindrome(String s) {
		char[] charArr = s.toCharArray();
		StringBuilder build = new StringBuilder();
		int left = 0, right = charArr.length - 1;
		while (left < right) {

			if (charArr[left] != charArr[right]) {
				if (charArr[left] < charArr[right]) {
					charArr[right] = charArr[left];

				}
				if (charArr[right] < charArr[left]) {
					charArr[left] = charArr[right];

				}
			}
			left++;
			right--;
		}
		
		build.append(String.valueOf(charArr));

		return build.toString();
	}
}
