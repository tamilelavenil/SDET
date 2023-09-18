package foundation;

import org.junit.Assert;
import org.junit.Test;

/*
 * /*
    Pseudo Code:
    1) Get Team number initially as Input[ Input team ]
    2) Declare a While Loop (Team size>1)
    3) If condition(to check whether it is a Even number)
    4)	total matches = n/2 ,teamsize = n/2
    5)else conition for Odd number
    6) total matches = (n-1)/2, teamsize = (n-1/2)+1
    7) Display the total matches played
    */
 
public class CountofMatchesinTournament {
	@Test
	public void test1() {
		Assert.assertEquals(13, CountofMatches(14));
		
	}
public int CountofMatches(int input) {
	int teamsize = input ;
	int totalmatches = 0;
	int finalmatch = 0;
	while(teamsize>1) {
		if(teamsize%2==0) {
		totalmatches = teamsize/2;
		teamsize = teamsize/2;
		finalmatch += totalmatches;
		}
		else{
			totalmatches = (teamsize-1)/2;
			teamsize = ((teamsize-1)/2)+1;
			finalmatch += totalmatches;
	}
}
	return finalmatch;
}}
