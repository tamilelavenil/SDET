package classRoomWeekDays;
 
import org.junit.Test;
import org.junit.Assert;

public class NumberOfSeniorCitizens {

	
	@Test
	public void Test1() {
		Assert.assertEquals(2, SeniorCitizens(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(0, SeniorCitizens(new String[] {"1313579440F2036","2921522980M5644"}));
	}

	/*
	 * https://leetcode.com/problems/number-of-senior-citizens/description/
	 * 1) We get the details of passenger as a input array 
	 * 2) Iterate through the array get the value of age in a sub string and convert to int
	 * 3)compare the value if greater than 60 and return the count of senior citizens
	 */
	public int SeniorCitizens(String[] a) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			String b = a[i].substring(11,13);
			int age = Integer.parseInt(b);
			if (age>60) {
				count++;
			}	
		}
		return count;
	

	}

}
