package seleniumAssignment;

import java.util.Arrays;

public class Day5 {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() != text2.length()) {
			System.out.println("Two strings does not match");}
		else {
			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();
			Arrays.sort(arr1);
			System.out.println(arr1);
			Arrays.sort(arr2);
			System.out.println(arr2);
		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] != arr2[i]) {
				System.out.println("Both the arrays are not equal");}
//			else {
//				System.out.println("Both the arrays are equal");
//			}

		}
		System.out.println("Both the arrays are equal");
		}
	}

}
