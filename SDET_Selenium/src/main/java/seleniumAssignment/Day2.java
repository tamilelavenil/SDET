package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day2 {
//	Day_2 Assignment
//	=============
//	"Test Steps to Create New Dashboard:
//	1. Login to https://login.salesforce.com
//	Username :hari.radhakrishnan@qeagle.com
//	Password :Leaf$1234
//	2. Click on the toggle menu button from the left corner
//	3. Click View All and click Dashboards from App Launcher
//	4. Click on the New Dashboard option
//	5. Enter Name as 'Salesforce Automation by Your Name ' and Click on Create.
//	6.Click on Save.
	public static void main(String[] args) throws InterruptedException {
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
		
		

		WebElement element = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		
		 JavascriptExecutor j = (JavascriptExecutor) driver;
	     j.executeScript("arguments[0].click();", element);
	     
	     driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	     
	    Thread.sleep(5);
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Salesforce Automation by Tamil Elavenil");
		
		driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		
		

	}

}
