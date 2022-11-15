import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class exerciseOneEcommerce {
	
	
public static void main(String[] args)  {
		
		
		


		System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		
		
		//Name input
		
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input")).sendKeys("Kamboyi");
		
		//email input
		
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[2]/input")).sendKeys("Kamboyi@yahoo.com");

		// password input exampleInputPassword1
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("qwerty123");
		
		//Gender dropdown
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		
		//Select Female from Dropdown
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByIndex(1);
		
		//Checkbox select employed
		driver.findElement(By.id("inlineRadio2")).click();
		
		
		/* input date of birth
		String monthYearVal = driver.findElement(By.name("bday")).getText();
		
		String month = monthYearVal.split(" ") [0].trim();
		String year = monthYearVal.split(" ") [1].trim();
		
		while(!(month.equals("October") && year.equals("1987"))) {
			
		}
		
		*/
		
		
		  
		//Click submit button
		driver.findElement(By.cssSelector(".btn-success")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	
		

}
}


