package xpathPractice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class leafGround {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		

	}

}
