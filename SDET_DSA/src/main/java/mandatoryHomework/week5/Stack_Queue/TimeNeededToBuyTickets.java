package mandatoryHomework.week5.Stack_Queue;

import java.util.ArrayList;
import java.util.List;

public class TimeNeededToBuyTickets {
	  public int timeRequiredToBuy(int[] tickets, int k) {
	        List<Integer> list = new ArrayList<Integer>();
	        if(tickets[k]==0) return 0;
	       // System.out.println(list);
	       for(int each: tickets){
	           list.add(each);
	       }
	       System.out.println(list);
	        int ptr = 0;
	        int ticket=0;

	       while(list.get(k)!=0){
	           for(int i = 0; i<list.size(); i++){
	               if(list.get(i)!=0) {
	               list.set(i, list.get(i)-1);
	               ticket++;
	               }
	               if(list.get(k)==0){
	                   return ticket;
	               }
	           } 

	           }
	           
	          return ticket; 
	       }
}
