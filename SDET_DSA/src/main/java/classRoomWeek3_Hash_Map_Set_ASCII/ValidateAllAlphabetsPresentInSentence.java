package classRoomWeek3_Hash_Map_Set_ASCII;

import java.util.Arrays;
import java.util.HashSet;

public class ValidateAllAlphabetsPresentInSentence {

	public static void main(String[] args) {
		String a = "abcd efgh ijklmno pqrst uvwxyz";
		HashSet<Character> set = new HashSet();
		
		for (int j = 0; j < a.length(); j++) {
			if (a.charAt(j)>=97 && a.charAt(j)<=122) {
				set.add(a.charAt(j));
			}
		}
		System.out.println(set.size());
		System.out.println(set.size()==26);
		
	}

}
//boolean array
//		boolean[] check = new boolean[26];
//		
//		int count=0;
//		
//		for (int i = 0; i < a.length(); i++) {
//			if(a.charAt(i)>=97 && a.charAt(i)<=122) {
//			check[a.charAt(i)-'a']=true;}
//		}
//		
//		System.out.println();