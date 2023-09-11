package classRoomWeekDays;

import java.util.Iterator;

public class ControlDevice {
	/*
	 * Question 1: A control device has 4 buttons that can be used to move a
	 * character around a screen in 4 directions: Up (U), Down (D), Left (L), and
	 * Right (R). The movement needs to be optimized by deleting unnecessary
	 * instructions while maintaining the same destination. Given the original set
	 * of instructions, what is the maximum number of instructions that can be
	 * deleted and still have the character reach the destination?
	 * 
	 * Note: The instructions that are deleted do not need to be contiguous.
	 */
	public static void main(String[] args) {
		int upDown = 0 , leftright = 0;
		
		String s = "UUDRRLR";
		
		//UUDRRLR
		
		StringBuilder build = new StringBuilder(s);
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='U') {
				upDown++;
			}
			if (s.charAt(i)=='D') {
				upDown--;
		
			}
			if (s.charAt(i)=='R') {
				leftright++;
			}
			if (s.charAt(i)=='L') {
				leftright--;
			}
			
		}
		System.out.println(s.length()-(upDown+leftright));

	}

}
