package foundation;

import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnNumber {
	
	
	@Test
	public void Test1() {
		Assert.assertEquals(27, getExcelColNum("AA"));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(28, getExcelColNum("AB"));
	}
	
	public int getExcelColNum(String inp) {
		int result = 0;
		
		for (int i = 0; i < inp.length(); i++) {
			result*=26;
			
			result+= inp.charAt(i)-'A'+1;
		}
		
		return result;
	

	}
}
