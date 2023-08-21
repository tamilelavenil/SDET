package classRoomWeekDays;

public class SubtarctTwoArrays {
	/*
    Given two array, arr1, and arr2
    Subtract the sum of arr2 with arr1 respective index value, and also the sum should exclude the respective index in arr2
     
     arr1 = {1,2,3,4} , arr2 = {2,3,4,5}
     
     output = {
     3+4+5-1,
     2+4+5-2,
     2+3+5-3,
     2+3+4-4     
     */
	public static void main(String[] args) {
	int[] arr1 = {1,2,3,4}, arr2 = {2,3,4,5};
	int sum = 0, sub=0;
	int [] out = new int[arr1.length];
	
	for (int i = 0; i < arr1.length; i++) {
	
		for (int j = 0; j < arr2.length; j++) {
			sum+= arr2[j];
			sub = sum - arr2[i];
			sub = sub - arr1[i];
		}
		System.out.println(sub);
	}

	}

}
