package foundation;
import org.junit.Assert;
import org.junit.Test;

public class CheckIfItIsAStraightLine {

//	public static void main(String[] args) {
//		int[][] a={{10,20},{30,40}};//declaration and initialization   
//		System.out.println("Two dimensional array elements are");    
//		System.out.println(a[0][0]);    
//		System.out.println(a[0][1]);    
//		System.out.println(a[1][0]);    
//		System.out.println(a[1][1]);   
		//int[][] a={{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};//declaration and initialization 

		@Test
		public void test1() {
			boolean test1 = StraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}});
			Assert.assertEquals(true, test1);
			
		}
		
		
		@Test
		public void test2() {
			boolean test2 = StraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}});
			Assert.assertEquals(false, test2);}
			
	public boolean StraightLine(int[][] inp) {
		
		if (inp.length <= 2) {
            return true; 
        }
		for (int i = 2; i < inp.length; i++) {
            int x1 = inp[i - 2][0];
            int y1 = inp[i - 2][1];
            int x2 = inp[i - 1][0];
            int y2 = inp[i - 1][1];
            int x3 = inp[i][0];
            int y3 = inp[i][1];
            if ((y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1)) {
                return false;
            }
}   
            return true;
		
}

}