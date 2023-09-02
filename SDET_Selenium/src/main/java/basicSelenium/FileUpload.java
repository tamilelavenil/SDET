package basicSelenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		//input tag
		//type=file
	
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		 String property = System.getProperty("user.dir");
		 
		 System.out.println(property);

			  driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
			  //Absolute path of the file
		  driver.findElement(By.id("resumeUpload")).sendKeys(""+property+"\\snap\\Rahul-cv.pdf"); // absolute path
			 
	 
				 
			  
			  
			  
		
	}

}