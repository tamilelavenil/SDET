package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

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
		
		driver.findElement(By.xpath("(//p[contains(text(),'Sales')])[2]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Accounts')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'Name')]")).sendKeys("Tamil Elavenil");
		
		driver.findElement(By.xpath("//button[contains(@name,'SaveEdit')]")).click();
		//button[contains(@name,'SaveEdit')]
		
		
		//span[contains(text(),'Accounts')]
		
		
		
		
		
	}

}
