package classRoomWeekDays;

public class ReplaceAllDigitsWithCharacters {

	/*
	 * https://leetcode.com/problems/replace-all-digits-with-characters/
	 * Input: s = "a1c1e1"
	 *	Output: "abcdef"
	 *
	 *1)Given an String convert it to a char array and iterate through it
	 *2)check if 'i' is digit and add the digit to i-1 eg: a1--> add 1 to a and append b to 1
	 *3)return the output string
	 */	public static void main(String[] args) {
		 String s = "a1c1e1";
		 StringBuilder build = new StringBuilder();
		 char[] inpArr= s.toCharArray();
		 for (int i = 0; i < inpArr.length; i++) {
			if (i%2!=0) {
				int c = inpArr[i-1] + (inpArr[i]-'0');
				build.append((char)c);
			}
			else {
				build.append(inpArr[i]);
			}
		}
		 System.out.println(build.toString());

		

	}

}
