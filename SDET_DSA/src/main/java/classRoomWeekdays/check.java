package classRoomWeekdays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class check {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList(Arrays.asList(1,5,7)); //List<Integer> a = List.of(1, 2, 3);
		List<Integer> b = new ArrayList(Arrays.asList(0,1,2,3));
		List<Integer> list = new ArrayList();
        int left =0, right =0;
        int n = a.size();
       while(left<a.size() && right<b.size()){
    	   if (a.get(left)<=b.get(right)) {
    		   list.add(a.get(left));
    		   left++;
    	   }
    	   else if(b.get(right)<=a.get(left)) {
    		   list.add(b.get(right));
    		   right++;
    	   }
		}
       
       while(left<a.size()) {
    	   
    	   list.add(a.get(left));  
    	   left++;
       }
       while(right<b.size()) {
    	 
    	   list.add(b.get(right));  
    	   right++;
       }
       System.out.println(left+" "+right);
       System.out.println(list);
    	   
       }
   
        	//System.out.println(a);
     }

//        while(left<a.size()||right<b.size()){
//            if(a.get(left)<b.get(right)){
//                list.add(a.get(left));
//                System.out.println(list);
//                left++;
//            }
//             if(b.get(right)<a.get(left)){
//                list.add(b.get(right));
//                right++;
//                list.add(a.get(left));
//                left++;
//                System.out.println(list);
//            }
//             
//            if(a.get(left)==b.get(right)){
//                list.add(a.get(left));
//                list.add(b.get(right));
//                System.out.println(list);
//                left++;
//                right++;
//            }
//            
            
        //     if(b.get(right)>a.get(left)){
        //         list.add(a.get(left));
        //         a.remove(a.get(left));
        //     }
        //    if(a.get(left)>b.get(right)){
        //         list.add(b.get(right));
        //         b.remove(b.get(right));
        //     }
            
            // right++;
            // left++;
           
      //  }
        
        //System.out.println(list);

	//}


