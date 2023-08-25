package classRoomWeekDays;

public class CountingValleys {

	public static void main(String[] args) {
		String a = "UDDDUDUU";
		char[] b = a.toCharArray();
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i]=='D') {
				sum-=1;
			}
			else {
				sum+=1;
			}
		}
		System.out.println(sum);
	}

}
