package mandatoryHomework.week5.Stack_Queue;

import java.util.Stack;

public class Baseball_Game {
	 public int calPoints(String[] operations) {
	        int sum = 0;
	        Stack<String> stack = new Stack();

	        for(String each: operations){
	          switch(each) {
				case "C" :
					if(!stack.isEmpty()) {
						stack.pop();
					}
					break;
				case "D" :
					if(!stack.isEmpty()) {
						String peek = stack.peek();
						int conv = Integer.parseInt(peek);
						int doubleVal = conv*2 ;
						stack.push(Integer.toString(doubleVal));
					}
					break;
				case "+" :
					if(!stack.isEmpty() && stack.size()>=2) {
						String a=stack.pop();
						String b=stack.pop();
				        int add =Integer.parseInt(a)+Integer.parseInt(b);
				        stack.push(b);
					       stack.push(a);
				       stack.push(Integer.toString(add));
				      
					}
					break;
				default:
					stack.push(each);
					
				}
				
			}
			for (String num : stack) {
				sum=sum+Integer.parseInt(num);
	         }
			
			return sum;
	    }
}
