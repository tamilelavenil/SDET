package classRoomWeek4_LinkedList;

public class ListNode_Creation_PrintingEach {
	
			public int val;
			ListNode_Creation_PrintingEach next;
			
			public ListNode_Creation_PrintingEach(int x) {
				val =x;
			}
	
	public static void main(String[] args) {
			//l1 |val|next
	    // Create 3 nodes
	    ListNode_Creation_PrintingEach l1 = new ListNode_Creation_PrintingEach(4);
	    ListNode_Creation_PrintingEach l2 = new ListNode_Creation_PrintingEach(8); 
	    ListNode_Creation_PrintingEach l3 = new ListNode_Creation_PrintingEach(15);
	    System.out.println(l1.next);
	    // Link the nodes
	    l1.next = l2; //u0122345
	    l2.next = l3;
//	    System.out.println(l2.next);
//	    System.out.println(l3.next);
	    l3.next = null;
	    System.out.println(l3.next);

	    // Print values
	    ListNode_Creation_PrintingEach ptr = l1;
	    while(ptr != null) {
	      System.out.println(ptr.val);
	      ptr = ptr.next;
	    }
	  }

}
