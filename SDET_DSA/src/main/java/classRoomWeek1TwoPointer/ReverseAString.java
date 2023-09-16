package classRoomWeek1TwoPointer;

public class ReverseAString {

	public static void main(String[] args) {
		String inp = "tamil";
		char[] charArr = inp.toCharArray();
		int startIndex=0, endIndex= inp.length()-1;
		while(startIndex<endIndex) {
			char temp = charArr[startIndex];
			charArr[startIndex++] = charArr[endIndex];
			charArr[endIndex--]=temp;
		}
		System.out.println(new String(charArr));
//		for (int i = inp.length()-1; i >= 0; i--) {
//			System.out.print(inp.charAt(i));
//		}
		
//		int j = inp.length()-1;
//		for (int i = 0; i < inp.length()/2; i++) {
//			char a = inp.charAt(inp.length()-1);
//			char b = inp.charAt(i);
//			j--;
//		}
//		System.out.println(swap);
	}

}
