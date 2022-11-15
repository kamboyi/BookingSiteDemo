import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UpdatedDropdownLoop {

	
	
	
public WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		


		System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
	/*	int i=1;
		
		while(i<5) 
		{
		driver.findElement(By.id("hrefIncAdt")).click(); //runs 4 times
		i++;
		} 
		
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click(); 
			
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult"); */
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		
		driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
	}
}
