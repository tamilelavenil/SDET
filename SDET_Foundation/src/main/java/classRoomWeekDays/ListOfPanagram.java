package classRoomWeekDays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListOfPanagram {
	/*
	 * Question 3 A string is a pangram if it contains all letters of the English
	 * alphabet, ascii['a'-'z']. Given a list of strings, determine if each one is a
	 * pangram or not. Return "1" if true and "0" if false.
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		list.add("We promptly judged antique ivory buckles for the next prize");
		list.add("We promptly judged antique ivory buckles for the prize");
		list.add("abcdefgh");
		list.add("qwertyuiopasdfghjklzxcvbnm");
		System.out.println(list);
		StringBuilder build = new StringBuilder();
		for (String string : list) {
			char[] ana = string.toCharArray();
			Arrays.sort(ana);
			System.out.println(Arrays.toString(ana));
			int count = 0;
			for (int i = 1; i < ana.length; i++) {
				
					if (ana[i] != ana[i-1]) {
						count+=1;
						System.out.println(count);
					}
				
			}
			if (count == 26) {
				build.append("1");
			} else {
				build.append("0");
			}
		}
		System.out.println(build);
	}
	
	
}
