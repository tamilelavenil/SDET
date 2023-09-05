package mandatoryHomeWork;

public class MaximumNumberofWordsInSentence {
	/*
	 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
	 * test data:
	 * sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
	 * sentences = ["please wait", "continue to fight", "continue to win"]
	 * 
	 * 1)given an string array
	 * 2)iterate through each value of array check for spaces and add count1 +1
	 * 3)after each sentence come out of loop and assign count1 to count
	 * 4)return the maximum words 
	 */	public static void main(String[] args) {
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int count1=0;
		
		for(String line:sentences) {
			int count =0;
			for(int i=0; i<line.length();i++) {
				if (line.charAt(i)==' ') {
					count++;
				}
			}
			if (count>count1) {
				count1=count;
			}
		}
		
		System.out.println(count1+1);

	}
//!(line.charAt(i)>='a'||line.charAt(i)>='A'&&line.charAt(i)<='z'||line.charAt(i)<='Z'||
}
