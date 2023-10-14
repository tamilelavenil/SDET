package classRoomWeek4_LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

	 public boolean hasCycle(ListNode head) {
	        Set<ListNode> set = new HashSet();

	        while(head!=null){
	            if(set.add(head)){
	                head = head.next;
	            }
	            else{
	                return true;
	            }

	           
	        }

	        return false;

	    }
}
