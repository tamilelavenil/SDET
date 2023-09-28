package mandatoryHomework.week2.DynamicSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllAnagramsInAString {
	/*
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	 * 
	 * Input: s = "cbaebabacd", p = "abc"
		Output: [0,6]
		
		1)Iterate throught the string and check for p window size
		2)whether p values are present in the string if present
		3)update the left pointer index to out list
		4)move left to next index and make right =left and again move to p window
		5)move the right<string.length-p.length
	 */	public static void main(String[] args) {
		
		 String s = "cbaebabacd", p ="abc";
		 
		 List<Integer> list = new ArrayList();
		 
		 if (s.length()==p.length()) {
			if (!s.equals(p)) {
				System.out.println(list);
			}
		 }
		
		 
		 int[] parr = new int[26];
		 
		 int left=0, right=0, scount = 0, pcount =0;
		 
		 //finding sum of p	 
		for (char c: p.toCharArray()) {
			parr[c-'a']++;
		}
		
		 System.out.println(Arrays.toString(parr));
		 
		while(right<=s.length()-p.length()) {
			
			 int[] sarr = new int[26];
			 
			while(right<s.length() && right-left<p.length()) {
				
				sarr[s.charAt(right)-'a']++;
				
				right++;
			}
		
		if (Arrays.equals(sarr, parr)) {
		list.add(left);
		left++;
		right=left;
		sarr = new int[26];
		}
		
		else {
		
		left++;
		right=left;
		sarr = new int[26];
		}
		}
		
		System.out.println(list);
		 
	}

}

//int left=0, right=0, scount = 0, pcount =0;
// List<Integer> list = new ArrayList();		 
//for (char c: p.toCharArray()) {
//pcount+= c - 'a';
//}
//while(right<=s.length()-p.length()) {
//
//while(right<s.length() && right-left<p.length()) {
//
//scount+= s.charAt(right) - 'a';
//
//right++;
//}
//
//if (scount==pcount) {
//list.add(left);
//left++;
//right=left;
//scount=0;
//}
//
//else {
//
//left++;
//right=left;
//scount=0;
//}
//}
//
//return(list);
