package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/select.xhtml;");
		
		//ctrl+2->L-return type
		
		//return findelement is WebElement 
		WebElement dd = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		//select class
		
		Select obj=new Select(dd);
		
		//call objectname.methodname
	//	obj.selectByIndex(2);
		
		obj.selectByVisibleText("Puppeteer");
		
		
		//without select class how handle dropdown
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();
		
		//2000-2s
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='India']")).click();

	}

}