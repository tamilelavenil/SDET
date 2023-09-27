package classRoomWeek2_ExpandFromCenter_DynamicWindow;

import java.util.Arrays;

public class ShortestDistanceToACharacter {
	/*
	 * https://leetcode.com/problems/shortest-distance-to-a-character/description/
	 *  Input: s = "loveleetcode", c = "e"
				 Output: [3,2,1,0,1,0,0,1,2,2,1,0]
	 * 1)Initially keep position as - of string.length
	 * 2)iterate through the string if the charAt if (i) is not equal to target char = update i-position
	 * 3)if the charAt(i) matches the target char then update the output array as 0 and make position = i
	 * 4)repeat the same process 3 and 4 from reverse the string also
	 * 5)if the i-position is minimum than the previously updated value then update the minimum value in same position
	 */	public static void main(String[] args) {
		 String s= "loveleetcode"; char c ='e';
		 
		 int[] output = new int[s.length()];
		 
		 
		 int n = s.length(), pos = -n;
		 
		 for (int i = 0; i < output.length; i++) {
			if (s.charAt(i)!=c) {
				output[i] = i - pos;
			}
			if (s.charAt(i)==c) {
				pos=i;
				
				output[i] = i - pos;
			}
		 }
		 System.out.println(Arrays.toString(output));
		 for (int i = output.length-1; i >=0; i--) {
			 
				if (s.charAt(i)!=c) {
					output[i] = Math.min(output[i], Math.abs(i-pos));
				}
				if (s.charAt(i)==c) {
					pos=i;
					
					output[i] = pos-i;
				}
			 }
		 
		 System.out.println(Arrays.toString(output));
		 

	}

}
