package classRoomWeekDays;

public class IsomorphicStrings {
	/*
	 * https://leetcode.com/problems/isomorphic-strings/description/
	 * s = "egg", t = "add" Output: true
	 * s = "foo", t = "bar" Output: false
	 * s = "paper", t = "title" Output: true
	 * 1)iterate through s add count if there are no value in array1[s.charAt[i]] arr1 len =256
	 * 2))iterate through t add count1 if there are no value in array2[s.charAt[j]] arr2 len =256
	 * 3)add the arr[s.charAt(i)] and arr1[t.charAt(j)] in two strings
	 * 4) compare whether two strings are equal or not
	 */	public static void main(String[] args) {
		 String s ="egg", t = "add";
		// String s ="foo", t = "bar";
		// String s ="bbbaaaba" ,t = "aaabbbba";
		 int arr[] = new int[256];
		 int arr1[] = new int[256];
		 int count =0, count1=0;
		 StringBuilder a=new StringBuilder();
		 StringBuilder b=new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i)]==0) {
				count++;
				arr[s.charAt(i)]=count;
				
			}
			a.append(arr[s.charAt(i)]);
		}
		
		for (int j = 0; j < t.length(); j++) {
			if(arr1[t.charAt(j)]==0) {
				count1++;
				arr1[t.charAt(j)]=count1;
				
			}
			b.append(arr1[t.charAt(j)]);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
		}

}
