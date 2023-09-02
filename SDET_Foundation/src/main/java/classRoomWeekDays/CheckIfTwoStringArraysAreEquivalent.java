package classRoomWeekDays;

public class CheckIfTwoStringArraysAreEquivalent {
	/*
	 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
	 * description/
	 * 
	 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"] Output: true 
	 * Input: word1 =["a", "cb"],word2 = ["ab", "c"]
	 * Output: false
	 * 
	 * 1)iterate through both array add the strings
	 * 2)compare two strings and return boolean
	 */	public static void main(String[] args) {
		 String[] word1 = {"ab", "c"};
		 String[] word2 = {"a", "bc"};
		 String comp1="", comp2="";
		for(String a:word1) {
			comp1+=a;
		}
		for(String b:word2) {
			comp2+=b;
		}
		System.out.println(comp1+" "+comp2);
		System.out.println(comp1.equals(comp2));

	}

}
