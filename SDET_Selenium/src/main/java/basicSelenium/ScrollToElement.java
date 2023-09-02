package basicSelenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		WebElement scroll = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		Actions op= new Actions(driver);
		
		//scrollToElement-  selenium 4
		//javascript click
		op.scrollToElement(scroll).perform();
		
		Thread.sleep(1000);
		
		scroll.click();

	}

}