package mandatoryHomework.week3.HashMap_Set_ASCII;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfSentenceIsPangram_Set {

	@Test
	public void Test1() {
		Assert.assertEquals(true,checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(false,checkIfPangram("leetcode"));
	}
	
	public boolean checkIfPangram(String sentence) {
		Set<Character> set = new HashSet<Character>();

	     for(char i: sentence.toCharArray()){
	         if(set.size()!=26) set.add(i);
	         else break;
	     }

	     return(set.size()==26);
    }
}
