package mandatoryHomeWork;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumberOfStringPairs {
	/*
	 * https://leetcode.com/problems/find-maximum-number-of-string-pairs/
	 * description/ Input: words = ["cd","ac","dc","ca","zz"] Output: 2
	 * 1)Iterate through the string array through two loops as i=0 and i+1
	 * 2)if i equals reverse of j the increase count +1
	 * 3)return count
	 */
	@Test
	public void test1() {
		Assert.assertEquals(2,MaximumPairs(new String[] {"cd","ac","dc","ca","zz"}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(1,MaximumPairs(new String[] {"ab","ba","cc"}));
	}
	
	public int MaximumPairs(String[] words) {
		int pairs = 0;
		
		for (int i = 0; i < words.length; i++) {
			StringBuffer build = new StringBuffer();
			build.append(words[i]);
			build.reverse();
			for (int j = i+1; j < words.length; j++) {		
				if (build.toString().equals(words[j])) {
					pairs++;
					System.out.println(pairs);
					break;
				}
			}
		}
		//System.out.println(pairs);
		return pairs;
	}
	
}
