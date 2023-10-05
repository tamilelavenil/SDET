package mandatoryHomework.week3.HashMap_Set_ASCII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfConsistentStrings {

	@Test
	public void Test1() {
		Assert.assertEquals(2, countConsistentStrings("ab",new String[] {"ad","bd","aaab","baa","badab"}));
	}
	/*
    1)iterate through the allowed string and add it into a list
    2)iterate through the words array and check every word is consistent or not
    3)if consistent add output+1;
    4)check for the entire array and return output.
    */
    public int countConsistentStrings(String allowed, String[] words) {

        List<Character> list = new ArrayList();
        for (char j : allowed.toCharArray()) {
			list.add(j);
		}
       
        int output = 0;

        for(String word: words){
        	
            if(isConsistent(word,list)){
       
                output++;
            }
        }

        return output;
    }

    public boolean isConsistent(String word, List list){
        Set<Character> set = new HashSet();
        for(char c: word.toCharArray()) {
        	set.add(c);
        }
        for(Character i: set){
            if(!list.contains(i)){
                return false;

            }
        }

        return true;

    }

}
