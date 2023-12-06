package mandatoryHomework.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupAnagrams {
	/*
	 * Given an array of strings, group anagrams together. String[] strs = {"eat",
	 * "tea", "tan", "ate", "nat", "bat"};
	 * // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	 */
	
	public static void main(String[] args) {
		List<String> list = new ArrayList(Arrays.asList("eat","tea", "tan", "ate", "nat", "bat"));
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}

/*
 * Babu Manickam 25-11-2023 12:30 • package dsa;
 * 
 * import java.util.ArrayList; import java.util.Arrays; import
 * java.util.HashMap; import java.util.List;
 * 
 * import org.junit.Test;
 * 
 * public class GroupAnagrams {
 * 
 * @Test public void testGroupAnagrams() { String[] strs = {"eat", "tea", "tan",
 * "ate", "nat", "bat"}; // {"eat", "tea", "tan", "ate", "nat", "bat"}; // aet
 * aet groupAnagrams(strs); }
 * 
 * // strs --> n --> 6 words
 * 
 * private void groupAnagrams(String[] strs) {
 * 
 * HashMap<String, List<String>> map = new HashMap<>();
 * 
 * // O(n*mlogm) for (String word : strs) { // convert into character array
 * char[] chars = word.toCharArray(); // characters inside n --> 3 --> m
 * 
 * // sort it Arrays.sort(chars);
 * 
 * // char[] to String String sortedWord = new String(chars);
 * System.out.println(sortedWord);
 * 
 * // if the given sorted word is inside the map?
 * if(!map.containsKey(sortedWord)) { map.put(sortedWord, new
 * ArrayList<String>()); }
 * 
 * // in all cases - add the word to the list map.get(sortedWord).add(word);
 * 
 * }
 * 
 * System.out.println(new ArrayList<>(map.values()));
 * 
 * }
 * 
 * }
 */
