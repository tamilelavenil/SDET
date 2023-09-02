package basicSelenium;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/window.xhtml");
		
		
		//getwindowhandle
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//getwindowhandles
		
		//linkedhashset-insertion order
		//hashset-random order
		//tree set-Ascii order
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//convert set into list
		
		List<String> childwindow=new ArrayList<String>(windowHandles);
		
		for (int i = 0; i < childwindow.size(); i++) {
			
			String string = childwindow.get(i);
			System.out.println(string);
		}
		
		//driver focus to window

		driver.switchTo().window(childwindow.get(1));
		
		driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");
		

		//child closed
		driver.close();
		
		
		//get control of parent window -switch back again
		String title2 = driver.switchTo().window(childwindow.get(0)).getTitle();
		System.out.println(title2);
		

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> child2= new ArrayList<String>(windowHandles2);
		String title3 = driver.switchTo().window(child2.get(2)).getTitle();
		System.out.println(title3);
		driver.findElement(By.xpath("//li[@class='search-item']/input")).sendKeys("Testleaf");
	}

}