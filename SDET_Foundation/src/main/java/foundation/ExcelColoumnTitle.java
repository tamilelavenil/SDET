package foundation;

import org.junit.Assert;
import org.junit.Test;

public class ExcelColoumnTitle {

	
	/*
	 * We are getting input as a Integer - the coloumn number of the excel
	 * We need to return output as String - the column title of the excel
	 * write a while loop until n is greater than 0
	 * sub -1 (we are subtracting here because we consider
	 *  from 0-25 a-z)
	 * remainder = number % 26
	 * add the char value in a string of remainder
	 * divide the number by 26
	 * repeat the loop until 0 and the char values
	 * iterate the string through reverse in for loop and return string
	 */
	@Test
	public void Test1() {
		Assert.assertEquals("A", getExcelColTitle(1));
	}
	@Test
	public void Test2() {
		Assert.assertEquals("AA", getExcelColTitle(27));
	}
	@Test
	public void Test3() {
		Assert.assertEquals("ZY", getExcelColTitle(701));
	}
	@Test
	public void Test4() {
		Assert.assertEquals("BXZ", getExcelColTitle(2002));
	}
	public String getExcelColTitle(int inp) {
		
		String out = "";
		String output = "";
		
		int rem =0;
		while(inp>0) {
			inp = inp -1;
			rem = inp%26;
			char add=65;
			add += rem;
			out+=add;
			inp = inp/26;
			add = 0;
		}
		for (int i = out.length()-1; i >=0; i--) {
			output+=out.charAt(i);
		}
		return output;
	}

	
}
