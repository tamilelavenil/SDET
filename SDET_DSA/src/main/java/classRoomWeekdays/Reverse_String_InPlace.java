package classRoomWeekdays;

import java.util.Arrays;

public class Reverse_String_InPlace {
	 //Pseudocode
    /*
    1)Iterate over the array from both the sides
    2)swap each values from left and right
    3)return the array
    */
	public static void main(String[] args) {
		 char[] s = {'h','e'};
        int left = 0 , right = s.length-1;

        while(left<right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
           // left++; right--;
        }

        System.out.println(Arrays.toString(s));

	}

}
