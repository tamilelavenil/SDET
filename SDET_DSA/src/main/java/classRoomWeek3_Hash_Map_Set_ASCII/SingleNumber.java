package classRoomWeek3_Hash_Map_Set_ASCII;

import java.util.HashSet;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {2,1,2,3,3};
		
		HashSet<Integer> set = new HashSet();
       
		for (int i = 0; i < nums.length; i++) {
			if (!set.contains(nums[i])) {
				set.add(nums[i]);
			}
			else {
				set.remove(nums[i]);
			}
		}
		System.out.println(set.iterator().next());
	}

}
