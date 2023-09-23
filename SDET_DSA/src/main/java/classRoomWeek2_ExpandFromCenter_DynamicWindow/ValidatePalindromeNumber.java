package classRoomWeek2_ExpandFromCenter_DynamicWindow;

public class ValidatePalindromeNumber {

	public static void main(String[] args) {
		int num = 787787;
		int temp = num;
		int rev = 0;
		while(num>0) {
			int rem = num%10;
			rev = (rev*10)+ rem;
			num = num /10;
		}
		if (temp==rev) {
			System.out.println(true);
		}
		System.out.println();
		//dont use this method
//		String arr = Integer.toString(num);
//		// Length of string is Odd
//		//int l = arr.length()/2-1, r = arr.length()/2+1;
//		//if Length of string is Even
//		int l = arr.length()/2-1, r = arr.length()/2;
//		System.out.println(l+" "+r);
//		boolean flag = false;
//		while(r<arr.length()) {
//			if(Character.toLowerCase(arr.charAt(l))==Character.toLowerCase(arr.charAt(r))) {
//				flag = true;
//				l--;r++;
//			}
//			else {
//				flag =false;
//				break;
//			}
//		}
//		
//		System.out.println("the given word is a palindrom?:"+ flag);

	}

}
