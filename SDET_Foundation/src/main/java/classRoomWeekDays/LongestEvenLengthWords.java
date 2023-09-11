package classRoomWeekDays;

public class LongestEvenLengthWords {
	/*
	 * Question 2 Consider a string, sentence, of words separated by spaces where
	 * each word is a substring consisting of English alphabetic letters only. Find
	 * the first word in the sentence that has a length which is both an even number
	 * and greater than or equal to the length of any other word of even length in
	 * the sentence. If there are multiple words meeting the criteria, return the
	 * one which occurs first in the sentence. Example sentence =
	 * "Time to write great code"
	 * 
	 * The lengths of the words are 4, 2, 5, 5, 4, in order. The longest even length
	 * words are Time and code. The one that occurs first is Time, the answer to
	 * return
	 */
	public static void main(String[] args) {
		String sentence = "Time to write great code";
		
		int indexEvenLen =0, maxEvenLength = 0;
		
		String[] sentArray = sentence.split(" ");
		
		for (int i = 0; i<sentArray.length; i++) {
			if (sentArray[i].length()%2==0 && sentArray[i].length()>maxEvenLength) {
				maxEvenLength = sentArray[i].length();
				indexEvenLen = i;
				
			}
		}
		
		System.out.println(sentArray[indexEvenLen]);
		
		

	}

}
