package classRoomWeek3_Hash_Map_Set_ASCII;

import java.util.HashMap;

public class Sum_Of_Indices_Using_Map {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap();
		
		int[] nums = {2,7,11,15};
		
		int target = 9;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (map.containsKey(target-nums[i])) {
				System.out.println(map.get(target-nums[i])+" "+i);
			}
			
			else {
				map.put(nums[i],i);
			}
			
		}
		System.out.println(map);

	}

}
