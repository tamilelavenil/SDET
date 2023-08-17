package classRoomWeekDays;

public class Palindrome {
	/*
	Given[Input is an integer]  x,[Output is boolean] return true if x is a palindrome, and false otherwise.

	test data:

	x = 121 x = 122

	Checking an integer from the reverse also should be same as the given

	1) Reverse the digit by using following simplification logic
	2) Mod the number by 10 (eg : 121 % 10 = 1) 
	3) initialize a var sum to 0 - [ sum = (sum*10)+remainder]
	4)divide the number until it becomes zero 
	5) return true or false
	*/
	public static void main(String[] args) {

		int remainder = 0, rev = 0, n = 121;
		
		while(n>0){
		remainder = n % 10;

		rev= (rev * 10)+ remainder;

		n= n/10;


		}
		
		if (rev==n) {
			System.out.println("Is palindrome");
		}
		
		else {
			System.out.println("Is not a palindrome");
		}

	}

}
