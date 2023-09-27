package classRoomWeek2_ExpandFromCenter_DynamicWindow;

public class MaximumConsecutiveCharacters {
	/*
	 * https://leetcode.com/problems/consecutive-characters/description/
	 * 
	 *  Algorithm:
	 * 	1. Initialise left and right
        2. increase right till same char
        3. if char is diff, calculate the window of right-left and reset right and left as current index
	 */	public static void main(String[] args) {
		String  s = "abbcccddddeeeee";
		
		int left =0 , right =0 , out =0, output =0;
		
		while(right<s.length()) {
			if(s.charAt(left)==s.charAt(right)) {
				right++;
			}
			
			else {
				out = right - left;
				output = Math.max(out, output);
				left = right;
				right++;
				
			}
			
		}
		
		if (right==s.length()) {
			out = right - left;
			output = Math.max(out, output);
		}
		
		System.out.println(output);

	}

}
