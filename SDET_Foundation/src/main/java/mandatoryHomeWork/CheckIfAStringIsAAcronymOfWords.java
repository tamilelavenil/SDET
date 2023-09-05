package mandatoryHomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckIfAStringIsAAcronymOfWords {
/*
 * https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/submissions/
 * 1)Iterate through the list get the first char of the word and add it
 * 2)check if the string and given acronym is equal and return true or false
 */
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>(Arrays.asList("alice","bob","charlie"));
		String s = "abc";
		StringBuilder checkAcronym = new StringBuilder();
		for(String word:words) {
			char firstchar = word.charAt(0);
			checkAcronym.append(firstchar);
		}
		System.out.println(checkAcronym.toString().equals(s));
	}

}
