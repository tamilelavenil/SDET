package mandatoryHomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssignCookies {
/*https://leetcode.com/problems/assign-cookies/
 * Input: g = [1,2,3], s = [1,1]
	Output: 1
	Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
	And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
	You need to output 1.
	
	1)Get the input as 2 Integer arrays greed and sizeofcookies
	2)Iterate the greed and size of cookies
	3)if size is >= greed -make greed as zero for ith position;
	4)return the children satisfied by iterating number of zeroes in greed array
 */
	public static void main(String[] args) {
		//int [] g = {1,2,3}, s = {1,1};
		//int [] g = {1,2}, s = {1,2,3};
		//int[] g = {10,9,8,7}, s = {5,6,7,8};
		int[] g = {1,2,3}, s = {3};
		int count =0;

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < g.length; j++) {
				if (i<s.length&&s[i]>=g[j]) {
					g[j]=0;	
					count++;
				}
				if (count>=s.length) {
					break;
				}
		}}
			
		int childrensatisfied =0;
		for (int i1 = 0; i1 < g.length; i1++) {
			
			if(g[i1]==0) {
				childrensatisfied++;
			}
		}
		System.out.println(childrensatisfied);
	}
}
	
		
	
