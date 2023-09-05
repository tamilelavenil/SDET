package classRoomWeekDays;

public class CountBinarySubstrings {
	/*  https://leetcode.com/problems/count-binary-substrings/description/
		Input: s = "00110011"
		Output: 6
		There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
		Notice that some of these substrings repeat and are counted the number of times they occur.
		Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.

		1) Declare count as 0 to collect the count of pairs, convert string to char array, iterate through array.
		2) if 'i' and 'i+1' = 01 or 10 it makes a pair increase count
		3) if 'i' and 'i+1' = 0 or 1 continue count number of zeroes if 1 comes break the countzero
		4) if 'i' and 'i+1' = 1 or 0 continue count number of 1's break the countones 
		5) check both the count matches then form a pair and increase the count of pairs
		
		//new method
		 * 1) have prev count current count and pair count
		 * 2) Iterate through the pair
		 * 3) if i-1 == i increase the current count
		 * 4) once i-1!= i change the prev count = current count
		 * 5) when prev count >= current count increase pair count
		 * 6) return pair count
		*/

	public static void main(String[] args) {
		String s = "00110011"; //11001100
		int currCount =0,prevCount =0,pairCount =0;
		char[] binaryArr = s.toCharArray();
		
		for (int i = 1; i < binaryArr.length; i++) {
			if (binaryArr[i-1]==binaryArr[i]) {
				currCount+=1;
				if(prevCount>=currCount) {
					pairCount+=1;
				}
			}
			else if(binaryArr[i-1]!=binaryArr[i]) {
				prevCount=currCount;
				currCount=0;
				if(prevCount>=currCount) {
					pairCount+=1;
				}
			}
			
		}
		System.out.println(pairCount);
		
		
		
		
		
		
		
		
		
		
		
		
		//finding 01 and 10 pairs in the string
//		for(int i =0; i<binaryArr.length-1; i++){
//		if(binaryArr[i]=='0'&&binaryArr[i+1]=='1'){
//			count+=1;
//		}
//		else if(binaryArr[i]=='1'&&binaryArr[i+1]=='0'){
//			count+=1;
//		}
//		}
//		System.out.println(count);
//		
//		
//		
//		
		
		// finding 0011 pairs 00110011
//		int zero=0,ones=0;
//		for(int i =0; i<binaryArr.length-1; i++){
//			//int zero=0,ones=0;
//			if(binaryArr[i]=='0'&&binaryArr[i+1]=='0'){	
//					zero+=1;
//					
//			}
//			else if(binaryArr[i]=='1'&&binaryArr[i+1]=='1'){
//					ones+=1;		
//			}
//			
//		}
//		System.out.println(zero+" "+ones);
//		if (zero==ones) {
//			count=count+zero;
//		}
		
		
//		int zeros=0,one=0; //00110011
//		for (int j = 0; j < binaryArr.length-1; j++) {
//			if(binaryArr[j]=='1'&&binaryArr[j+1]=='1'){	
//				one+=1;
//				if(binaryArr[j]=='0'&&binaryArr[j+1]=='0'){
//					zeros+=1;		
//			}
//			}
////			else if(binaryArr[j]=='0'&&binaryArr[j+1]=='0'){
////					zeros+=1;		
////			}
//		}
		//System.out.println(zero+" "+ones);
		
	
		//System.out.println(count);
	}

}
