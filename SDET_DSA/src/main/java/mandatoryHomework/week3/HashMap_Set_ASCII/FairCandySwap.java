package mandatoryHomework.week3.HashMap_Set_ASCII;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class FairCandySwap {

	@Test
	public void test1() {
		int[] out = {1,2};
		Assert.assertArrayEquals(out, fairCandySwap(new int[]{1,1},new int[]{2,2}));
	}
	 /*
    1)Iterate through the alice candies find sum
    2)Iterate through the bob candies find sum
    3)find avg of both the sum
    4)now iterate through the alice candies and subtract from avg
    5)check for the diff value in bobsize if it is available
    6)if available out[0] is alice val out[1] is bobval
    */
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int candy1=0;
        int[] out = new int[2];
        Set<Integer> set = new HashSet();
        for(int i: aliceSizes){
            candy1 +=i;
            set.add(i);
        }
        
       // System.out.println(candy1);
         int candy2=0;
          for(int j: bobSizes){
               
              candy2 +=j;
        }
        //System.out.println(candy2);
        int avg = (candy1 + candy2)/2;

        int adiff = avg-candy1;

         System.out.println(avg);
        for(int each: bobSizes){
            if(set.contains(each-adiff)){
                out[1]=each;
                out[0]=each-adiff;
                break;
            }

        }

        return out;

    }
}
