package mandatoryHomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DecodeTheMessage {
	/*
	 * https://leetcode.com/problems/decode-the-message/
	 * 
	 * Input: key = "the quick brown fox jumps over the lazy dog", message =
	 * "vkbs bs t suepuv" Output: "this is a secret"
	 * 
	 * constrains - all the inputs contains only lower case and ' ' space , key
	 * contains all 26 alphabets
	 * 
	 * 1) Convert the key string to a char array. 
	 * 2) Create a alphabet array 26 and add alphabets value.
	 * 3) Iterate through the message input and key input and pick the corresponding value in alphabet array.
	 *  5) return as value of string
	 * 
	 */
	public static void main(String[] args) {
		String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";

		key = key.replaceAll(" ", "");
		
		List<Character> keyList = new ArrayList<>();
		
		for (int i = 0; i < key.length(); i++) {
			if (!(keyList.contains(key.charAt(i)))) {
				keyList.add(key.charAt(i));
			}
		}
		
		System.out.println(keyList);

		char[] messageArray = message.toCharArray();

		char[] alphaArray = new char[26];

		int abc = 97;
		
		for(int i=0; i<alphaArray.length; i++){

		alphaArray[i]=(char) abc;
		
		abc++;
		}
		
		StringBuilder build = new StringBuilder();
		
		for(int i=0; i<messageArray.length; i++){
		
			if(messageArray[i]==' '){
				build.append(" ");
			}
			else {
				for(int j=0; j<keyList.size(); j++) {
				if(messageArray[i]==keyList.get(j)) {
					build.append(alphaArray[j]);
				}
				}
			}
			
		}
		
		System.out.println(build.toString());

	}

}
