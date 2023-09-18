package foundation;
import org.junit.Test;

import java.util.Iterator;

import org.junit.Assert;
public class DayofTheYear {

	
		/*
		* Get input as String and split into array based on "-"
		* convert the string array into int array
		* multiply the month into 30 keeping base as 30 every month
		* add 1 for every odd month like jan march(because 31 days for those months)
		* from the sum subtract the february days (eg:-1 if leap year or -2 if not a leap year)
		* return the result sum
		*/
	@Test
	public void Test1() {
		Assert.assertEquals(41,Year("2019-02-10"));
	}
	@Test
	public void Test2() {
		Assert.assertEquals(9,Year("2019-01-09"));
	}@Test
	public void Test3() {
		Assert.assertEquals(60,Year("2020-02-29"));
	}
	@Test
	public void Test5() {
		Assert.assertEquals(365,Year("2400-12-30"));
	}
	
		public int Year(String inp) {
			String[] arr = inp.split("-");
			int[] datearr = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				datearr[i] = Integer.parseInt(arr[i]);
			}
			int year = datearr[0], month = datearr[1], day = datearr[2];
			int days =0;
			for (int i = 1; i < month; i++) {
				if (month==1) {
					return day;
				}
				 
				
				 if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
					days +=31;
					System.out.println(i+" "+days);
				}
				 else if (i==2) {
						if (year%4==0 && year%400!=0 && year%100!=0||year % 4 == 0 && year % 400 == 0||year % 4 == 0 && year%100==0) {
							days+=29;
							System.out.println(days);
						}
						else {
							days+= 28;
							System.out.println(days);
						}
						
					}
				
				else {
					days +=30;
					System.out.println(i+" "+days);
					
				}
		
			}
			System.out.println(days+day);
			return days+day;
			
	

	}
}

//		int value = 30;
//		
//		if (month==1) {
//			return day;
//		}
//		else if (month==2) {
//			if (year % 4 == 0 || year % 400 == 0) {
//				value -= 1;// it is a leap year
//			}
//			else {
//				value -=2;
//			}
//		}
//		else {
//			value =31;
//		}
//		
//		
//		value -=day;
//		int count = month;
//		month *= 30;
//		for (int i = 1; i <= count; i += 2) {
//			month += 1;
//		}
//
//		if (year % 4 == 0 || year % 400 == 0) {
//			month -= 1;// it is a leap year
//		} else if (year % 100 == 0) {
//			month -= 2;// it is not leap year
//		} else {
//			month -= 2;// it is not a leap year
//		}
//
//		return(month-value);
//		
//	}

