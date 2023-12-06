package mandatoryHomework.week8;

public class ValidPalindrome {
	/*
	 * Given a string, determine if it is a palindrome, considering only
	 * alphanumeric characters and ignoring cases. String input =
	 * "A man, a plan, a canal, Panama!"; // Output: true
	 * amanaplanacanalpanama
	 */
	public static void main(String[] args) {
		String input = "A man, a plan, a canal, Panama!";
		StringBuilder build = new StringBuilder();
		for(char each:input.toCharArray()) {
			if(each>='A' && each<='Z' ) {
				char app = (char) (each+32);
				build.append(app);
			}
			else if(Character.isAlphabetic(each)||Character.isDigit(each)) {
				build.append(each);
			}
		}
		
		int l =0, r=build.length()-1; boolean flag =true;
		while(l<r) {
			if(build.charAt(l)==build.charAt(r)) {
				l++;r--;
				continue;
			}
			else {
				flag=false;
				break;
			}		
			
		}
		System.out.println(build);
		
		System.out.println(flag ? "It is a palndrome" :"It is not a palindrome");
	}

}
