package seleniumMarathonSalesforce.individuals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Assert;

public class TC005_VerifyIndividuals_SortName {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("tamilelavenil@cgi.com");
		
		driver.findElement(By.id("password")).sendKeys("Elav@6996");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		//clicking the Individuals Link
		
		WebElement individuals = driver.findElement(By.xpath("//p[text()='Individuals']"));
		
		 JavascriptExecutor j = (JavascriptExecutor) driver;
	     j.executeScript("arguments[0].click();", individuals);
	     //name web element
	     WebElement name = driver.findElement(By.xpath("//table[@data-aura-class='uiVirtualDataTable']//span[text()='Name']"));
	     //clicking the Name Button to sort the names
	     j.executeScript("arguments[0].click();", name);
	    //getting the name list in web table and storing in a list
	     Thread.sleep(5000);
	     List<WebElement> findElements = driver.findElements(By.xpath("//table[@data-aura-class='uiVirtualDataTable']/tbody/tr/th"));
	     List<String> list=new ArrayList<String>();
	     for (WebElement ele : findElements) {
				String text = ele.getText();
				list.add(text);
			}
	     List<String> sortedList = new ArrayList<String> (list);
	     Collections.sort(sortedList);
	     System.out.println(list +" "+sortedList);
	     
//	     Assert.assertEquals(list,sortedList);
	     
	     //driver.findElement(By.xpath("//a[contains(@title,'Individuals')]/following::*[name()='svg' and @data-key='chevrondown']")).click();
	}

}
