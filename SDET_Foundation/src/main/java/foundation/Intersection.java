package foundation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Intersection {

	
	@Test
	public void Test1(){
		Assert.assertArrayEquals(new int[] {2}, Inter(new int[] {1,2,2,1},new int[] {2,2}));
	}
	@Test
	public void Test2(){
		Assert.assertArrayEquals(new int[] {4,9}, Inter(new int[] {4,9,5},new int[] {9,4,9,8,4}));
	}
	
	public int[] Inter(int[]num1, int[]num2) {
		List<Integer> list=new ArrayList<Integer>();  
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num1[i]==num2[j]) {
					list.add(num1[i]);
				}
			}
		}
		Set<Integer> set = new HashSet<Integer> (list);
		int[] arr = new int[set.size()];
		int count=0;
		for (int i : set) {
			arr[count]=i;
			count++;
		}
		
		return arr;
		
	}
}
