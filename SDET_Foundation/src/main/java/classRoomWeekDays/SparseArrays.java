package classRoomWeekDays;

import java.util.Arrays;
import java.util.Iterator;

public class SparseArrays {
/*
 * https://www.hackerrank.com/challenges/sparse-arrays
 * input:
 * String[] stringList = {"ab","ab","abc"};
 * String[] queries = {"ab","abc","bc"};
 * 1)Iterate through both the arrays if the queries and stringlist matches add the count to output array
 * 2)return the int array
 */
	public static void main(String[] args) {
		  String[] stringList = {"ab","ab","abc"};
		  String[] queries = {"ab","abc","bc"};
		  
		 int[] output = new int[queries.length];
		 int count =0;
		 for (int i =0; i<queries.length;i++) {
			for (int j = 0; j < output.length; j++) {
				if (queries[i].equals(stringList[j])) {
					count++;
				}
			}
			output[i]=count;
			count =0;
		}
		 System.out.println(Arrays.toString(output));

	}

}
