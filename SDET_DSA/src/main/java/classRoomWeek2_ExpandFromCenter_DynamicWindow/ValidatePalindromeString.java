package classRoomWeek2_ExpandFromCenter_DynamicWindow;

public class ValidatePalindromeString {

	public static void main(String[] args) {
		String arr = "RADAR";
		// Length of string is Odd
		int l = arr.length()/2-1, r = arr.length()/2+1;
		//if Length of string is Even
		//int l = arr.length()/2-1, r = arr.length()/2;
		System.out.println(l+" "+r);
		boolean flag = false;
		while(r<arr.length()) {
			if(Character.toLowerCase(arr.charAt(l))==Character.toLowerCase(arr.charAt(r))) {
				flag = true;
				l--;r++;
			}
			else {
				flag =false;
				break;
			}
		}
		
		System.out.println("the given word is a palindrom?:"+ flag);

	}

}
