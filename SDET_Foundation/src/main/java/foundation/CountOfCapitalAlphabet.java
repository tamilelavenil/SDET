package foundation;

import java.util.Iterator;

public class CountOfCapitalAlphabet {

	public static void main(String[] args) {
		/*
		 * Input is a String Output is a Integer
		 * Test data:
		 * 		String a = "ILoveIndia" 
		 * convert the string into char array
		 * iterate through the char array check if it is greater than 'A' and less than 'Z'
		 * If yes return the count of capitals
		 */
		String a = "ILoveIndia";  //Input
		//method1
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (!Character.isLowerCase(a.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
		//method 2
		int count1 = 0;
		for (int j = 0; j < a.length(); j++) {
			if (a.charAt(j)>='A' && a.charAt(j)<='Z' ) {
				count1++;
			}
		}
		System.out.println(count1);
		
		//method 3
		System.out.println(a.replaceAll("[0-9a-z]", "").length()); //inbuilt method
	}
		
	

}
