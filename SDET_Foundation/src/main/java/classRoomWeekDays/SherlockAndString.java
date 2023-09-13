package classRoomWeekDays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SherlockAndString {
	/*
	 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?isFullScreen=true
	 * input : aabbccddeefghi output: no || abcdefghhgfedecba yes
	 * 
	 * 1)convert the input string to a array
	 * 2)sort the array
	 * 3)iterate the array and check for each alpha count
	 * 4)add the count to a list
	 * 5)now get the max value in list and do -1
	 * 6)if all the values are identical in list return yes else no
	 * 
	 */	public static void main(String[] args) {
		 //adding one character { to avoid index exception and iterate until last value of alphabet
		 String s = "aabbcd"+"{";
		 
		 // if input length is 1 directly return yes
		 if (s.length()==1) System.out.println("YES");
		 
		 char[] charArray = s.toCharArray();
		 
		 Arrays.sort(charArray);
		 
		 List<Integer> countList = new ArrayList<Integer> ();

		 int count=0;
		 //iterate the array and check for each alpha count and add in a list
		 for(int i=0; i<charArray.length-1; i++) {
		
			 if (charArray[i]==charArray[i+1]||charArray[i]!=charArray[i+1]||charArray[i+1]!=charArray[i]) {
				count++;
			 }
			 if (charArray[i]!=charArray[i+1]) {
				 countList.add(count);
				 count=0;
			} 
		 }
		 
		 //iterate through list and add it in array [coverting list to array]
		 int[] array = new int[countList.size()];
		 int ix = 0;
		 for (int value : countList) {
			array[ix]=value;
			ix++;
		}
		 Arrays.sort(array);
		 
		 //iterate through the array and check for conditions
		 boolean check = false;
		 int len = array.length-1;
		 for (int j = 0; j < array.length; j++) {
			 //first and last frequence are same
			 if (array[0]==array[len]) {
				 check = true;
			}
			 //if first =1 and second = last - freq of 1 char is 1
			 else if (array[0]==1 && array[1]==array[len]) {
				 check = true;
			 }
			 
			 //44445 first = second , second = secondLast , first = last -1
			else if(array[0]==array[1]&&array[1]==array[len-1]&&array[0]==array[len]-1){
				check = true;
			}
		}

		 //return YES or NO based on true or false
		 if (check==true) System.out.println("YES");
		 else System.out.println("NO");
	}

}
