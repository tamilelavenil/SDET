package classRoomWeekend;

public class RemoveVowelsFromSentence {
	/*
	 * Write a program to remove vowels from a String Example: Input:
	 * "Hi testleaf students" Output: "H tstlf students"
	 * 
	 * 1)Iterate through the string by converting to a array
	 * 2)If the char does not contain a e i o u
	 * 3)add the char to string 
	 * 4) return the string
	 */
	public static void main(String[] args) {
		String inp = "Hi testleaf students";
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < inp.length(); i++) {
			char a = inp.charAt(i);
			if (!(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U')) {
				out.append(inp.charAt(i));
			}
		}
		System.out.println(out);
		System.out.println(inp.replaceAll("[aeiou]", ""));

	}

}
