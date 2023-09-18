package foundation;

import java.util.Arrays;

public class RemoveTargetElement {

	public static void main(String[] args) {
		int[] a = {	2, 3, 3, 4, 5 };
		int  tar = 3;
		int count =0;
		int index =0;
		
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=tar) {
				count++;
			
			}
		}
		int[] b = new int[count];
		for (int j = 0; j < a.length; j++) {
			if (a[j]!=tar) {
				b[index]=a[j];
				index++;
			}
		}
	
		System.out.println(Arrays.toString(b));
	}

}
