import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentAlertJavascript {

public static void main(String[] args) throws InterruptedException  {
		
		
		String text = "Sir Kamboyi Automation Novice";


		System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		
		//switch to alert
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		//in alert if you want to click Ok or Yes then use accept while negative or cancel is dismiss positive is accept negative is No
		
		
		driver.close();
		
}
	
}
