package mandatoryHomework.week3.HashMap_Set_ASCII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RingsAndRods {
	  public int countPoints(String rings) {
	        Map<Character, Set<Character>> map = new HashMap<>();

	        int left =0, right =2;

	        while(right<=rings.length()){
	            String insert = rings.substring(left,right);
	            char key = insert.charAt(1);
	            char value = insert.charAt(0);

	            if(map.containsKey(key)){
	               map.get(key).add(value);
	            }

	            else{
	                Set<Character> set = new HashSet();

	                set.add(value);

	                map.put(key,set);
	            }

	            left += 2; right += 2;
	            
	        }

	        System.out.println(map);
	        int output =0;
	        for(Set<Character> a: map.values()){

	            if(a.size()==3) output++;

	        }
	        return output;
	    }
}
