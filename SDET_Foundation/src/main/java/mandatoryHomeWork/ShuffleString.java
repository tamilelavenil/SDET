package mandatoryHomeWork;

import org.junit.Test;
import org.junit.Assert;

public class ShuffleString {
	/*
	 * https://leetcode.com/problems/shuffle-string/description/
	 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
	   Output: "leetcode"	
	 * 1)Iterate through the indicesarr and charAt of string
	 * 2)create a new string and add values like array[indices[i]] = string.charAt(i)
	 * 3)iterate through the array and append each values in string and return output string
	 */	
	
		@Test
		public void Test1() {
			Assert.assertEquals("leetcode", Shuffle("codeleet", new int[] {4,5,6,7,0,2,1,3}));
		}
		
		@Test
		public void Test2() {
			Assert.assertEquals("abc", Shuffle("abc", new int[] {0,1,2}));
		}
		
		public String Shuffle(String s , int[] indices) {
			//create a new array to store correct position of strings
			char[] arr = new char[s.length()];
			StringBuilder finalString = new StringBuilder();
			for(int i=0; i<indices.length; i++) {
				arr[indices[i]] = s.charAt(i);
			}
			
			//append array values in stringbuilder
			for(char letter: arr) {
				finalString.append(letter);
			}
			
			
			return finalString.toString();
		}

}
