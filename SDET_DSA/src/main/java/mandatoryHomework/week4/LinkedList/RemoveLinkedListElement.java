package mandatoryHomework.week4.LinkedList;

public class RemoveLinkedListElement {
	/*
	 * Input: head = [1,2,6,3,4,5,6], val = 6 Output: [1,2,3,4,5]
	 * https://leetcode.com/problems/remove-linked-list-elements/
	 */
	
	public ListNode removeElements(ListNode head, int val) {
        
	       

        while(head!=null && head.val==val){

           head=head.next;
        }
        ListNode prevnode =null, currnode =head;
       while(currnode!=null){
           
           if(currnode.val==val){
               prevnode.next = currnode.next;
           }

            else{
                prevnode = currnode; }
               
            currnode= currnode.next;

           
       }

        return head;
      
    }

}
