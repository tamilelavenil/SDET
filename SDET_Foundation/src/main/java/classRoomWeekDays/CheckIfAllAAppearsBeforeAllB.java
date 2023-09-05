package classRoomWeekDays;

public class CheckIfAllAAppearsBeforeAllB {
/*
 * https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
 * 1)every 'a' appears before every 'b' and we return true. else false
 * 2)check if string contains any ba if contains return false else true
 */
	public static void main(String[] args) {
		String s = "aaabbb";
		
		if (s.contains("ab")) {
			System.out.println(false);
		}
		
		else {
			System.out.println(true);
		}

	}

}
