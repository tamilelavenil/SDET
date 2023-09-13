package mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInaString {
	/*
	 * https://leetcode.com/problems/reverse-words-in-a-string-iii/ 
	 * Example 1:
	 * 
	 * Input: s = "Let's take LeetCode contest" Output:
	 * "s'teL ekat edoCteeL tsetnoc" 
	 * Example 2:
	 * Input: s = "God Ding" Output: "doG gniD" 
	 * 1)Iterate through the string and append the charAt of 'i' if i not equals ' '.
	 * 2)if i equals ' '|| i==s.length()-1 append the string1.reverse in string2 clear string 1;
	 * 3)add another condition that if i!=s.length()-1 then add spaces
	 * 4)return string2.
	 */	
	
		@Test
		public void Test1() {
			Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverse("Let's take LeetCode contest"));
		}
		@Test
		public void Test2() {
			Assert.assertEquals("doG gniD", reverse("God Ding"));
		}
		
		public String reverse(String s) {
			StringBuilder build = new StringBuilder();
			StringBuilder output = new StringBuilder();
			
			for(int i=0; i<s.length(); i++) {
				if (s.charAt(i)!=' ') {
					build.append(s.charAt(i));
				}
				if (s.charAt(i)==' '|| i==s.length()-1) {
					build.reverse();
					output.append(build);
					System.out.println(output);
					build = new StringBuilder();
					
					if (i!=s.length()-1) {
						output.append(" ");
					}
					
				}
				
				
			}
			return output.toString();
		}
		
}
