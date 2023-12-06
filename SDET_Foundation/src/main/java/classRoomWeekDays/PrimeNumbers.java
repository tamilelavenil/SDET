package classRoomWeekDays;

public class PrimeNumbers {
	/*
	 * test data
	 * input:
	 * positive = 2,3,7 [prime]
	 * negative = 4,120,1000 [non prime]
	 * 
	 * 1)if the number is 2 return prime
	 * 2)if the number is not divisible by 2 
	 * 3)
	 * 
	 *///time complexity O[N]
	public static void main(String[] args) {
		int input = 10;
		
		//iterating over the given range of number
		int sum =0;
		for(int i=1; i<=input; i++) {
			sum+=i;
			System.out.println("Adding numbers in range"+sum);
		}
		

	}

}
