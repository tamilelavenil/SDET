package seleniumMarathonSalesforce.individuals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC004_CreateIndividuals_Without_Mandatory_SalesForce {

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
	     //clicking the Individuals tab
	     
	     driver.findElement(By.xpath("//a[contains(@title,'Individuals')]/following::*[name()='svg' and @data-key='chevrondown']")).click();
	     
	     //clicking the create new inviduals
	     
	   
	     WebElement newindividual = driver.findElement(By.xpath("//span[text()='New Individual']"));
	     Thread.sleep(5000);
	     j.executeScript("arguments[0].click();", newindividual);
	     
	     //selecting salutation
	     
	     driver.findElement(By.xpath("//span[text()='Salutation']/../..//a")).click();
	     
	     driver.findElement(By.xpath("//a[@title='Mr.']")).click();
	     
	     //sending firstname
	     
	     driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys("Ganesh");
	   
	     //click on save button
	     driver.findElement(By.xpath("//button[@title='Save']")).click();
	     
	     //Validate error message
	     Thread.sleep(5000);
	    String error =  driver.findElement(By.xpath("//ul[@class='errorsList']/li[text()='These required fields must be completed: Last Name']")).getText();
	    
	    System.out.println(error.equals("These required fields must be completed: Last Name"));
	     
	   
			
	}
	

}
