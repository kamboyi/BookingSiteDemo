import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowsNavigate {
	
	
public WebDriver driver;
	
	
	public static void main(String[] args) {
		
		
		


		System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//How to navigate to a link/url and navigate back
		//this can be used to moved from homepage to login back although nagivate to doesnt wait for elements to load

		driver.get("https://google.co.uk");
		driver.navigate().to("https:rahulshettyacademy.com/locatorspractice/");
		driver.navigate().back();
	}

}
	
