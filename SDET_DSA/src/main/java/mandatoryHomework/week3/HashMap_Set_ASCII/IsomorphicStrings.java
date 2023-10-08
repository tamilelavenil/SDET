package mandatoryHomework.week3.HashMap_Set_ASCII;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStrings {
	/*
	 * https://leetcode.com/problems/isomorphic-strings/description/ Input: s =
	 * "egg", t = "add" Output: true
	 * 
	 * 1)add every value in s in map key and same pointer value in t in value
	 * 2)if different value is trying to update in already updated value break and return false
	 * 3)if all the alphabets satisfies return true
	 */
	@Test
	public void Test1() {
		Assert.assertEquals(true,isomorphicString("egg","add"));
	}
	
//	@Test
//	public void Test2() {
//		Assert.assertEquals(false,isomorphicString("badc","baba"));
//	}
//	
//	@Test
//	public void Test3() {
//		Assert.assertEquals(false,isomorphicString("bar","foo"));
//	}
	public boolean isomorphicString(String s, String t) {
		
		Map<Character,Character> map = new HashMap();
		
		if(s.length()!=t.length()) return false;
		
		int left =0, right =0;
		
		while(right<s.length()) {
			if(!map.containsKey(s.charAt(left))) {
				if(!map.containsValue(t.charAt(right))) {
					map.put(s.charAt(left), t.charAt(right));
				}
				else {
					return false;
				}
			}
			
			else {
				char check = map.get(s.charAt(left));//d
				//g !=dsysos
				System.out.println(check);
				if(check!=t.charAt(right)) {
					return false;
				}
			}
			
			if(!map.containsKey(s.charAt(left))) {
				map.put(s.charAt(left), t.charAt(right));}
			
			if(map.containsKey(s.charAt(left))) {
				char check = map.get(s.charAt(left));
				if(check!=t.charAt(right)) {
					return false;
				}
			}
			
			if(map.containsValue(t.charAt(right))) {
				char check1 = map.get(s.charAt(left));
//				if(check!=t.charAt(right)) {
//					return false;
//				}
			}
			
			
			
			left++; right++;			
		}
		
		
		return true;
	}

}
