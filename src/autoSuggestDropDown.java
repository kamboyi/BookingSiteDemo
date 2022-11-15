import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class autoSuggestDropDown {

	
public static void main(String[] args)  {
		
		
		


System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind"); // send ind as keys
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); // Get string list of present items
		
		for(WebElement option: options) {
			
			if(option.getText().equalsIgnoreCase("Indonesia")) //if string is not india ignore, if option is equal to india click
			{
				option.click();
				break;
			}
			}
}


	
}
