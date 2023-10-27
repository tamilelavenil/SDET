package classRoomWeek6;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {6,2,1,5,3,4};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++){
				int temp = 0;
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
