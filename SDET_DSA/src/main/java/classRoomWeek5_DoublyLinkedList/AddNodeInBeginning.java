package classRoomWeek5_DoublyLinkedList;

public class AddNodeInBeginning {

	public static void main(String[] args) {
		DoubleListNode l0 = new DoubleListNode(0);
		
		DoubleListNode l1 = new DoubleListNode(1);
		
		DoubleListNode l2 = new DoubleListNode(2);
		
		DoubleListNode l3 = new DoubleListNode(3);
		
		//linking nodes
		l1.next = l2;
		
		l2.prev = l1;
		
		l2.next = l3;
		
		l3.prev = l2;
		
		DoubleListNode ptr = l1;
	//Iterate through list until prev = null because i need to add node in the beginning	
//		while(ptr!=null) {
//			ptr = ptr.prev;
//		}
		
		l0.next = ptr;
		
		//l0.prev = null;
		
		DoubleListNode ptr1 = l0;
		
		while(ptr1!=null) {
			System.out.println(ptr1.val);
			
			ptr1 = ptr1.next;
		}

	}

}
