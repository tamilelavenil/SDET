package mandatoryHomeWork;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAdditionsToMakeValidStrings {
	/*
	 * https://leetcode.com/problems/minimum-additions-to-make-valid-string/
	 * Input: word = "b"
	   Output: 2
	   Input: word = "aaa"
	   Output: 6
	 * Input: word = "abc"
	   Output: 0
	   1)if string length ==1 then return output as 2
	   2)if string ==ab or bc output =1
	   3)if string length ==3 and string is "abc" return 0
	   4)iterate through the string if i is a then a+1 is b and a+2 is c
	   5)iterate through the string if i is b then b-1 is a and b+1 is c
	   6)iterate through the string from backwards if i is c then c-1 is b and c-2 is a   
	 */	
	@Test
	public void test2() {
		Assert.assertEquals(2, ValidStrings("aabc"));
	}
	
	
	public int ValidStrings(String word) {
		int out = 0;
		//1)if string length ==1 then return output as 2
		if (word.length()==1) {
			return 2;
		}
		//3)if string length ==3 and string is "abc" return 0
		if (word.equals("abc")) {
			return 0;
		}
		char[] wordArr = word.toCharArray();

		//if the pairs are abc the make it as some other character
		for (int i = 2; i < wordArr.length; i++) {
	
			if (wordArr[i]=='c'&&wordArr[i-1]=='b'&&wordArr[i-2]=='a') {
				wordArr[i]='0';wordArr[i-1]='0';wordArr[i-2]='0';
			}
			
		}

		//if the pairs are ab bc ac
		for (int i = 1; i < wordArr.length; i+=1) {
			if (wordArr[i]!='0') {
				if (wordArr[i]=='b'&&wordArr[i-1]=='a'||wordArr[i]=='c'&&wordArr[i-1]=='b'||wordArr[i]=='c'&&wordArr[i-1]=='a') {
					wordArr[i]='0';wordArr[i-1]='0';
					out++;
				}
			}
			
		}
		
		// add out +2 if word does not have bc or ab or ac
		for (int i = 0; i < wordArr.length; i++) {
			 if (wordArr[i]=='a'||wordArr[i]=='b'||wordArr[i]=='c') {
						out+=2;
						}
		}
		
		return out;
}
}
