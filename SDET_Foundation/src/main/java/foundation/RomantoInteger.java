package foundation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RomantoInteger {

	public static void main(String[] args) {
//		int i = 1, v = 5, x =10, l= 50, c=100, d=500, m=1000; 
//		
//		int iv =4, ix =9, xl=40, xc=90, cd =400, cm=900;
		Map<String, Integer> rom = new HashMap<String, Integer>();
		rom.put("I",1);
		rom.put("IX",9);
		rom.put("IV",4);
		String inp = "IV";
		
		char[] arr = inp.toCharArray();
		System.out.println(arr.length);
		int count =0;
		for (int i = 0; i <arr.length-1; i++) {
			if (arr[i]=='I'&& arr[i+1]!='X') {
				count+= rom.get("I");
			}
			if (arr[i]=='I'&& arr[i+1]!='V') {
				count+= rom.get("I");
			}
			
		}
	for (int j = 0; j < arr.length-1; j++) {
		if(arr[j]=='I'&& arr[j+1]=='X') {
			count+= rom.get("IX");
		}
		if(arr[j]=='I'&& arr[j+1]=='V') {
			count+= rom.get("IV");
		}
	}	
		
	
	System.out.println(count);	
		
		
		
		}
}

//if (arr[j]=='X'&& arr[j+1]=='C') {
//	count +=90;
//}
//if (arr[j]=='X'&& arr[j+1]=='L') {
//	count +=40;
//}
//if (arr[j]=='C'&& arr[j+1]=='D') {
//	count +=400;
//}
//if (arr[j]=='C'&& arr[j+1]=='M') {
//	count +=900;
//}
