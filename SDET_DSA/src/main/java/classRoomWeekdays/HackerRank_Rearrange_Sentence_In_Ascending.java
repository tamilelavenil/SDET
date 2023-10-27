package classRoomWeekdays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeSet;

public class HackerRank_Rearrange_Sentence_In_Ascending {

	public static void main(String[] args) {
		String input = "Leetcode is cool";
		
		input = input.toLowerCase();
		
		String[] split = input.split(" ");
		TreeSet<Integer> set1 = new TreeSet();
		
		Map<TreeSet<Integer>,String> map = new HashMap();
		
		for(String i: split) {
			int len = i.length();
			set1.add(len);
			if(!map.containsKey(len)) {
				map.put(set1, i);
			}
		}
		
		System.out.println(map);

	}

}
