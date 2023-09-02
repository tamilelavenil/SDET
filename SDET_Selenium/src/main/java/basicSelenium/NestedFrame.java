package basicSelenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/frame.xhtml");
		//1st frame
driver.switchTo().frame(2);

//2nd frame 

driver.switchTo().frame("frame2");

driver.findElement(By.xpath("//button[text()='Click Me']")).click();	

driver.switchTo().defaultContent();

driver.switchTo().frame(0);


driver.findElement(By.xpath("//button[text()='Click Me']")).click();	

	}

}