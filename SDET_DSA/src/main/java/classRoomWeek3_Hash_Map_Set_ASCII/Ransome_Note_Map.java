package classRoomWeek3_Hash_Map_Set_ASCII;

import java.util.HashMap;
import java.util.Map;

public class Ransome_Note_Map {

	
		String ransomNote = "aa" , magazine = "aab";
		
		public boolean canConstructByMap(String ransomNote, String magazine) {
			if(ransomNote.length()>magazine.length()) return false;
			Map<Character,Integer> map = new HashMap();
			for (int i = 0; i < magazine.length(); i++) {
				map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
				System.out.println(map);
			}
			for (int i = 0; i < ransomNote.length(); i++) {
				if(!map.containsKey(ransomNote.charAt(i))) {
					System.out.println(map);
					return false;
				}
				if(map.get(ransomNote.charAt(i))<=0) {
					System.out.println(map);
					return false;
				}
				else {
					System.out.println(map);
					map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
				}
			}
			return true;
		}
	}


