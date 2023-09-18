package foundation;
import org.junit.Assert;
import org.junit.Test;
public class FirstPalindrome {

@Test
public void tst1() {
	Assert.assertEquals("ada", checkPalindrome(new String[] {"abc","car","ada","racecar","cool"}));
}
@Test
public void tst2() {
	Assert.assertEquals("racecar", checkPalindrome(new String[] {"notapalindrome","racecar"}));
}
@Test
public void tst3() {
	Assert.assertEquals("", checkPalindrome(new String[] {"def","ghi"}));
}

public String checkPalindrome(String[] words) {

		for (String word : words) {
			String rev ="";
			for (int i = word.length()-1; i >=0 ; i--) {
				rev =rev+ word.charAt(i);
			}

			if(rev.equals(word)) {
				return word;
			}
		}
		return "";

	}
}