package mandatoryHomework.week1.TwoPointer_SlidingWindow;

public class NumberOfArithmeticTriplets {
	/*
	 * https://leetcode.com/problems/number-of-arithmetic-triplets/description/
	 * 
	 * 1)Input: nums = [0,1,4,6,7,10], diff = 3
		Output: 2
		
		1)have two pointers left and right which will start from 0 and 1
		2)iterate through the array subtract right -left check if the diff is = diff if equal flag = true;
			so when flag is true increment right and subtract with left again check with diff
			if fails again increment right check we get diff == diff 
			if diff is > than actual diff left ++ right = left+1
			if diff is < than actual right ++
		3)else if not equal increment l++ r++
		
	 */	public static void main(String[] args) {
		int[] nums = {0,1,4,6,7,10};
		
		int diff = 3, l = 0, r =1, output=0;
		
		boolean flag = true;
		
		while(r<nums.length-1) {
			if (nums[r]-nums[l]<diff) {
				r++;
			}
			
			if (nums[r]-nums[l]>diff) {
				l++; r=l+1;
			}
			
			if (nums[r]-nums[l]==diff) {
				flag =false;
				
				while(flag!=true) {
						r++;
						if (r==nums.length) {
							break;
						}
						if (nums[r]-nums[l]==diff*2) {
							flag= true;
							output++;
							l++; r=l+1;
						}
						if (nums[r]-nums[l]>diff*2) {
							flag =true;
							l++; r = l+1;
						}
					}
				}
		    }
			
		
		System.out.println(output);

//		if (nums[r]-nums[l]==diff*2 && flag==true) {
//			flag = false;
//			output++;
//			l++;r=l+1;
//		}
//		if (nums[r]-nums[l]<diff&& flag==true) {
//			r++;
//		}
//		if (nums[r]-nums[l]>diff && flag==true) {
//			r++;
//		}
//		
//		if(nums[r]-nums[l]>diff&& flag==false) {
//			l++; r++;
//		}


	}

}
