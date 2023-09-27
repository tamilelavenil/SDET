package classRoomWeekdays;

public class TheBirthdayBarHackerRank {
	/*
	 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
	 * 
	 * 
		s =[1 2 1 3 2]
		d =3 m=2  output =2
		
		1)iterate through the array s
		2) month given is the fixed size of window to iterate
		3)iterate through the sub array
		4)check if the sum of subarray equals day
		5)if equals update count ++;
		6)return the final count 
	 */
	public static void main(String[] args) {
		int[]s = {1,2,1,3,2};
		
		int d =3, m =2, sum =0, output =0, pointer=0;
		
		while(pointer<m) {
			sum+=s[pointer++];  
		}
		if (sum==d) {
			output++;
		}
		
		while(pointer<s.length) {
			sum+=s[pointer];
			
			sum-=s[pointer-m];
			
			if (sum==d) output++;
			
			pointer++;
			
		}
		
		System.out.println(output);
	}

}
