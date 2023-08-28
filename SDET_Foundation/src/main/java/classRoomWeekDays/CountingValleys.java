package classRoomWeekDays;

public class CountingValleys {
/*
 * 1)Receive a string like UDDDDUDUU
 * 2) if string starts with U and ends with D and sum=0
 * 3)if it starts with D and ends with U and sum = 0 count valley as 1
 * 4)return the valley count
 */
	public static void main(String[] args) {
//		String a = "UDDDUDUU";
		String a = "DDUUUUDD";

		int sum = 0;
		int Valleycount=0;
		for(int i = 0; i<a.length();i++) {
				if (a.charAt(i)=='D') {
					sum-=1;
					
					
				}
				else {
					sum+=1;
					if (sum==0) {
						Valleycount++;
					}
				}
			
		}	
		System.out.println(Valleycount);
	}

}
