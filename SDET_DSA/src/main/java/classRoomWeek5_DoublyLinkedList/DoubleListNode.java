package classRoomWeek5_DoublyLinkedList;

public class DoubleListNode {

	int val;
	DoubleListNode prev;
	
	DoubleListNode next;
	
	DoubleListNode(int val) {
		this.val = val;
		
		prev = null;
		
		next = null;
	}
	
	DoubleListNode l1 = new DoubleListNode(1);
	
	DoubleListNode l2 = new DoubleListNode(2);
	
	DoubleListNode l3 = new DoubleListNode(3);
	
	DoubleListNode(){
		l1.next = l2;
		
		l2.prev = l1;
		
		l2.next = l3;
		
		l3.prev = l2;
	}
	
}


