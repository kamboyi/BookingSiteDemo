import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementDisabledOrEnabled {
	
public static void main(String[] args)  {
		
		
		


		System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
	
}

}
