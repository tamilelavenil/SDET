package mandatoryHomework.week3.HashMap_Set_ASCII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Most_Common_Words {
	  /*
    1)remove all the periods from para and change to lowercase
    2)now split with spaces the para to array
    3)add banned in a set
    4)now add para in a map only if the word does not contain in banned
    5) now find the highest count of numberword and return the word
    */
    public String mostCommonWord(String paragraph, String[] banned) {
        //String para = paragraph.toLowerCase();

        //para = para.replaceAll("[!?',;.]","");

        String[] splitArr = paragraph.replaceAll("[!?';.,]","").toLowerCase().split("\\s+");

        Set<String> set = new HashSet();
        for(String i: banned){
            set.add(i);
        }

        Map<String,Integer> map = new HashMap();

        for(String j:splitArr){

            if(!set.contains(j)){
                if(!map.containsKey(j)){
                    map.put(j,1);
                }
                else{
                   map.put(j,map.get(j)+1);
                }
                
            }
        }

        System.out.println(map);
         String a = "";
         Integer b = 0;
        for(Map.Entry<String,Integer> each: map.entrySet()){
            if(each.getValue()>b){
                    a = each.getKey();
                    b = each.getValue();
            }
        }

         System.out.println(a+" "+b);
        return a;

    }
}
