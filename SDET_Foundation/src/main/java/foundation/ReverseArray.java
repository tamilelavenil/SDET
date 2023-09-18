package foundation;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		/*
		 * The input is a Array and output also is a array
		 * Test data char[] s = { 'a', 'b', 'c', 'd', 'e' }; //valid
		 * s = {};// invalid
		 * iterate the array in reverse format add in string
		 * add the value of string in reverse order return the array
		 */
		char[] s = { 'a', 'b', 'c', 'd', 'e' };
		String a = "";
		for (int i = s.length-1; i>=0; i--) {
			a+=s[i];
		}
		for (int j = 0; j < s.length; j++) {
			s[j]=a.charAt(j);
		}
		System.out.println(Arrays.toString(s));

	}

}
