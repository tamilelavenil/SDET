package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(opt);
		
		//window max
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//load URL
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf$1234");

		driver.findElement(By.xpath("//input[@id='Login']")).click();

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

}
