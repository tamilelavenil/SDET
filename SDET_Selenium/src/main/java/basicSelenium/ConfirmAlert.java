package basicSelenium;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/alert.xhtml");
		
//confirm alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		String text3 = alert2.getText();
		System.out.println(text3);
		
		alert2.accept();
		//alert2.dismiss();
	}

}