package classRoomWeekdays;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class HappyNumber {
	@Test
	public void Test1() {
		Assert.assertEquals(true, isHappy(19));
	}
	
	/*
    1) modulo the number and divide the number
    2) make squares of each number and sum it add it to a list
    3) repeat the same until we find digit 1 and return true
    4) if we find same sum in the list again twice then we form a pattern and return false
    */
    public boolean isHappy(int n) {
       Set<Integer> set = new HashSet();
     
        while(n!=1 && !set.contains(n)){
           
            set.add(n);
            n = squares(n);
            
        }

        return n==1;
    }

    public int squares(int num){
        int sum = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            sum += remainder * remainder;
            num = num/ 10;
        }
     
        return sum;
    }
}
