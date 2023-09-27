package mandatoryHomework.week2.DynamicSlidingWindow;

import org.junit.Test;

import org.junit.Assert;

public class DetermineTheWinnerOfaBowlingGame {
//	/*
//	 * https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/
//	 * description/
//	 * Input: player1 = [4,10,7,9], player2 = [6,5,2,3]
//		Output: 1
//		
//		1)iterate through the scores of players
//		2)have left and right pointer starting from same place
//		3)if score 10 is present make left and right pointers to same place
//		4)check for 2 positions after the 10 score and multiply with *2
//		5)else just add the score to players totalscore upto final score in array
//		6)check the total score of player1 and 2 
//		7)if 1>2 return 1 if 2>1 return 2 if both are equal return 0	
//	 */	

	  @Test public void test1() { Assert.assertEquals(1, Game(new int[] {4,10,7,9},
	  new int[] {6,5,2,3})); }
	  
	  @Test public void test2() { Assert.assertEquals(2, Game(new int[] {5,6,1,10},
	  new int[] {5,1,10,5})); }
	 
	  @Test public void test3() { Assert.assertEquals(2, Game(new int[]
	  {7,7,4,7,7}, new int[] {7,2,3,10,10})); }
	
	@Test
	public void test4() {
		Assert.assertEquals(2, Game(new int[] { 3, 6, 10, 8 }, new int[] { 9, 9, 9, 9 }));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(2, Game(new int[] {7,10,2,6,8,5,4,6,10,9,1,4,3,10,0,9,6,1,0}, new int[] {2,1,9,4,5,0,6,5,6,10,10,4,8,8,6,9,2,9,5}));
	}
	
	@Test
	public void test6() {
		Assert.assertEquals(1, Game(new int[] {9,7,10,7}, new int[] {10,2,4,10}));
	}
	
	

	public int Game(int[] player1, int[] player2) {

		int score1 = Sum(player1), score2 = Sum(player2);

		if (score1 > score2)
			return 1;

		if (score2 > score1)
			return 2;

		return 0;
	}

	public int Sum(int[] scorecard) {
		int sum = 0, left = 0, right = 0;  //2,1,9,4,5,0,6,5,6,10,10,4,8,8,6,9,2,9,5
		while (right < scorecard.length) {
			if (scorecard[right] == 10 ) {
				left = right;
				sum+=scorecard[right];
				right++;
			
				while (right < scorecard.length && right-left<=2) {

					if (scorecard[right] != 10) {
						sum += 2 * scorecard[right++];
					}

					else {
						left=right;
						sum += 2 * scorecard[right++];
					}

				}
			}

			else {
				sum += scorecard[right];
				right++;
			}

		}
		System.out.println(sum);
		return (sum);
	}
//	public int Sum(int[] scorecard) {
//		int sum=0, left=0, right=0;
//			while(right<scorecard.length){
//	            if(scorecard[right]==10 && right!=scorecard.length-1){
//	                left=right;
//	                right+=3;
//	                while(left<right && left<scorecard.length){
//	                    if(scorecard[left]!=10){
//	                        sum+=2*scorecard[left++];
//	                    }
//	                    else{
//	                        sum+=scorecard[left++];    
//	                    }
//	                   
//	                }
//	            }
//	            
//	            else{
//	                sum+=scorecard[right++];    
//	            }
//		 		
//	        }
//			//System.out.println(sum);
//	        return(sum);
//
//	    }
}
