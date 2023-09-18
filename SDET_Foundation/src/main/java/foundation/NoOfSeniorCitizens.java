package foundation;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class NoOfSeniorCitizens {
/*
 * Input we get string array
 * ouput integer - no of senior citizens
 * write a for loop to iterate string array
 * substrin the age
 * if age greater than 60 ++ the counter and return count
 */
	
	
	@Test
	public void test1() {
		Assert.assertEquals(2, SeniorCitizens(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"} ));
		
	}
	
	public int SeniorCitizens(String[] input) {
		
		int count=0;
	//	String word1= word.substring(11, 13);
		for (int i = 0; i < input.length; i++) {
			String word1= input[i].substring(11, 13);
			int age = Integer.parseInt(word1);
			if (age>60) {
				count++;
				
			}
		}
		return count;
	}
}
