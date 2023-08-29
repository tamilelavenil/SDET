package classRoomWeekDays;

import java.util.Arrays;

public class MaximumValueOfaStringInaArray {
	
	/*
	 * https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/
	 * test data:
	 * 1)strs = ["alic3","bob","3","4","00000"] 2)["1","01","001","0001"] 3) ["tamil","elavenil","0009"]
	 * 
	 * 1)Given a string array iterate and take a value of array and iterate through each value 
	 * 2)if the strs[i] does not contain any alphabets the consider it as number do parse int of string
	 * 3) else get the length() of alphanum word 
	 * 4)add the length and int in a array
	 * 5)sort the array in ascending and return the last index value of array
	 */	public static void main(String[] args) {
		String[] strs = {"alic3","bob","3","4","00000"};
		int[] lenArray = new int[strs.length];
		//index of lenArray
		int index = 0;
		//iterate every string in array
		for (String string : strs) {
			int countnumbers =0;
			//iterate through each char in string
			for (int i = 0; i < string.length(); i++) {
				//check if the strs[i] is exactly numbers
				if (string.charAt(i)>='0'&&string.charAt(i)<='9'){
					countnumbers++;
				}
				//check if alpha only
				else if(string.charAt(i)>='a'||string.charAt(i)>='A'&&string.charAt(i)<='z'||string.charAt(i)<='Z') {
					lenArray[index]=string.length();
				}
				//check if strs[i] is alphanumeric and alphabets
				 else {
					lenArray[index]=string.length();
				}
				
				
			}
			if (countnumbers==string.length()) {
				lenArray[index]=Integer.parseInt(string);
				
			}
			index++;
		}
		Arrays.sort(lenArray);
		System.out.println(lenArray[lenArray.length-1]);
		System.out.println(Arrays.toString(lenArray));

	}
//if (string.charAt(i)>='a'||string.charAt(i)>='A'&&string.charAt(i)<='z'||string.charAt(i)<='Z'&&string.charAt(i)>='0'&&string.charAt(i)<='9')
}
