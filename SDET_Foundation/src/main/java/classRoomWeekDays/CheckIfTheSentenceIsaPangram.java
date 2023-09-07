package classRoomWeekDays;

import java.util.Arrays;
import java.util.Iterator;

public class CheckIfTheSentenceIsaPangram {
	/*
	 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
	 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
	 *	Output: true
	 *	1)Iterate through the string
	 *  2)check if all characters from a-z are present
	 *  3)Return true if all a-z are present else false
	 */	public static void main(String[] args) {
		 String sentence = "thequickbrownfoxjumpsoverthelazydog";
		 char[] array = sentence.toCharArray();
		 int count=1;
		 Arrays.sort(array);
		 for (int i = 0; i < array.length-1; i++) {
			if (array[i]!=array[i+1]) {
				count+=1;
			}
		}
		
		 System.out.println(count==26);

		

	}

}
