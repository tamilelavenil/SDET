package classRoomWeek3_Hash_Map_Set_ASCII;

import java.util.Arrays;
import java.util.Iterator;

public class Ransom_Note_ASCII {
	/*https://leetcode.com/problems/ransom-note/description/
	 * Input: ransomNote = "aa", magazine = "aab"
	   Output: true
		
		*/
	public static void main(String[] args) {
		String ransomNote = "aa" , magazine = "aab";
		
		int [] alpha = new int[26];
		int len = 0;
		
		if (ransomNote.length()>magazine.length()) {
			len = ransomNote.length();
		}
		else {
			len = magazine.length();
		}
		
		for (int i = 0; i < len; i++) {
			if(i<ransomNote.length()) {
				alpha[magazine.charAt(i)-'a']++;
			}
			
			if(i<magazine.length()) {
				if(alpha[ransomNote.charAt(i)-'a']!=0) {
				alpha[ransomNote.charAt(i)-'a']--;
				}
		}
		
		for (int j = 0; j < alpha.length; j++) {
			
			if (j<ransomNote.length() && alpha[ransomNote.charAt(j)-'a']<=0 ) {
				System.out.println(false);
				break;
			}
			else {
				continue;
			}
		}
		
		System.out.println(true);
		System.out.println(Arrays.toString(alpha));

	}

}}
