package classRoomWeekend;

import java.util.Arrays;

public class IpDefanged {
	/*
	 * Given a valid IP address, return a defanged version of that IP address. A
	 * defanged IP address replaces every period "." with "[.]". Do Not Use the
	 * replaceAll() Example 1: Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1"
	 */
	public static void main(String[] args) {
	String input = "1.1.1.1";
	String[]inputarr = input.split("");
	String output ="";
	for (int i = 0; i < inputarr.length; i++) {
		if (inputarr[i].equals(".")) {
			inputarr[i]="[.]";
		}
	}
	for (int j = 0; j < inputarr.length; j++) {
		output += inputarr[j];
	}
	System.out.println(Arrays.toString(inputarr));
	System.out.println(output);
	}

}
