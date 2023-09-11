package mandatoryHomeWork;

public class FaultyKeyBoard {
	/*
	 * https://leetcode.com/problems/faulty-keyboard/
	 * 1)Iterate through array
	 * 2)if 'i' is not found append string value
	 * 3)if i is found reverese the string
	 * 4)come out of loop and convert string builder to string and return value
	 */	public static void main(String[] args) {
		String s= "String";
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)!='i') {
				build.append(s.charAt(i));
			}
			
			if (s.charAt(i)=='i') {
				build.reverse();
			}
		}
		System.out.println(build);
	}

}
