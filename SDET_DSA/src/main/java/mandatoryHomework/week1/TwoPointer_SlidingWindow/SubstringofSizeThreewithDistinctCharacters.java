package mandatoryHomework.week1.TwoPointer_SlidingWindow;

public class SubstringofSizeThreewithDistinctCharacters {
	/*
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-
	 * characters/description/
	 * Input: s = "xyzzaz"
	 *	Output: 1
	 *1)Iterate through the string
	 *2)take i and i+1 , i+2 if all the 3 chars are different then increment count+1
	 *3)iterate until length of string
	 */	public static void main(String[] args) {
		 
		 String s = "aababcabc";
		 
		 int output = 0;
		 
		 for (int i = 0; i < s.length()-2; i++) {
			if (s.charAt(i)!=s.charAt(i+1)&&s.charAt(i+1)!=s.charAt(i+2)&&s.charAt(i)!=s.charAt(i+2)) {
				output++;
			}
		}
		 
		 System.out.println(output);

	}

}
