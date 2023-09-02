package seleniumAssignment;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day3 {
//	Day_3 Assignment:
//		"Test Steps for Create Campaign:
//		1. Login to https://login.salesforce.com
//		2. Click on toggle menu button from the left corner
//		3. Click view All and click Sales from App Launcher
//		4. Click on Campaigns tab 
//		5. Click on New button
//		6. Enter Campaign name as 'Bootcamp'
//		7. Choose Start date as Tomorrow
//		8. End date as Tomorrow+1
//		9. click Save and Verify the newly created Campaign"
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		
//		
//		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		// click on campaigns

			WebElement camp = driver.findElement(By.xpath("//p[text()='Campaigns']"));
		
		 JavascriptExecutor j = (JavascriptExecutor) driver;
		 
	     j.executeScript("arguments[0].click();", camp);
	     
//	     Click on New button
	     
	     driver.findElement(By.xpath("//div[text()='New']")).click();
	     
	     //send camp name using grandparent to grandchild xpath 
	     driver.findElement(By.xpath("//div[@data-target-selection-name='sfdc:RecordField.Campaign.Name']//input")).sendKeys("Bootcamp");
	     
	     //date function
	     
	     String formatDate = "MM/dd/YYYY";
	     
	     SimpleDateFormat formatter = new SimpleDateFormat(formatDate);
	     
	     Date date = new Date();
	     
	     String currentDate = formatter.format(date);
	     
	     driver.findElement(By.xpath("//div[contains(@class,'uiInputDate')]//input")).sendKeys(currentDate);
	     
	  // Add 1 day (24 hours) in milliseconds to the current date
	        long oneDayMillis = 24 * 60 * 60 * 1000;
	        
	        Date nextDay = new Date(date.getTime() + oneDayMillis);
	        
	        String nextDate = formatter.format(nextDay);
	        
	        driver.findElement(By.xpath(("(//div[contains(@class,'uiInputDate')]//input)[2]"))).sendKeys(nextDate);
	        
	        driver.findElement(By.xpath("//button[@title='Save']")).click();
	        
	        // validate green banner success message
	          
	       String message = driver.findElement(By.xpath("//div[contains(@class,'toastContent')]//span")).getText();
	       
	      System.out.println(message.equals("Campaign \"Bootcamp\" was created."));
	      
	     
	     
	     
	    
	     
	
	     
	     
	   
	     

	}

}
