package mandatoryHomeWork;

public class SplitAStringInBalancedStrings {
	/*
	 * https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
	 * 1)Iterate through the given string
	 * 2)for Right add One and for left subtract one
	 * 3)if point reaches 0 add 1 to count
	 * 4) return count
	 */	public static void main(String[] args) {
		 String s = "RLRRLLRLRL";
		 int output = 0;
		 int rightleft=0;
		 
		 for (int i = 0; i < s.length(); i++) {
			char check = s.charAt(i);
			
			if(check=='R') rightleft++;
			
			if (check=='L') rightleft--;
			
			if(rightleft==0) output++;
		}
		 System.out.println(output);
	}

}
