package classRoomWeek5_DoublyLinkedList_Stack_Queue;

import java.util.Stack;

public class Valid_Parentheses {
	  public boolean isValid(String s) {

	        Stack<Character> stack = new Stack();

	        for(char each: s.toCharArray()){

	            switch(each){
	                case')':
	                    if(stack.isEmpty() || stack.pop()!='(') {
	                        return false;
	                        }
	                          break;
	                        
	                case'}':
	                     if(stack.isEmpty() || stack.pop()!='{') {
	                        return false;
	                    }
	                      break;
	                     
	                case']':
	                    if(stack.isEmpty() || stack.pop()!='[') {
	                        return false;
	                    }
	                     break;
	                     
	                default:{
	                    stack.push(each);
	                    //  break;
	                }
	            }

	        }

	        return stack.isEmpty();

	    }
}
