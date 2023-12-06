package xpathPractice;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class dataHandling {

	public static void main(String[] args) {
		String[][] data ;
	/*	
		XSSFWorkBook wb = new XSSFWorkbook("./src/data/"+data+".xlsx");
		
		XSSFSheet ws = wb.getSheetAt(0);
		
		int rowCount = ws.getLastRowNum();
		
		int cellCount = ws.getRow(1).getLastCellNum();
		
		data = new String[rowCount][cellCount];
		
		for(int i =1; i<rowCount; i++){
		
			for(int j=0; j<cellCount; j++){
			
			
				String s = ws.getRow(i).getCell(j).getStringCellValue();
				
				data[i-1][j] = s;
			}
		
		}
		
		
		
		*/
		String rings = "B0B6G0R6R0R6G9";
		 Map<Character,Set<Character>> map = new HashMap();

	        int left =0, right=1;

	        while(right<rings.length()){
	            char key = rings.charAt(right);
	            if(map.containsKey(key)){
	                //Set<Character> set = new HashSet();
	                map.get(key).add(rings.charAt(right));
	            }

	            else{
	                Set<Character> set = new HashSet();

	                set.add(rings.charAt(left));
	                
	                map.put(key,set); 
	            }
	     
	           // map.put(Character.getNumericValue(rings.charAt(right)),set);

	            left+=2;right+=2;
	            System.out.println(map);
	        }

	        System.out.println(map);

	}

}
