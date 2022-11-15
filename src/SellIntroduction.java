import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SellIntroduction {

	
	public WebDriver driver;
	
	
	public static void main(String[] args) {
		
		
		


		System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https:rahulshettyacademy.com/locatorspractice/");
		System.out.println("1.Open Firefox & Application");


		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");

		driver.findElement(By.name("inputPassword")).sendKeys("admin123");

		driver.findElement(By.className("submit")).click();

		System.out.println("2. Sign In");

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println("3. Forgot Password");
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Kamboyi");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Kamboyic@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("077777777771");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	}
	public void tearDown() {
		driver.quit();
	}

}
