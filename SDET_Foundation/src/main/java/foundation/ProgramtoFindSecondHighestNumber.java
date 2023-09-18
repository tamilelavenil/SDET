package foundation;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class ProgramtoFindSecondHighestNumber {
	@Test
	public void Test1() {
		Assert.assertEquals(94, findSecondHighestNumber(new int[] {100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89}));
	}
	public int findSecondHighestNumber(int arr[]) {
//		 Program to find the second-highest number in an array.
//		 I/P  int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
//		 O/P     Second largest number is  94
		int highestNum =0 ,counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int z = 0;
				if (arr[j]<arr[i]) {
					z = arr[i];
					
					arr[i] = arr[j];
					
					arr[j] = z;					
				}
			}
		}
		return arr[arr.length-2];
		
	}

}

