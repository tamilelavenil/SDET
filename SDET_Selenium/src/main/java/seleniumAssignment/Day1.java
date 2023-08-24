package seleniumAssignment;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day1 {
/*
 * 1. Login to https://login.salesforce.com
Username :hari.radhakrishnan@qeagle.com
Password :Leaf$1234
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Accounts tab 
5. Click on New button
6. Enter 'your name' as account name                                           
7. Click save
 */
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		
//		
//		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Accounts')]"));
		
		 JavascriptExecutor j = (JavascriptExecutor) driver;
	     j.executeScript("arguments[0].click();", element);
	     
	     driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'Name')]")).sendKeys("Tamil Elavenil");
		
		driver.findElement(By.xpath("//button[contains(@name,'SaveEdit')]")).click();

	}

}
