import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2E {
	
public static void main(String[] args) throws InterruptedException  {
		
		
		


		System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		
		driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
		
		//calendar select ui-state-default ui-state-highlight
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click(); 
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByIndex(3);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
}	

}
