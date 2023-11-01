package mandatoryHomework.week7;

public class LongPressedName {
	 public boolean isLongPressedName(String name, String typed) {
	      int left =0 , right =0;

	      while(right<typed.length()){
	          if(left<name.length() && name.charAt(left)==typed.charAt(right)){
	              left++;right++;
	          }
	          else if(left!=0 && name.charAt(left-1)==typed.charAt(right)){
	            
	                 right++;
	          }
	          else{
	                  return false;
	              }
	      }

	      return left==name.length();
	    }
}
