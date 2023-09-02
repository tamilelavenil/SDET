package basicSelenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/table.xhtml;");
		String rowvalue = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]")).getText();
		System.out.println(rowvalue);
		//findElements-more one value
		//findelements- List<webelement>
		List<WebElement> allrow = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]"));
	int row = allrow.size();
	System.out.println(row);
	List<WebElement> allcol = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
	int column = allcol.size();
	System.out.println(column);
	//need all row n col value
	for (int i = 1; i < row; i++) {
		for (int j = 1; j < column; j++) {
			String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.println(text);
		}
	}
	}
}