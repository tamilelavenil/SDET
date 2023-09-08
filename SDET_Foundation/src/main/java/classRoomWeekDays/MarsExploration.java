package classRoomWeekDays;

import java.util.Arrays;

public class MarsExploration {
	/*
	 * https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=
	 * true
	 * input 	String s = "SOSSOT"; output =1 //one letter is deviated from SOS
	 * 
	 * 1)Iterate through the string
	 * 2)and append SOS positions
	 * 3)if the string does not have sos count+1
	 * 4)return count
	 */	public static void main(String[] args) {
		 //String s= "PPPQQQGGGGGGGGGGGGGGGMMMMMMMMMFFFFFFDDDERT";
		//String s = "SOSSOSSOS";
		 String s = "SOSSPSSQSSOR";
		int count=0;
		for (int i = 0; i < s.length()-2; i+=3) {
			if (s.charAt(i)!='S') {
				count++;
			}
			if(s.charAt(i+1)!='O') {
				count++;
			}
			
			if(s.charAt(i+2)!='S') {
				count++;
			}
			
			
			
			
		}
		
		System.out.println(count);

	}

}
