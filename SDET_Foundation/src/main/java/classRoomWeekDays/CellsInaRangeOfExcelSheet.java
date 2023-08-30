package classRoomWeekDays;
import java.util.ArrayList;
import java.util.List;
public class CellsInaRangeOfExcelSheet {
	/*
	 * https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
	 * test data:
	 * 
	 *	Input: s = "K1:L2"
	 *	Output: ["K1","K2","L1","L2"]
	 *  Input: s = "A1:F1"
	 *	Output: ["A1","B1","C1","D1","E1","F1"]
	 *
	 *1)Given a String with row count and col count
	 *2)consider s(1) as start row and s(4) is the end row
	 *3)consider s(0) is start col and s(3) is th end col
	 *4)iterate through the row and col and add the cell value in a string list
	 *
	 */	public static void main(String[] args) {
		String s = "K1:L2";

		List<String> outList = new ArrayList<String>();
		
		for (int j = s.charAt(0); j <=s.charAt(3) ; j++) {
			for (int i = s.charAt(1); i <= s.charAt(4); i++) {
				String add = Character.toString(j)+Character.toString(i);
				outList.add(add);
			}
		}
		System.out.println(outList);

	}

}
