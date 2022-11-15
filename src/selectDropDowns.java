import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDowns {
	
	
public WebDriver driver;
	
	
	public static void main(String[] args) {
		
		
		


		System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Select Dropdown options using index - Dropdown needs to have Select Tag to use Select
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByIndex(3);
		
		
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		dropDown.selectByVisibleText("AED");
		
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		dropDown.selectByValue("INR");
		
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
	}

}
