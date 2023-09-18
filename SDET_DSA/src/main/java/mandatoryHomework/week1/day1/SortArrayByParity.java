package mandatoryHomework.week1.day1;

import java.util.Arrays;

public class SortArrayByParity {
	/* https://leetcode.com/problems/sort-array-by-parity/description/
	 * Input: nums = [3,1,2,4] Output: [2,4,3,1]
	 * 1)iterate through the array have two pointer iterating through opposite direction
	 * 2)break loop when Left<right
	 * 3)if left is odd and right is even swap
	 * 4)if left even and right even increment left
	 * 5)if left is even and right is odd increment left decrement right
	 * 6)if left is odd and right is odd decrement right
	 */
	public static void main(String[] args) {
		int [] nums = {3,1,2,4};
		
		int left =0, right=nums.length-1;
		
		while(left<right) {
			if (nums[left]%2!=0 && nums[right]%2==0) {
				int temp = nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++; right--;
			}
			else if(nums[left]%2==0 && nums[right]%2==0) {
				left++;
				if (nums[left]%2!=0 && nums[right]%2==0) {
					int temp = nums[left];
					nums[left]=nums[right];
					nums[right]=temp;
					left++; right--;
				}

			}
			else if(nums[left]%2==0 && nums[right]%2!=0) {
				right--;
				if (nums[left]%2!=0 && nums[right]%2==0) {
					int temp = nums[left];
					nums[left]=nums[right];
					nums[right]=temp;
					left++; right--;
				}

			}
			else if(nums[left]%2!=0 && nums[right]%2!=0) {
				right--;
				if (nums[left]%2!=0 && nums[right]%2==0) {
					int temp = nums[left];
					nums[left]=nums[right];
					nums[right]=temp;
					left++; right--;
				}

			}
			//left++; right--;
		}
		
		System.out.println(Arrays.toString(nums));

	}

}
