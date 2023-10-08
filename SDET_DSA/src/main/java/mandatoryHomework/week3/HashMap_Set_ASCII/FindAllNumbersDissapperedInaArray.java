package mandatoryHomework.week3.HashMap_Set_ASCII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDissapperedInaArray {
 /*https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    
    1) find the length of the array 
    2) add the values of the array in set
    3) iterate till length and check if digit is not present add to output list
    4) return list
    */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int len = nums.length;

        Set<Integer> set = new HashSet();

        List<Integer> list = new ArrayList();
        for(int a: nums){
            set.add(a);
        }

        for(int i=1; i<=len; i++){

            if(!set.contains(i)){
                list.add(i);
            }
        }

        return list;


    }

}
