package mandatoryHomework.week1.TwoPointer_SlidingWindow;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import org.junit.Assert;



public class LongestNiceSubstring {
	/*
	 * https://leetcode.com/problems/longest-nice-substring/description/ 
	 * 
	 * input s=abABB
	 * output = "abAB"
	 * 
	 * if not substring return "" empty string
	 * 
	 * 1)iterate through the array outer and inner
	 * 2)check for i=0 and j= i+1 take it as a substring
	 * 3)check if it is a valid one
	 * 4)if valid add to output string and return
	 */
	@Test
	public void test1() {
		Assert.assertEquals("abAB", Nice("abABB"));
	}
	@Test
	public void test2() {
		Assert.assertEquals("aAa", Nice("YazaAay"));
	}
	public String Nice(String s){
		String out ="";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				String sub = s.substring(i,j+1);
				if (Valid(sub)) {
					out+=sub;
					return out;
				}
			}
		}
		System.out.println(out);
		return out;
	}
	public boolean Valid(String sub) {
		Set<String> lowerCase = new HashSet<String>();
		Set<String> upperCase = new HashSet<String>();
		for (char string : sub.toCharArray()) {
			if (string>=65&&string<=90) {
				char a = Character.toLowerCase(string);
				upperCase.add(Character.toString(a));
			}
			if (string>=97&&string<=122) {
				lowerCase.add(Character.toString(string));
			}
		}
		
		if(lowerCase.equals(upperCase)) {
			return true;
		}
		
		else {
			lowerCase.clear();
			upperCase.clear();
			return false;
			
		}
		

	}	
	

}
