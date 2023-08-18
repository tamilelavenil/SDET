package redoPrograms;

public class NumberOfGoodPairs {
	/*
	Given an array of integers nums, return the number of good pairs.

	A pair (i, j) is called good if nums[i] == nums[j] and i < j.

	Test Data
	 
	Input: nums = [1,2,3,1,1,3] - Int array
	Output: 4 -Int

	1)Keep a var to count the number of good pairs
	2)iterate through array check if 'i' equals thei+1 in array 
	3)if matches the count plus 1
	4)return number of good pair

	*/
	public static void main(String[] args) {
		int [] nums = {1,2,3,1,1,3};
		int goodpair = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int k = i+1; k < nums.length; k++) {
				if (nums[i]==nums[k]) {
					goodpair++;
				}
			}
			
		}
		System.out.println(goodpair);
	}

}
