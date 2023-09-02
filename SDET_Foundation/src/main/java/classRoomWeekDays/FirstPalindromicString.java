package classRoomWeekDays;

import org.junit.Assert;
import org.junit.Test;

public class FirstPalindromicString {
	/*
	 * https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
	 * Input: words = ["abc","car","ada","racecar","cool"]
	 *	Output: "ada"
	 *1)Get the input as string array
	 *2)iterate through the array and check each word is a palindrome or not
	 *3)if the first match is found break
	 *4)else assign empty string and continue
	 *5)return the first match
	 */
	@Test
	public void test1() {
		Assert.assertEquals("ada", Palindrome(new String[] {"abc","car","ada","racecar","cool"}));
	}
	@Test
	public void test2() {
		Assert.assertEquals("", Palindrome(new String[] {"def","ghi"}));
	}
	public String Palindrome(String[] words) {
		StringBuilder build = new StringBuilder();	
		String palindrome = "";
		for (String word : words) {
			build.append(word);
			if (build.reverse().toString().equals(word)) {
				return word;
			}
			else {
				build = new StringBuilder();
				continue;
			}
			
		}
		return "";

	}

}
