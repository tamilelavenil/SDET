package foundation;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseOfWordInSentence {

	public static void main(String[] args) {
		String inp = "We are tester";
		
		String out ="";
		
		String check = "";
		String[] arr = inp.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		for (String word : arr) {
			check = word;
			for (int i = check.length()-1; i >=0 ; i--) {
				System.out.print(check.charAt(i));
			}
			System.out.print(" ");
		}
		
	}

}
