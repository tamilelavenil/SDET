package mandatoryHomework.week1.TwoPointer_SlidingWindow;

public class NumberOfSubstringsContainingAllThreeCharacters {
	/*
	 * https://leetcode.com/problems/number-of-substrings-containing-all-three-
	 * characters/description/
	 * Input: s = "abcabc"
		Output: 10
		Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab",
 		"bcabc", "cab", "cabc" and "abc" (again). 
 		
 		1)Iterate through the string with i=0
 		2)inner loop with j=i+2
 		3)take substring of i, j+1 (eg: 0,3 - abc)
 		4)check for abc and increase count
	 */	public static void main(String[] args) {
		 String s= "abcabc";
		 int count = 0;
	        int len = s.length();

	        for (int i = 0; i < len; i++) {
	            for (int j = i + 2; j < len; j++) {
	                String substring = s.substring(i, j + 1);
	                if (substring.contains("a") && substring.contains("b") && substring.contains("c")) {
	                    count++;
	                }
	            }
	        }

	       System.out.println(count);

	}

}
