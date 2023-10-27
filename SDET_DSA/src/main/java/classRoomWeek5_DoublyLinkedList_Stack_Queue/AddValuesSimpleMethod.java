package classRoomWeek5_DoublyLinkedList_Stack_Queue;

public class AddValuesSimpleMethod {

	public static void main(String[] args) {
		DoubleListNode l1 = new DoubleListNode(1);
		
		DoubleListNode l2 = new DoubleListNode(2);
		
		DoubleListNode l3 = new DoubleListNode(3);
		
		//linking nodes
		l1.next = l2;
		
		l2.prev = l1;
		
		l2.next = l3;
		
		l3.prev = l2;
		
		DoubleListNode temp = l1;
		
		while(temp!=null) {
			System.out.println(temp.val);
			
			temp = temp.next;
		}
		
		DoubleListNode temp1 = l3;
		
		while(temp1!=null) {
			System.out.println(temp1.val);
			
			temp1 = temp1.prev;
		}
		
		
	}
	
	
}
