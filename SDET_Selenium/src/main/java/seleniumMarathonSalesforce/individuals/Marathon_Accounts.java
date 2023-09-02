package seleniumMarathonSalesforce.individuals;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Marathon_Accounts {

	public static WebDriver driver;

	@BeforeMethod
	public void logIn() {
		ChromeOptions option = new ChromeOptions();

		option.addArguments("--disable-notifications");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://login.salesforce.com");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("arun09it@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Test@1234");

		driver.findElement(By.id("Login")).click();

		driver.findElement(By.className("slds-icon-waffle")).click();

		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@AfterMethod
	public void logOut() {
		driver.quit();
	}

	@Test(priority = 1)
	public void createAccounts() {

		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Accounts");

		driver.findElement(By.xpath("//mark[text()='Accounts']")).click();

		driver.findElement(By.xpath("//div[text()='New']")).click();

		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("DJ");

		driver.findElement(By.xpath("(//button[@data-value='--None--'])[3]")).click();

		driver.findElement(By.xpath("//span[@title='Public']")).click();

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		String element = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();

		System.out.println(element);

		String message = "created";

		if (element.contains(message)) {
			System.out.println("Account Created");
		} else {
			System.out.println("Account Not Created");
		}
	}

	@Test(priority = 2)
	public void editAccounts() throws InterruptedException {

		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Accounts");

		driver.findElement(By.xpath("//mark[text()='Accounts']")).click();

		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("DJ", Keys.ENTER);

		Thread.sleep(4000);

		WebElement dropdown = driver.findElement(By.xpath("//a[contains(@class,'rowActionsPlaceHolder')]"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", dropdown);

		driver.findElement(By.xpath("//a[@title='Edit']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@role='combobox'])[2]")).click();

		driver.findElement(By.xpath("//span[@title='Technology Partner']")).click();

		jse.executeScript("arguments[0].click();", driver
				.findElement(By.xpath("//label[normalize-space()='Industry']/parent::lightning-combobox/div//button")));

		jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@title='Healthcare']")));

		driver.findElement(By.xpath("//textarea[@name='street']")).sendKeys("Test Billing Street");

		driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys("Shipping Street");

		jse.executeScript("arguments[0].click();", driver
				.findElement(By.xpath("(//div[@class = 'slds-input__icon-group slds-input__icon-group_right'])[7]")));

		driver.findElement(By.xpath("//span[@title='Low']")).click();

		driver.findElement(
				By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[6]"))
				.click();

		driver.findElement(By.xpath("//span[@title='Silver']")).click();

		driver.findElement(
				By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[8]"))
				.click();

		driver.findElement(By.xpath("//span[@title='No']")).click();

		WebElement ele = driver.findElement(By.xpath("//input[@name='Phone']"));

		ele.sendKeys("9787567757");

		ele.clear();

		jse.executeScript("arguments[0].click();", driver.findElement(
				By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[7]")));

		driver.findElement(By.xpath("//span[@title='No']")).click();

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		String text = driver.findElement(By.xpath("//td[@role='gridcell'][4]")).getText();

		System.out.println("The phone number " + text + " has been saved successfully");

	}

	@Test(priority = 3)
	public void deleteAccounts() throws InterruptedException {

		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Accounts");

		driver.findElement(By.xpath("//mark[text()='Accounts']")).click();

		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("DJ", Keys.ENTER);

		Thread.sleep(2000);

		WebElement dropdown = driver.findElement(By.xpath("//a[contains(@class,'rowActionsPlaceHolder')]"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", dropdown);

		driver.findElement(By.xpath("//a[@title='Delete']")).click();

		driver.findElement(By.xpath("//span[text()='Delete']")).click();

		driver.findElement(By.xpath("//input[@class='slds-input']")).clear();

		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("DJ", Keys.ENTER);

		Thread.sleep(2000);

		String text = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();

		if (text.contains(text)) {
			System.out.println("Account is deleted");
		} else {
			System.out.println("Account is not Deleted");
		}

	}

	@Test(priority = 4)
	public void verifySorting() {

		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Accounts");

		driver.findElement(By.xpath("//mark[text()='Accounts']")).click();

		driver.findElement(By.xpath("//a[contains(@class,'toggle slds-th__action')]")).click();
		
		System.out.println("Account name is sorted successfully");
	}

	@Test(priority = 5)
	public void createServiceResource() {

		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Service Resources");

		driver.findElement(By.xpath("//mark[text()='Service Resources']")).click();

		WebElement dropdown = driver.findElement(By.xpath("//a[contains(@class,'rowActionsPlaceHolder')]"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", dropdown);

		driver.findElement(By.xpath("//a[@title='Edit']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"));

		ele.clear();

		ele.sendKeys("Bob");

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		String element = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();

		System.out.println(element);

		String message = "saved";

		if (element.contains(message)) {
			System.out.println("Updated Name is Saved");
		} else {
			System.out.println("Name is not saved");
		}
	}

}