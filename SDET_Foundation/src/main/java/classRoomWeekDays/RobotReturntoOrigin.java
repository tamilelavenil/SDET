package classRoomWeekDays;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class RobotReturntoOrigin {
	
	/*
	 * https://leetcode.com/problems/robot-return-to-origin/description/
	 * test data LL UD
	 * 1)We get the robot motions as a string
	 * 2)Iterate through the robot motions
	 * 3)add one from origin position of the robot if it return on the same way subtract 1
	 * 4)based on origin return boolean value
	 */	
	@Test
	public void Test1() {
		Assert.assertEquals(true, Robot("UD"));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(false, Robot("LL"));
	}
	public boolean Robot(String inp) {
		//LDRRLRUULR     lr = -1+1+1-1+1-1+1
		//				ud = -1+1+1
		int leftRight =0;
		int upDown =0;
		for (int j = 0; j < inp.length(); j++) {
			if (inp.charAt(j)=='U') {
				upDown+=1;
			}
			else if(inp.charAt(j)=='D'){
				upDown-=1;
			}
			else if (inp.charAt(j)=='R') {
				leftRight+=1;
			}
			else {
				leftRight-=1;
			}
		}
		return upDown==0&&leftRight==0;	
	}
}
