package classRoomWeekdays;

import java.util.HashSet;
import java.util.Set;

public class Longest {

	public static void main(String[] args) {
		String s = "abcabcbb";
		 Set<Character> set = new HashSet();

	        int left= 0, right =0, count = 0, maxCount = 0;
	        // if length is ==1
	        if(s.length()==1){System.out.println(1);}
	        
	        //else
	        while(right<s.length()){
	        	if (!set.contains(s.charAt(right))) {
	        		set.add(s.charAt(right++));
	        		maxCount = Math.max(maxCount,right-left);  
				}
	        	
	        	else if(set.contains(s.charAt(right))) {
	        		while(left!=right-1) {
	        			set.remove(s.charAt(left++));
	        		}
	        		
	        	}
	        
	            
	        }

	        // if(set.size()>0){
	        //     return set.size();
	        // }
	        System.out.println(maxCount);


	}

}
