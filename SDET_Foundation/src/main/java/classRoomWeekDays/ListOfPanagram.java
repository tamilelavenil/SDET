package classRoomWeekDays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
		list.add("abcdefghijklmnopqrstuvwxyz");
		StringBuilder build = new StringBuilder();
		for (String string : list) {
			Set<String> set = new HashSet<String> ();
			char[] ana = string.toCharArray();
			for (int i = 0; i < ana.length; i++) {
				char alpha = Character.toLowerCase(ana[i]);
				if (alpha>='a' && alpha<='z') {
					set.add(Character.toString(alpha));
				}
			}
			if (set.size() == 26) {
				build.append("1");
			} else {
				build.append("0");
			}
		}
		System.out.println(build);
	}
	
	
}
