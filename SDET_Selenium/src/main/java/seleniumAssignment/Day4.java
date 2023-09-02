package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		//App Launcher
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
		//View all
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		//click search box
		driver.findElement(By.xpath("//one-app-launcher-search-bar[@class='searchBar']//input")).click();
		
		driver.findElement(By.xpath("//one-app-launcher-search-bar[@class='searchBar']//input")).sendKeys("Content");
		
		//click on content link
		
		driver.findElement(By.xpath("//div[@data-name='Content']//mark")).click();
		
		//click charter
		
		WebElement chatterTab = driver.findElement(By.xpath("//a[@title='Chatter']"));
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		 
	     j.executeScript("arguments[0].click();", chatterTab);
		
		//get title
		Thread.sleep(2000);
		String chat =driver.getTitle();		
		System.out.println(chat);
		System.out.println(chat.equals("Chatter Home | Salesforce"));
		
		//click question tab
		
		WebElement question = driver.findElement(By.xpath("//a[@title='Question']"));
		
		j.executeScript("arguments[0].click();", question);
		
		//input question
		
		driver.findElement(By.xpath("//div[contains(@class,'questiontitle')]//textarea")).sendKeys("What is your name");
		
		//details input
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-rich-text-editor__textarea slds-grid ql-container']")).sendKeys("Tamil Elavenil");
		
		//click ask button		

		driver.findElement(By.xpath("//button[contains(@class,'qe-questionPostDesktop')]")).click();
		
		
		
		
		
	}

}
