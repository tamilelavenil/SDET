package foundation;

import org.junit.Assert;
import org.junit.Test;


public class DetermineTheColourOfChessBoard {

	/*
	 * Receive Input as a String - the coordinates of chess board
	 * Output should be False for Black & True for White
	 * iterate through the String and validate the colour of coord
	 * finally do a XOR operation and return colour
	 */
	
	
	
	public boolean ColourOfChess(String inp) {
				
		char[] check = inp.toCharArray();
		
		boolean x =true, y= true;
		
		for(int i = 0; i<check.length; i++) {
			if (check[i]=='a'||check[i]=='c'||check[i]=='e'||check[i]=='g') {
				x = false;
			}				
		}
		
		for (int j = 0; j < check.length; j++) {
			if (check[j]=='1'||check[j]=='3'||check[j]=='5'||check[j]=='7') {
				y = false;
			}
		}
		return x^y;
	}
	@Test
	public void Test1() {
		Assert.assertEquals(false,ColourOfChess("a1"));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(true,ColourOfChess("h3"));
	}
	@Test
	public void Test3() {
		Assert.assertEquals(false,ColourOfChess("c7"));
	}
}
