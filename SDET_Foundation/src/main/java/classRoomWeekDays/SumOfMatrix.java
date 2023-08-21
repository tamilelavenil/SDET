package classRoomWeekDays;

import java.util.Iterator;

public class SumOfMatrix {
/*
 Get a int two dimensional array as input
 Iterate over the array
 add the matrix elements in a variable and return sum
 */
	public static void main(String[] args) {
//		int[][] matrix = new int[3][3];
		
		int [] [] matrix = {{1,2,3},
				  			{4,5,6},
				  			{7,8,9}};
							
	
		int sum = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				sum+= matrix[row][col];
				//[0][0]
				//0 1
				//0 2
				//row 1 0
				//1 1
				//1 2
			}
		}

		System.out.println(sum);
		System.out.println(matrix.length);
	}
}
