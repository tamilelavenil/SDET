package mandatoryHomework.week4.LinkedList;
import java.util.LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        //head as null, so returning null
        if(head==null) return null;
        //init
        ListNode tail =head;
        int size  = 1, counter = 0;
        //finding the size of the list and also finding the tail
        while(tail.next != null) {
            tail = tail.next;
            size++;
        }
        //find the optimum rotation required
        k %= size;

        //if no rotation required retuning head
        if(k==0) return head;

        ListNode temp =head;

        //iterating till the end-1 of list1
        while(counter < size-k-1){
            temp = temp.next;
            counter++;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        tail.next = head;

        return newHead;
    }
}