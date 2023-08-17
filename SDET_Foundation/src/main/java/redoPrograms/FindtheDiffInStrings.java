package redoPrograms;

public class FindtheDiffInStrings {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		char c = 0;
		
		for (char d : a) {
			c ^= d;
			
			
			
		}
		for (char e : b) {
			c ^= e;
		}
		
		System.out.println(c);

	}

}
