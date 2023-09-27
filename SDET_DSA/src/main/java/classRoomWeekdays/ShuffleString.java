package classRoomWeekdays;

public class ShuffleString {
	/*
	 * https://leetcode.com/problems/shuffle-string/description/
	 * 
	 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
	 *	Output: "leetcode"
	 *
	 *1)Iterate through the indices and add the string values to a an array with corresponding index position
	 *2)finally add the values in out array to string and return the string out
	 */	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		
		char[] outArr = new char[indices.length];
		
		StringBuilder build = new StringBuilder();
		
		for (int i = 0; i < indices.length; i++) {
			outArr[indices[i]]= s.charAt(i);
		}
		
		for (char c : outArr) {
			build.append(c);
		}
		
		System.out.println(build);

	}

}
