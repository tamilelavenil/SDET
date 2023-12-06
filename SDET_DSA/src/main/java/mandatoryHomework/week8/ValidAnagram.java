package mandatoryHomework.week8;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	/*
	 * Given two strings, check if they are anagrams of each other. String str1 =
	 * "listen"; String str2 = "silent";
	 * 
	 * 
	 */
	// Output: true
	public static void main(String[] args) {
		String str1 = "listenqw", str2 = "silent";
		
		Map<Character,Integer> map = new HashMap();
	//	Map<Character,Integer> map1 = new HashMap();
		
		for(char each:str1.toCharArray()) {
			map.put(each, map.getOrDefault(each, 0)+1);
		}
		
//		for(char each1:str2.toCharArray()) {
//			map1.put(each1, map1.getOrDefault(each1, 0)+1);
//		}
		
		for(char each:str2.toCharArray()) {
			if(map.containsKey(each)) map.remove(each);
			else {
				System.out.println("False");
				break;}
			
		}
		
		System.out.println(map.size()==0);

	}

}
