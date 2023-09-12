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
		
		 String s = "xxxaabbccrry";
		 
		 char[] charArray = s.toCharArray();
		 int count=0;
		 Arrays.sort(charArray);
		 List<Integer> countList = new ArrayList<Integer> ();
		 System.out.println(Arrays.toString(charArray));
		 //iterate the array and check for each alpha count
		 for(int i=0; i<charArray.length-1; i++) {
		
			 if (charArray[i]==charArray[i+1]||charArray[i]!=charArray[i+1]||charArray[i+1]!=charArray[i]) {
				count++;
			 }
			 if (charArray[i]!=charArray[i+1]) {
				 countList.add(count);
				 count=0;
			} 
		 }
		 //getting max value in list
		 int maxValueInList = Collections.max(countList);
		 
		 //get index of max value
		 int maxIndex = 0;
		 for (int i = 0; i < countList.size(); i++) {
			if (countList.get(i)==maxValueInList) {
				maxIndex = i;
			}
		}
		 //remove the target element
		// countList.remove(maxIndex);
		 //and add the new value in the same place
		// countList.add(maxIndex, maxValueInList-1);
		 
		 //iterate through the list and check if duplicates
		 boolean check = true;
		 for (int j = 0; j < countList.size()-1; j++) {
			if (countList.get(j)!=countList.get(j+1)) {
				check = false;
				break;
			}
			else {
				check = true;
			}
		}
		 System.out.println(countList);
		 
		 System.out.println(maxValueInList);
		 
		 System.out.println(maxIndex);
		// System.out.println(check);
		 if (check==true) System.out.println("YES");
		 else System.out.println("NO");
	}

}
