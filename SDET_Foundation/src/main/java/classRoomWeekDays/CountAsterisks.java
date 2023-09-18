package classRoomWeekDays;

public class CountAsterisks {
//	https://leetcode.com/problems/count-asterisks/description/
//		test data:
//		Input: s = "iamprogrammer"
//		Output: 0
//		Input: s = "l|*e*et|c**o|*de|"
//		Output: 2
//		Pseuodo code:
//		1) Iterate through the string and count the vertical bar
//		2)count the | and if position of vertical bar %2==0
//		3) count the * only when even | appears so that it is without pairs
//		4)return the count
	public static void main(String[] args) {
		//String s= "iamprogrammer";
		String s= "l|*e*et|c**o|*de|";
		int output = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '|') {
				count++;
			}
			if (count % 2 == 0) {
				if (s.charAt(i) == '*') {
					output++;
				}
			}
		}

		System.out.println(output);

	}

}
