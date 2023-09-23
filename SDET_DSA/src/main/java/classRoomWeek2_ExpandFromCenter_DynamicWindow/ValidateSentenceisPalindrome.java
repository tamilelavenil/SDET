package classRoomWeek2_ExpandFromCenter_DynamicWindow;

import java.util.Arrays;

public class ValidateSentenceisPalindrome {
	/*
	 * Given an input String,return a boolean array by validate each of the word is
	 * a palindrome. Input = "this is a Tst" output = [false, false, true, true]
	 * 
	 * 1)split the sentence to string
	 * 2)Create a boolean array with same as length of split array
	 * 3)Use expand from center approach and check if each string is palindrom
	 * 4)and retrun true or false to boolean array
	 */
	public static void main(String[] args) {
		String input = "this is a Tst";
		
		String[] arr = input.split(" ");
		
		boolean[] out = new boolean[arr.length];
		
		int l = arr.length/2-1, r = arr.length/2;
		
		while(r<arr.length) {
			if (Palindrome(arr[l])==true) {
				out[l]=true;
			}
			if (Palindrome(arr[r])==true) {
				out[r]=true;
			}
			r++;l--;
		}
		
		System.out.println(Arrays.toString(out));
	}
	public static boolean Palindrome(String s) {
		StringBuilder build  = new StringBuilder();
		String check = s.toLowerCase();
	
		for (int i = s.length()-1; i >=0; i--) {
			build.append(Character.toLowerCase(s.charAt(i)));
		}
	
		if (check.equals(build.toString())) {
			return true;
		}
		return false;
		
	}
	
	
}
