package basicSelenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/waits.xhtml");

		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		WebElement visibil = driver.findElement(By.xpath("//span[text()='I am here']"));
		//synatx
		WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(10));
	wb.until(ExpectedConditions.visibilityOf(visibil));
	

	System.out.println("Done");
		
	}

}