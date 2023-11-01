package mandatoryHomework.week7;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
	//https://leetcode.com/problems/first-unique-character-in-a-string/description/
	public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap();

        for(char i: s.toCharArray()){

            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int j=0; j<s.length(); j++){

            if(map.get(s.charAt(j))==1) return j;
        }

        return -1;
    }

}
