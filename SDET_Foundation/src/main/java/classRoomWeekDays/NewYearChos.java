package classRoomWeekDays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class NewYearChos {
//	https://www.hackerrank.com/challenges/new-year-chaos/problem?isFullScreen=true&h_l=
//		interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
	/*
	 * 1)iterate through given list from reverse and check if the difference value is greater than 2
	 * 2)If greater than 2 return chaotic
	 */
	@Test
	public void Test1() {
		Assert.assertEquals("too chaotic",Chaos(Arrays.asList(2, 5, 1, 3, 4)));
	}
	
	public String Chaos(List<Integer> q) {
		
		for (int i = 0; i < q.size()-1; i++) {
			if (q.get(i)-q.get(i+1)>2) {
				return "too chaotic";
			}
		}
		return "";
	}

}
