package mandatoryHomework.week3.HashMap_Set_ASCII;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfSentenceIsPangram {

	@Test
	public void Test1() {
		Assert.assertEquals(true,checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(false,checkIfPangram("leetcode"));
	}
	
	public boolean checkIfPangram(String sentence) {
	      
		Map<Character,Integer> alpha = new HashMap();
		int count =0;
		for(char i: sentence.toCharArray()) {	
			if(!alpha.containsKey(i))
				alpha.put(i, 1);
		}
		
		for(Map.Entry<Character,Integer> eachentry: alpha.entrySet()) {
			if (eachentry.getValue()!=1) {
				return false;
			}
			else if(eachentry.getValue()==1) {
				count++;
			}
		}
		
		System.out.println(alpha);
		return (count==26);
    }
}
