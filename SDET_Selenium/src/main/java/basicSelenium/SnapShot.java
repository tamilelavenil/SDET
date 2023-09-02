package basicSelenium;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.print.attribute.standard.JobHoldUntil;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.api.internal.Utils;

public class SnapShot {
	public static void main(String[] args) throws IOException {
		
	
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://login.salesforce.com/");
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf$1234");

	//driver.findElement(By.xpath("//input[@id='Login']")).click();
	
	
	//step-1
	File scr = driver.getScreenshotAs(OutputType.FILE);
	//step2
	
	File dst=new File("./snap/photo1.png");
	
	//step3
	FileUtils.copyFile(scr, dst);
	
	
	driver.close();
	
	
	
	
	
}
}