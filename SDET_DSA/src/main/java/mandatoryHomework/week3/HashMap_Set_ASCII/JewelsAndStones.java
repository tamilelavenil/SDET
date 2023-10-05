package mandatoryHomework.week3.HashMap_Set_ASCII;

import java.util.HashSet;

import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStones {

	   /*
    1)add jewels in a set
    2)iterate through the stones and check if the jewels contains the stone
    3)if it contains increase count +1
    4)return count finally
    */
	@Test
	public void Test1() {
		Assert.assertEquals(3, numJewelsInStones("aA","aAAbbbb"));
	}
	
    public int numJewelsInStones(String jewels, String stones) {
        
        Set<Character> set = new HashSet();
        
        for(char i: jewels.toCharArray()){
           // String a = Character.toString(i);
            set.add(i);
        }
      //  System.out.println(set);
        int right =0, count=0;
        while(right<stones.length()){
               //String b = Character.toString(stones.charAt(right));
            
            if(set.contains(stones.charAt(right))){
                count++;
            }
            right++;
        }
        System.out.println(count);
        return count;
        
        
    }

}
