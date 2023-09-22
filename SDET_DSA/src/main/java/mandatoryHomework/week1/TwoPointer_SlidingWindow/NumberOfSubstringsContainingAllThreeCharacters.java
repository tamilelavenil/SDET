package mandatoryHomework.week1.TwoPointer_SlidingWindow;

public class NumberOfSubstringsContainingAllThreeCharacters {
	/*
	 * https://leetcode.com/problems/number-of-substrings-containing-all-three-
	 * characters/description/
	 * Input: s = "abcabc"
		Output: 10
		Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab",
 		"bcabc", "cab", "cabc" and "abc" (again). 
 		
 		1)while r< len iterate
 		2)increament the int array when a is present or b or c
 		3)when all three char is minimum of 1 start counting output
 		4)after starting to count output reduce the already counted alphabets by incrementing left and reducing count in array
 		5)continue the operation until either of the alphabet count becomes zero so that it becomes invalid
	 */	public static void main(String[] args) {
		 String s= "abcabc";
		 
		 int[] arr = new int[3];
		 
		 int l =0, r = 0, output = 0 , len = s.length();
		 
		 while(r<len) {
			 
			 arr[s.charAt(r)-'a']++;
			 
			 while(arr[0]>0&&arr[1]>0&&arr[2]>0) {
				 
					output+= len-r;
					
					arr[s.charAt(l++)-'a']--;
				 }
	
			 r++;
		
			 
		 }
		 System.out.println(output);
		 
		 
		 //bruteforce
//		 int count = 0;
//	        int len = s.length();
//
//	        for (int i = 0; i < len; i++) {
//	            for (int j = i + 2; j < len; j++) {
//	                String substring = s.substring(i, j + 1);
//	                if (substring.contains("a") && substring.contains("b") && substring.contains("c")) {
//	                    count++;
//	                }
//	            }
//	        }
//
//	       System.out.println(count);

	}

}
