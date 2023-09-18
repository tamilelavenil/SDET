package foundation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		
		
		
		map.put("Iphone14Pro",85000);
		
		map.put("Iphone14ProMax",100000);
		
		map.put("Iphone14", 65000);

		
		//to get values of a map
		//System.out.println(map.get("Iphone14"));
		
		
		//override map value
//		map.put("Iphone14Pro",90000);
//		System.out.println(map.get("Iphone14Pro"));
		
		
		
		//for iterating over map using for each
		
		Set<Entry<String,Integer>> variable = map.entrySet();
		
		for (Entry<String, Integer> entry : variable) {
			
		//	System.out.println(entry);
			
		}
		
		
		
		 for(Map.Entry m : map.entrySet()){    
			   //System.out.println(m);
			 
//			  System.out.println(m.getKey());
//			 
//			 
//			 System.out.println(m.getValue());
//			 
			 
			// System.out.println(m.getKey()+" "+m.getValue());
			// m.get();  
			   } 
		 
		 // for getting only the key in loop
		 
		 //Use the keyset function and add value sto Set
		 
		 Set<String> keyset =  map.keySet();
		// System.out.println(keyset);
		 
		 for (String string : keyset) {
			//System.out.println(string);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 // for getting only the value in loop
		 
		 
		 Collection<Integer> values = map.values();
		 
		 for (Integer integer : values) {
			//System.out.println(integer);
		}
		 
		 // Validating a Particular Key 
		 
//		 System.out.println(map.containsKey("Iphone14"));
//		 
//		 System.out.println(map.containsKey("OnePlus"));
//		 
//		 //Validating a Particular Value
//		 
//		 System.out.println(map.containsValue(100000));
		 

		 for(Map.Entry a : map.entrySet()){    
			   int b = (Integer) a.getValue();
			   if(b>=60000&& b<=100000) {
				 System.out.println(a.getKey());  
			   }
			   } 
	}

}
