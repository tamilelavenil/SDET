package seleniumMarathonSalesforce.individuals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Individuals_SalesForce {

	public static WebDriver driver;

	@BeforeMethod
	public void logIn() {
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
	}
	
	@AfterMethod
	public void logOut() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void createIndividuals() throws InterruptedException {

				//clicking the Individuals Link
		
				WebElement individuals = driver.findElement(By.xpath("//p[text()='Individuals']"));
				
				 JavascriptExecutor j = (JavascriptExecutor) driver;
			     j.executeScript("arguments[0].click();", individuals);
			     //clicking the Individuals tab
			     
			     driver.findElement(By.xpath("//a[contains(@title,'Individuals')]/following::*[name()='svg' and @data-key='chevrondown']")).click();
			     
			     //clicking the create new inviduals     
			     driver.findElement(By.xpath("//div[@title='New']")).click();			     
			     //send last name
			     driver.findElement(By.xpath("//input[contains(@class,'lastName')]")).sendKeys("Catherine");
			     //click on save button
			     driver.findElement(By.xpath("//button[@title='Save']")).click();
			     
			     //get the last name and Verify
			     Thread.sleep(5000);
			    String lastname =  driver.findElement(By.xpath("(//span[text()='Kumar'])[2]")).getText();
			    
			    	System.out.println(lastname.equals("Catherine"));
}
	@Test(priority = 2)
	public void editIndividuals() throws InterruptedException {
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

	@Test(priority = 3)
	public void deleteIndividuals() throws InterruptedException {
				// clicking the Individuals Link
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
		
			     //Select the dropdown Delete
			     WebElement dropdown = driver.findElement(By.xpath("//div[@data-aura-class='forceVirtualAction']/a"));
			     j.executeScript("arguments[0].click();", dropdown);
			     Thread.sleep(2000);
			     WebElement edit = driver.findElement(By.xpath("//a[@title='Delete']"));
			     j.executeScript("arguments[0].click();", edit);

			     // Select the delete button to delete
			     driver.findElement(By.xpath("//button[@title='Delete']")).click();
	}
	
	@Test(priority = 4)
	public void CreateIndividuals_Without_Mandatory_SalesForce() throws InterruptedException {

		 //clicking the Individuals Link
		
		 WebElement individuals = driver.findElement(By.xpath("//p[text()='Individuals']"));
		 JavascriptExecutor j = (JavascriptExecutor) driver;
	     j.executeScript("arguments[0].click();", individuals);
	     
	     //clicking the Individuals tab
	     driver.findElement(By.xpath("//a[contains(@title,'Individuals')]/following::*[name()='svg' and @data-key='chevrondown']")).click();
	     
	     //clicking the create new individuals
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
	
	@Test(priority = 5)
	public void VerifyIndividualsSortName() throws InterruptedException {
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
	}

}
