package mandatoryHomework.week4.LinkedList;

public class MiddleOfLinkedList {
	/*
    1)Iterate through the head by creating a copy and go until.next==null
    2)have a pointer count to find the size
    3)if count is odd then size/2 +1 else even size/2
    4)now iterate till the middle point and return the rest of list
    */
    public ListNode middleNode(ListNode head) {
        
        ListNode ptr = head;
        ListNode mid = head;
        int size =0;
        while(ptr!=null){
            ptr =ptr.next;
            size++;
        }

        int middle = size/2;

        for(int i=1; i<=middle; i++){
            mid = mid.next;
        }

        return mid;
    }

}
