package mandatoryHomework.week5.Stack_Queue;

import java.util.Stack;

public class BackSpaceStringCompare {
	 public boolean backspaceCompare(String s, String t) {
	        String s1 = check(s);
	        String s2= check(t);

	        return s1.equals(s2);
	    }
	    public String check(String a){
	        Stack<Character> stack = new Stack();
	        StringBuilder sb = new StringBuilder();
	        for(char i: a.toCharArray()){
	            switch (i) {
			    case '#':
				if(!stack.isEmpty()) stack.pop();
				break;

			    default:
	            stack.push(i);
				break;
			    }
	        }

	        while(!stack.isEmpty()){
	            sb.append(stack.pop());
	        }

	        return sb.toString();

	    }
}
