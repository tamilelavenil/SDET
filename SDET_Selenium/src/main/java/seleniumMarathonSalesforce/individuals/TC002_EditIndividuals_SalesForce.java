package seleniumMarathonSalesforce.individuals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC002_EditIndividuals_SalesForce {

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
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[contains(@title,'Individuals')]/following::*[name()='svg' and @data-key='chevrondown']")).click();
	     
	     //Searching for Individuals
	     
	   
	     driver.findElement(By.xpath("//input[@name='Individual-search-input']")).sendKeys("Kumar");
	     
	     //Hit Enter to search the name
	     
	     driver.findElement(By.xpath("//input[@name='Individual-search-input']")).sendKeys(Keys.ENTER);
	     Thread.sleep(2000);
	     //Select the dropdown edit
	      
	     
	     WebElement dropdown = driver.findElement(By.xpath("//div[@data-aura-class='forceVirtualAction']/a"));
	     
	     j.executeScript("arguments[0].click();", dropdown);
	     
	     Thread.sleep(2000);
	     
	     WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']"));
	     
	     j.executeScript("arguments[0].click();", edit);
	     
	     
	     //selecting salutation
	     
	     driver.findElement(By.xpath("//span[text()='Salutation']/../..//a")).click();
	     
	     driver.findElement(By.xpath("//a[@title='Mr.']")).click();
	     
	     //sending firstname
	     
	     driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys("Ganesh");
	     
	     
	     //click on save
	     
	     driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	     
	     //validate the first name
	     
	     
	     String firstname = driver.findElement(By.xpath("//a[contains(@title,'Ganesh')]")).getText();
	     
	     
	     System.out.println(firstname.contains("Ganesh"));
	     
	}

}
