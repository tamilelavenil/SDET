package mandatoryHomework.week3.HashMap_Set_ASCII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DestinationCity {
	/*
	 * 
	 *
	 * https://leetcode.com/problems/destination-city/
	 * 
	 * 1)Add the sources forst in the set
	 * 2)add the destinatiosn in the same set again
	 * 3)now get the set and see
	 * 
	 */	public static void main(String[] args) {
		Set<String> source = new HashSet();
		Set<String> destination = new HashSet();
		List<List<String>> paths = Arrays.asList(Arrays.asList("pYyNGfBYbm","wxAscRuzOl"),Arrays.asList("kzwEQHfwce","pYyNGfBYbm"));
		String finaldest ="";
        for(List<String> so : paths){
            source.add(so.get(0));
        }
        for(List<String> dest : paths){
        	destination.add(dest.get(1));
       }
        List<String> list = new ArrayList(destination);
        for (int i = 0; i < list.size(); i++) {
			if (!source.contains(list.get(i))) {
				finaldest= list.get(i);
			}
		}
      System.out.println(source);
      System.out.println(destination);
      System.out.println(finaldest);

	}

}
