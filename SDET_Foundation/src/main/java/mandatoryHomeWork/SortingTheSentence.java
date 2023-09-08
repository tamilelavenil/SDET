package mandatoryHomeWork;

import java.util.Arrays;

public class SortingTheSentence {
	/*
	 * Input: s = "is2 sentence4 This1 a3" Output: "This is a sentence"
	 * 
	 * 1)Split the Input string s with respect to " "
	 * 2)pick up each word get the value of last index
	 * 3)have a output string array - output[word.length()-1] = stringarray[i]
	 * 4)return the output array as string 
	 */
	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		
		String[] inpArray = s.split(" ");
		
		String[] outArr = new String[inpArray.length];
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < inpArray.length; i++) { //O[N]
			//last index
			int len= inpArray[i].length()-1;
			String index = inpArray[i].substring(len);
			String append = inpArray[i].substring(0,len);
			outArr[Integer.parseInt(index)-1] = append;
		}
		

		for (int i=0; i<outArr.length;i++) { //O[N]
			if (i==outArr.length-1) {
				result.append(outArr[i]);
			}
			else {
			result.append(outArr[i]+" ");}
		}
		
		System.out.println(result);
		//time complexity O[N]
	}

}
