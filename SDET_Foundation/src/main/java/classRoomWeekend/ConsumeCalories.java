package classRoomWeekend;

import org.junit.Assert;
import org.junit.Test;

public class ConsumeCalories {
	/*
	 * Input: calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3 Output: 0
	 * 
	 * 1)For output Total Calories have a int variable intially as '0'
	 * 2)Itearate through the calories value upto the K value
	 * 3)Sum up the values
	 * 4)compare with upper limit and lower limit 
	 * 5)if lesser than lower reduce 1 point to Total calories
	 * 6)If greater that upper add one point to Total calories
	 * 7 return the total calories
	 */
	@Test
	public void Test1() {
		Assert.assertEquals(0, CaloriesCount(new int[] {1,2,3,4,5},1,3,3));
	}
	
	public void Test2() {
		Assert.assertEquals(1, CaloriesCount(new int[] {3,2},2,0,1));
	}


	public int CaloriesCount(int[]calories,int k, int lower, int upper) {
		//Total Calories have a int variable intially as '0'
		int totalcalories = 0;
		
		//Itearate through the calories value upto the K value
		for (int i = 0; i <= calories.length-k; i++) {
			int compare=0;
			for (int j = i; j < i+k; j++) {
				
				compare+=calories[j];
			}
			
			if (compare<lower) {
				totalcalories-=1;
			}
			if (compare>upper) {
				totalcalories+=1;
			}
		}
		
		return totalcalories;
		

	}

}
