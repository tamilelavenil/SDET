package mandatoryHomeWork;

public class TruncateSentence {
	/*
	 * https://leetcode.com/problems/truncate-sentence/
	 * Input: s = "Hello how are you Contestant", k = 4
		Output: "Hello how are you"
		1) Split the string with respect to spaces
		2) remove the index with respect to integer 'k' input
		3) return the string after truncated
	 */	public static void main(String[] args) {
		String s = "Hello how are you Contestant";
		int k =4;
		String[] split = s.split(" ");
		StringBuilder truncate = new StringBuilder();
		
		for (int i = 0; i < k; i++) {
			if (i!=k-1) {
				truncate.append(split[i]+" ");
			}
			else {
				truncate.append(split[i]);
			}
			
			}
		System.out.println(truncate);
		}
		
	}
