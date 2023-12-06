package basicSelenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
			
			List<WebElement> row = table.findElements(By.tagName("tr"));
			
			for(WebElement each: row) {
				List<WebElement> col = each.findElements(By.tagName("td"));
				for(WebElement eachCol: col) {
					String name = eachCol.getText();
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			String row1Data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
//			
//			System.out.println(row1Data);
//			
//			String data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr")).getText();
//			
//			System.out.println(data);
//			
//			//count row sizex
//			
//			List<WebElement> rowdata = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[2]"));
//			
//			int rowsize = rowdata.size();
//			System.out.println("row size :"+rowsize);
//			
//			//count columnsize
//			
//			List<WebElement> columndata = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
//			
//			int columnsize = columndata.size();
//			System.out.println("column size :"+columnsize);
//
//			//print all set of data for-loop
//			
//			for (int i = 1; i <=rowsize; i++) {
//				
//				for (int j = 1; j <=columnsize; j++) {
//					
//					 String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
//					 
//					 System.out.println(text);
//				}
//				
//			
//		}
//	}
//			driver.get("https://www.leafground.com/table.xhtml");
//			
//			String row1Data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
//			
//			System.out.println(row1Data);
//			
//			String data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr")).getText();
//			
//			System.out.println(data);
//			
//			//count row sizex
//			
//			List<WebElement> rowdata = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[2]"));
//			
//			int rowsize = rowdata.size();
//			System.out.println("row size :"+rowsize);
//			
//			//count columnsize
//			
//			List<WebElement> columndata = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
//			
//			int columnsize = columndata.size();
//			System.out.println("column size :"+columnsize);
//
//			//print all set of data for-loop
//			
//			for (int i = 1; i <=rowsize; i++) {
//				
//				for (int j = 1; j <=columnsize; j++) {
//					
//					 String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
//					 
//					 System.out.println(text);
//				}
//				
//			
//		}
	}

}