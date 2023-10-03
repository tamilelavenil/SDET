package classRoomWeek3_Hash_Map_Set_ASCII;

import java.util.Arrays;
import java.util.Iterator;

public class ValidAnagram_UsingArray {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		
		int[] alpha = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			
			alpha[s.charAt(i)-'a']--;
			alpha[t.charAt(i)-'a']++;
			
		}
		
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i]!=0) {
				System.out.println(false);
				break;
			}
		}
		
		System.out.println(true);
		System.out.println(Arrays.toString(alpha));

	}

}
