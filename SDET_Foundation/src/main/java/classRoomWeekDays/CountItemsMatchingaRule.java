package classRoomWeekDays;

import java.util.*;
public class CountItemsMatchingaRule {
	/*
	 * https://leetcode.com/problems/count-items-matching-a-rule/
	 * 
	 *1)Iterate through main list
	 *2)use if conditions using rule key and iterate through sublist
	 *3)if the rule value matches increase count+1
	 *3)return the count
	 */	public static void main(String[] args) {
		 // Declare and initialize a nested list
        List<List<String>> nestedList = new ArrayList<>();
        //String ruleKey, String ruleValue
        String ruleKey = "color", ruleValue ="silver";
        int count =0;
        // Create and add inner lists
        List<String> sublist1 = new ArrayList<>();
        sublist1.add("phone");
        sublist1.add("silver");
        sublist1.add("pixel");

        List<String> sublist2 = new ArrayList<>();
        sublist2.add("computer");
        sublist2.add("silver");
        sublist2.add("lenovo");

        List<String> sublist3 = new ArrayList<>();
        sublist3.add("phone");
        sublist3.add("silver");
        sublist3.add("iphone");
        nestedList.add(sublist1);
        nestedList.add(sublist2);
        nestedList.add(sublist3);
        
        System.out.println(nestedList);
        
        for(List<String> list:nestedList) {
        	if (ruleKey.equals("type")) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(0).equals(ruleValue)&&i==0) {
						count++;
						
					}
				}
				}
        	else if (ruleKey.equals("color")) {
        		for (int i = 0; i < list.size(); i++) {
					if (list.get(1).equals(ruleValue)&&i==1) {
						count++;
					}
				}
			}
        	else {
        		for (int i = 0; i < list.size(); i++) {
					if (list.get(2).equals(ruleValue)&&i==2) {
						count++;
						
					}
				}
			}
        	
        }
        System.out.println(count);
	}

}
