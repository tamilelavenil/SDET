package mandatoryHomework.week4.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfLinkedList {

	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


	        Set<ListNode> set1= new HashSet();


	        while(headA!=null){
	            set1.add(headA);
	            headA=headA.next;
	        }

	        while(headB!=null){
	            if(set1.contains(headB)){
	                  return headB;
	            }
	            
	               headB = headB.next;
	            }

	        return null;
	    }
}
