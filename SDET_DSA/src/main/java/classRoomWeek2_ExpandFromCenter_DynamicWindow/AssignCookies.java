package classRoomWeek2_ExpandFromCenter_DynamicWindow;

public class AssignCookies {
	/*
	 * https://leetcode.com/problems/assign-cookies/
	 * 
	 * 1)sort both the arrays
	 * 2)if s[j]>=g[i] then increase count of children++
	 * 3)
	 */	public static void main(String[] args) {
		int[] g = {1,2,3};
		
		int[] s = {1,1};
		
		int left =0 , right =0 , child =0;
		
		while(left<g.length&&right<s.length) {
			
			if(s[right]>=g[left]) {
					child++;
					left++; right++;
				}
				else {
					right++;
				}
			}
			System.out.println(child);
		}
	 
	 

	}


