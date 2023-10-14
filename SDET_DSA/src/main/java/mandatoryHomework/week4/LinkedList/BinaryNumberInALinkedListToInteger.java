package mandatoryHomework.week4.LinkedList;

public class BinaryNumberInALinkedListToInteger {

	
	public int getDecimalValue(ListNode head) {
        StringBuilder build = new StringBuilder();

        while(head!=null){
            build.append(head.val);
            head = head.next;
        }

        return Integer.parseInt(build.toString(), 2);
}
}
