package classRoomWeekdays;

public class CountOfEachCharacter {

	/*
	 * S = ‘aaabbccaad’ O/p = ‘a3b2c2a2d1’
	 * 
	 * 1)iterate through the string until it is not same
	 * 2)get the count of char until the pointer differs to another char
	 * 3)append the char and count of char in output string
	 */
	public static void main(String[] args) {
		
		String S= "aaabbdccaaa";
		
		StringBuilder build = new StringBuilder();
		
		int left =0, right =0, count =0;
		
		while(right<S.length()) {	
			count=0;
			while(right<S.length() && S.charAt(right)==S.charAt(left)) {
				count++;
				right++;
			}
			
			build.append(S.charAt(left)).append(count);
			left=right;
			
			
			
		}
		
		System.out.println(build);

	}

}
