package mandatoryHomework.week1.TwoPointer_SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class SubstringofSizeThreewithDistinctCharacters {
	/*
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-
	 * characters/description/
	 * Input: s = "xyzzaz"
	 *	Output: 1
	 *1)Iterate through the string
	 *2)take i and i+1 , i+2 if all the 3 chars are different then increment count+1
	 *3)iterate until length of string
	 */	public int distinct() {
		 
		 String s = "aababcabc";
		 
		//using set

	        //1)take substring of 3 and send to a check function and add all three char if distinc

	        //2) if yes add count else return false and check ext substring

	        int ptr =0, output=0;

	        while(ptr<=s.length()-3){
	            String a = s.substring(ptr,ptr+3);
	            if(check(a)==true) output++;
	            ptr++;
	        }

		 System.out.println(output);
		return output;
	    }

	    public boolean check(String a){

	        Set<Character> set = new HashSet();
	        for(char i: a.toCharArray()){
	            if(!set.contains(i)){
	                set.add(i);
	            }
	            else{
	                break;
	            }
	        }
	        if(set.size()==3) return true;

	        return false;
	    }
	//brute force	 
//		 int output = 0;
//		 
//		 for (int i = 0; i < s.length()-2; i++) {
//			if (s.charAt(i)!=s.charAt(i+1)&&s.charAt(i+1)!=s.charAt(i+2)&&s.charAt(i)!=s.charAt(i+2)) {
//				output++;
//			}
//		}
//		 
//		 System.out.println(output);

	}

