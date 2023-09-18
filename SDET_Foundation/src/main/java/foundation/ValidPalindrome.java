package foundation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

public class ValidPalindrome{
	
@Test
public void test1() {
    
    Assert.assertEquals(true,isPalindrome("A man, a plan, a canal: Panama"));
}

public boolean isPalindrome(String s) {
	String str= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
	String ori =str;
	String rev ="";
	for (int i = str.length()-1; i >=0; i--) {
		rev  = rev + str.charAt(i);
	}
	return ori.equals(rev);
	
}
}