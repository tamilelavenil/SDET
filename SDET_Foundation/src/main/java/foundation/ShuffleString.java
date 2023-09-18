package foundation;
import org.junit.Assert;
import org.junit.Test;
public class ShuffleString {
	//Input: String, int []
		//Output:, Reshuffled String
		//Logic: 
		// 1. Creat a char[] of size s.length()
		//3. Iterate in a for loop till the size of int[]
		//4. store the charAt(i) in fin[index[i]]
		//5. return string

		public String shuffle(String s, int[] index) {

			char[] fin = new char[s.length()];

			for (int i = 0; i < index.length; i++) {
				fin[index[i]]=s.charAt(i);
			}

			return new String(fin);
		}

		@Test
		public void tst1() {

			Assert.assertEquals("leetcode", shuffle("codeleet",new int[] {4,5,6,7,0,2,1,3}));
		}

		@Test
		public void tst2() {

			Assert.assertEquals("abc", shuffle("abc",new int[] {0,1,2}));
		}
	}
/*
 * Declare a empty array to store the output
 * write a for loop till end of indices
 * add the charAt[i] to output string
 * example indices[0] is 4 , s.charAt[4] is code is 'l' 
 * 
 */
//	@Test
//	public void test1(){
//		int[] indices = new int[]{4,5,6,7,0,1,2,3};
//		 Assert.assertEquals("leetcode", shuffle(indices,"codeleet"));
//	}
//	
//	@Test
//	public void test2(){
//		int[] indices = new int[]{0,1,2};
//		 Assert.assertEquals("abc", shuffle(indices,"abc"));
//	}
//
//	
//	public String shuffle(int[] indices, String s) {
//		
//
//	String a = "";
//	
//	for (int i = 0; i < indices.length; i++) {
//		a = a + s.charAt(indices[i]);
//	}
//	
//	return  a;
//}
