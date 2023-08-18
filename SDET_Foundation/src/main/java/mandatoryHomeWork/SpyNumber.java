package mandatoryHomeWork;

public class SpyNumber {
	/*
	Question:
	Find whether it is SPY Number - If the sum of the given number and Product of the number is equals then it is spy number
	Test data
	inp = 132, inp = 1124;
	1)The number mod 10 
	2)add single digits and find sum
	3)multiply single digits and find product
	4)div the num until it becomes zero
	*/
	public static void main(String[] args) {
	int num = 132;
	int rem = 0,sum =0, prod =1;
	
	while(num>0) {
		rem = num%10;
		
		sum += rem;
		
		prod=prod *rem;
		
		num=num/10;
		
	}
	
	System.out.println(sum==prod);

	}

}
