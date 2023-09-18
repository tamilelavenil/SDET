package foundation;
import org.junit.Test;
import org.junit.Assert;
public class AverageValueofEvenNumbersThatAreDivisiblebyThree {
	@Test
	public void Test1() {
		Assert.assertEquals(9,Average(new int[] {1,3,6,10,12,15})  );
	}
	@Test
	public void Test2() {
		Assert.assertEquals(0,Average(new int[] {1,2,4,7,10})  );
	}
	
	/*
	 * Get input as integer array and return output as integer
	 * Iterate through the array and check the integer
	 * Whether div by 3 and 2 and add return the average
	 */
	public int Average(int []inp) {
	
		int sum = 0, avg =0;
		for(int i: inp) {
			if (i%2==0 && i%3==0) {
				sum += i;
				avg++;
			}
		}
		
		if (sum>0) {
			return sum/avg;	
		}
		
		return sum;

	}

}
