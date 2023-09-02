package classRoomWeekDays;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class ShuffleString {
	
	@Test

	public void Test1(){
	Assert.assertEquals("leetcode",Shuffle("codeleet",new int[]{4,5,6,7,0,2,1,3}));
	}
	/*
	https://leetcode.com/problems/shuffle-string/
	s = "codeleet", indices = [4,5,6,7,0,2,1,3]
	s = "abc", indices = [0,1,2]

	1)Given a Input string and a int array
	2)Iterate through the int array pick the index value and then pick the charAt Position of string of index value.
	3)add the string.charAt(pos) in a new string
	4)return the string
	*/	
	
	public String Shuffle(String s, int[] indices) {
		
	StringBuilder shufflestring = new StringBuilder();
	String[] out = new String[indices.length];
	
	for (int i = 0; i < indices.length; i++) out[indices[i]]=String.valueOf(s.charAt(i));
	
	//for (String string : out) shufflestring.append(string);
	//System.out.println(String.valueOf(out));
	return String.valueOf(out);
	}
}
