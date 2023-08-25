package classRoomWeekDays;

public class CheckIfStringIsaAcronym {
	/*
	Input: words = ["alice","bob","charlie"], s = "abc"
	Output: true
	Input: words = ["an","apple"], s = "a"
	Output: false

	1)Given input is a String Array and a String
	2)Iterate through the Words of array
	3)Get the first character of the word and add it to string
	4)check if added string and given string matches
	5) return boolean value
	*/
	public static void main(String[] args) {
		String [] input = {"alice","bob","charlie"};
		//String [] input = {"an","apple"};	
		String acronym = "abc";
//		String add = "", add1="";
		boolean a = true;
		for(int i =0; i<input.length; i++){
			if(input[i].charAt(0)==acronym.charAt(i)) {
				a =true;
			}
			else {
				a = false;
			}
		}

		System.out.println(a);

	}

}
//add+= input[i];
//add1+=add.charAt(0);
//add="";