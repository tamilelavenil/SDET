package basicSelenium;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		
		driver.findElement(By.xpath("(//h5[text()=' Alert (Prompt Dialog)']/following::span)[2]")).click();
		
		
		//syntax driver control  pass to alert
		
		Alert alert = driver.switchTo().alert();
		//gettext
		String text = alert.getText();
		
		System.out.println(text);
		
		//sendkeys
		alert.sendKeys("TestLeaf");
		
		//accept
		
		alert.accept();
		
	}

}