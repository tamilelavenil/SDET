package basicSelenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnChromeOptions {

	public static void main(String[] args) {
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//opt.addArguments("--headless");
		
	//	opt.setBrowserVersion("115");
		
		opt.addArguments("--start-maximized");
		
		ChromeDriver driver=new ChromeDriver(opt);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf$1234");

		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		System.out.println("Login completed");

	}
}