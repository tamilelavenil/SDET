package foundation;

public class NearestMultipleOfTen {

	
	public static void main(String[] args) {
		int n =26, 
		
		rem = n%10;
		
		
		if (n<10) {
			System.out.println(10);
		}
		
		if (rem<=5) {
		System.out.println(n-rem);	
		} 
		
		else{
			System.out.println(10-rem+n);
		}
		
	}

}
