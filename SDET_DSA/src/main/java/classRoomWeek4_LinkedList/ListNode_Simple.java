package classRoomWeek4_LinkedList;

public class ListNode_Simple {
	
			public int val;
			ListNode_Simple next;
			
			public ListNode_Simple(int x) {
				val =x;
			}
	
	public static void main(String[] args) {

	    // Create 3 nodes
	    ListNode_Simple l1 = new ListNode_Simple(4);
	    ListNode_Simple l2 = new ListNode_Simple(8);
	    ListNode_Simple l3 = new ListNode_Simple(15);

	    // Link the nodes
	    l1.next = l2;
	    l2.next = l3;
	    l3.next = null;

	    // Print values
	    ListNode_Simple ptr = l1;
	    while(ptr != null) {
	      System.out.println(ptr.val);
	      ptr = ptr.next;
	    }
	  }

}
