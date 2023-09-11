package JIRA_Selenium;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Assert;

public class Create_New_Story {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://api-training.atlassian.net/");
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com");
		
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		
		driver.findElement(By.id("password")).sendKeys("India@123");
		
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		
		driver.findElement(By.xpath("//p[text()='SDET-5']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		
		driver.findElement(By.xpath("//input[@id='summary-field']")).sendKeys("Automation Story Created By Tamil");
		
		driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Backlog']")).click();
		
		String title = driver.findElement(By.xpath("//span[contains(text(),'Automation Story Created By Tamil')]")).getText();
		
		System.out.println(title.equals("Automation Story Created By Tamil"));
		
		Assert.assertEquals("Automation Story Created By Tamil", driver.findElement(By.xpath("//span[contains(text(),'Automation Story Created By Tamil')]")).getText());
		
		
		driver.quit();
		
		
		
		
		
		
	}

}
