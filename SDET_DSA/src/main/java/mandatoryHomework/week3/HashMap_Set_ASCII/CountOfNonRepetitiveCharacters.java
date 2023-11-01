package mandatoryHomework.week3.HashMap_Set_ASCII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountOfNonRepetitiveCharacters {

	public static void main(String[] args) {
		String s = "xyzzaz";
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		int left =0, right =0, count=0;
		
		while(right<3) {
			map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
		}
		
		while(right<s.length()) {
			if(map.size()==3) {
				count++;
			}
			map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
			right++;
			//if(map.getOrDefault(s.charAt(right),0)+1) {
				
			}
		//	map.put(s.charAt(left++), null)
			
			left++;
		}
		
		//System.out.println(count);
		
		

	}

//}
