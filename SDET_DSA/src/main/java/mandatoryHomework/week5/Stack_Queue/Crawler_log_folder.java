package mandatoryHomework.week5.Stack_Queue;

import java.util.Stack;

public class Crawler_log_folder {
	/*
	 * https://leetcode.com/problems/crawler-log-folder/submissions/
	 */	public int minOperations(String[] logs) {
        Stack<String> stack = new Stack();
        StringBuilder build = new StringBuilder();
        //stack.push("0");
        for(String operation: logs){
            switch(operation){

                case"./":continue;

                case"../":
                    if(!stack.isEmpty()) {
					stack.pop();
                    }	
				    break;
                default:{
                    stack.push(operation);
                }
            
            }
        }
       
        return stack.size();
    }
}
