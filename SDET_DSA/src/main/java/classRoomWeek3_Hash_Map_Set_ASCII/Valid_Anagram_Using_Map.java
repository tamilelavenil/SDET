package classRoomWeek3_Hash_Map_Set_ASCII;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Valid_Anagram_Using_Map {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		//String s = "aacc", t = "aaac";
		//boolean output ;
		//int count =1;
		ConcurrentHashMap<String,Integer> map1 = new ConcurrentHashMap();
		//s
		for (int i = 0; i < s.length(); i++) {
			String a = Character.toString(s.charAt(i));
			
			if (map1.containsKey(a)) {
				
				map1.put(a,map1.get(a)+1);
			}
			else {
				map1.put(a,1);
				
			}	
		}
		//p
		for (int j = 0; j < s.length(); j++) {
			String b = Character.toString(t.charAt(j));
			if (map1.containsKey(b) && map1.get(b)==1) {
				map1.remove(b);
			}
			
			if (map1.containsKey(b)) {
				
				map1.put(b,map1.get(b)-1);
			}	
			
			
		}
		
		System.out.println(map1.isEmpty());	
	}
}

//concurrent hashmap O[2N]
//public boolean isAnagram(String s, String t) {
//    
//ConcurrentHashMap<Character, Integer> map = new ConcurrentHashMap<>();
//	int currentOccurrence;
//	if(s.length()!=t.length()) return false;
//	for(char each : s.toCharArray()) {
//		currentOccurrence = map.getOrDefault(each, 0);
//		map.put(each, currentOccurrence+1);
//	}
//	for(char each : t.toCharArray()) {
//		currentOccurrence = map.getOrDefault(each, 0);
//		if(currentOccurrence==1) {
//			map.remove(each);
//		}
//		else {
//			map.put(each, currentOccurrence-1);
//		}
//	}
//	return map.isEmpty();
//	}


