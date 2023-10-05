package mandatoryHomework.week3.HashMap_Set_ASCII;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class SumOfUniqueElements {

	@Test
	public void Test1() {
		Assert.assertEquals(4,sumOfUnique(new int[] {1,2,3,2}));
	}

	/*
	 * https://leetcode.com/problems/sum-of-unique-elements/
	
	 *  1)iterate through the array and add numbers and count of numbers
        2)Now iterate through the map and sum only numbers with count 1
        3)return sum
	 */	
    public int sumOfUnique(int[] nums) {
        
        if(nums.length==1) return nums[0];

        Map<Integer,Integer> numMap = new HashMap();

        for(int num: nums){
            if(!numMap.containsKey(num)) numMap.put(num, 1);

            else numMap.put(num,numMap.get(num)+1);

            System.out.println(numMap);
        }

        int sum = 0;
        
        for(Map.Entry<Integer,Integer> entry: numMap.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }

        return sum;
    }
}
