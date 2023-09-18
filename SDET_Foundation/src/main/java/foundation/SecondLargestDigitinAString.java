package foundation;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SecondLargestDigitinAString {
	
@Test
public void Test1() {
	Assert.assertEquals(2,FindSecndLarge("dfa12321afd"));
}

@Test
public void Test2() {
	Assert.assertEquals(-1,FindSecndLarge("abc1111"));
}


public int FindSecndLarge(String input) {
	
	String s = input.replaceAll("[A-Za-z]", "");
	char[] a = s.toCharArray();
	int[] arr = new int[s.length()];
	int count =0;
	Set<Integer> set = new HashSet();
	for (char i:a) {
		
		arr[count]= i-48;// The character value of 48 is 0 in ASCII table
		count++;
	}
	Arrays.sort(arr);
	for (Integer integer : arr) {
		set.add(integer);
	}
	int[] arr1 = new int[set.size()];
	int count1 = 0;
	for (Integer integer : set) {
		arr1[count1] = integer;
		count1++;
	}
	System.out.println(arr1.length);
	if (arr1.length==1) {
		return -1;
	}
	else {
		return(arr1[1]);
	}
	
	
}

}
