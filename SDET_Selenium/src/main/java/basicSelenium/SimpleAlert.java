package basicSelenium;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/alert.xhtml");
		//simple alert
		
				driver.findElement(By.xpath("//span[text()='Show']")).click();

				//syntax -driver focus transfer to alert
				Alert alert = driver.switchTo().alert();
				
				String text = alert.getText();
				System.out.println(text);
				
				//action-performed
			    alert.accept();
	}

}