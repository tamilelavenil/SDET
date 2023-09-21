package classRoomWeekdays;

import java.util.Arrays;
import java.util.List;

public class ReverseListWithoutInbuiltFunction {
	/* 1)Iterate through the list 
	 * 2)get left of list in temp
	 * 3)set left = right and right is equal to left
	 * 4)left++ right --;
	 * */
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		int l =0 , r =list.size()-1;		
		
		while(l<r) {
			int temp = list.get(l);
			list.set(l,list.get(r));
			list.set(r, temp);
			l++; r--;
		}
		
		System.out.println(list);

	}

}
