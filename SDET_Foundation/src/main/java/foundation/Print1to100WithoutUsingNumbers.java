package foundation;

import java.util.Arrays;
import java.util.Iterator;

public class Print1to100WithoutUsingNumbers {
	/*
	 * Get the char value of e that is 101, d -100, and null +1 
	 * while loop until 1 lesser than 101
	 * print 101 - 100, 101-99 etc...
	 */
	public static void main(String[] args) {

		 char ascii = 'e';
		char ascii1 = 'd';
		char ascii2 = '\0'+1;
		
		while(ascii2<ascii) {
			System.out.println(ascii-ascii1);
			ascii1--;
			ascii2++;
			
		}
//		while(ascii<ascii1) {
//			
//		System.out.println((ascii1-ascii));
//		ascii++;
//			
//		}
		
//		for (char i = ascii; i < ascii1; i++) {
//			int c = (int) i;
//			System.out.println(c);
//		}
	}

	
	}
