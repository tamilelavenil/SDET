package foundation;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber {
	/*
	 * XOR is a bitwise operator, and it stands for “exclusive or.”

		It performs logical operation.

		If input bits are the same, then the output will be false(0) else true(1).
		
		1)Receive Input as a num array and declare a variable as 0 to return the output.
		
		2) traverse through the Array using For Loop
		
		3) Use the Or Operator to compare the numbers in Loop.
		
		4) If the numbers are same it will return 0 and if diff it will return 1.
	 */
	
	@Test
	public void test1() {
		Assert.assertEquals(1, single(new int[] {2,2,1}));	
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(4, single(new int[] {4,1,2,1,2}));	
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(-2, single(new int[] {1,1,-2}));	
	}
	    public int single(int[] nums) {
	        int ans =0;
	              
	        for(int i=0;i<nums.length;i++) {
	        	/*
	        	 * ans = 0 XOR 2 = 2(ans is 2)
	        	 * ans = 2 XOR 2 = 0(ans is 0)
	        	 * ans = 0 XOR 1 = 1(ans is 1)
	        	*/
	            ans ^= nums[i];
	        }
	        return ans;
	    }
	}
//	
//	public static void main(String[] args) {
//	int[]a= {2,2,1};
//	//int[]b= {2,2,1};
//	
//	int val=0 ;
//	for (int i = 0; i < a.length; i++) {
//			int count =0;
//		for (int j = i+1; j < a.length; j++) {
//			if (a[i]==a[j]) {
//				count = count+ 1;
//				}
//		}
//		if(count==1) {
//			System.out.println(a[i]);;
//		}
//	}
//	
//	
//	}



