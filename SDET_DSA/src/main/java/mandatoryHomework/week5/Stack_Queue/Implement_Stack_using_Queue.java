package mandatoryHomework.week5.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Implement_Stack_using_Queue {
	 public Deque<Integer> queue;

	    public void MyStack() {
	        queue = new ArrayDeque<Integer>();
	    }
	    
	    public void push(int x) {
	        queue.addFirst(x);
	    }
	    
	    public int pop() {
	       return queue.remove();
	    }
	    
	    public int top() {
	         return queue.peek();
	    }
	    
	    public boolean empty() {
	         return queue.isEmpty();
	    }
}
