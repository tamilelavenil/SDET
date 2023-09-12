package mandatoryHomeWork;

public class NumberOfLinesToWriteString {
	/*
	 * https://leetcode.com/problems/number-of-lines-to-write-string/description/
	 * Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
		Output: [3,60]
		
		1)Iterate through the String given 
		2)width of charAt of 'i' = widths[charAt(i)-'a']
		3)if  lineWidth+widthOfi> 100 line count++ and make line width =0
		4)after add widthofi to lineofwidth
		5)return the number of lines count and width of last line
	 */
	public static void main(String[] args) {
		 String s = "bbbcccdddaaa";
			int[] widths = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
					10, 10, 10 };
			int lineWidth = 0;
			int lineCount = 1;
			int[] output = new int[2];
			for (char i : s.toCharArray()) {
				int widthOfi = widths[i - 'a'];
				if (lineWidth + widthOfi > 100) {
					lineCount++;
					lineWidth = 0;
				}
				lineWidth += widthOfi;

			}

			output[0] = lineCount;
			output[1] = lineWidth;

	}
}


