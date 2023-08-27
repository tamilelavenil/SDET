package classRoomWeekDays;

public class CountingValleys {
/*
 * 1)Receive a string like UDDDDUDUU
 * 2) if string starts with U and ends with D and sum=0
 * 3)if it starts with D and ends with U and sum = 0 count valley as 1
 * 4)return the valley count
 */
	public static void main(String[] args) {
		String a = "UDDDUDUU";
		int sum = 0;
		String check ="";
		int len = check.length();
		for(int i = 0; i<a.length();i++) {
			char step1 = a.charAt(i);
			char step2 = a.charAt(i+1);
				if (step1=='D') {
					sum-=1;
					if (step1=='U'&&step2=='D') {
						
					}
				}
				else {
					sum+=1;
				}
			
		}
		System.out.println(sum);		
		System.out.println(check);
		System.out.println(len);
	}

}
