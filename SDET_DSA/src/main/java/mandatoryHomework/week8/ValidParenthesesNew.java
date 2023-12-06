package mandatoryHomework.week8;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class ValidParenthesesNew {
	/*
	 * Test Data:
	 * ([{])]){}( ([}
	 * 
	 * Good  Parenthesis 
		([{])} - True
		){}( - False
		([} - False
		(} - False
	 * 
	 * 
	 */
	@Test
	public void test1() {
		String s = "([{])}";
		validparen(s);
	}
	public boolean validparen(String s) {
		Map<Character,Integer> map = new HashMap();
		 for(char each:s.toCharArray()) {
			 if(each=='('||each=='['||each=='{') {
				 map.put(each,1);
			 }
		 }
		 System.out.println(map);
		 for(char each:s.toCharArray()) {
			 
			 if(each==')') {
				 int a =  map.get('(')-1;
				 map.put('(', a);
			 }
			 
			 else if(each==']') {
				 int b =  map.get('[')-1;
				 map.put('[', b);
			 }
			 
			 else if(each=='}') {
				 int c =  map.get('{')-1;
				 map.put('{', c);
			 }
		 }
		 Collection<Integer> list = map.values(); 
		 for(Integer each: list) {
			 if(each!=0){
				 return false;
				 }
		 }
		 System.out.println(map);
		 return true;
	}

}
