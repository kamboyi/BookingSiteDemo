import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class BM_AM_ORANGEHRM {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
	
System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");
		
		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https:rahulshettyacademy.com/locatorspractice/");
		System.out.println("1.Open Firefox & Application");

	}
	@Test
	public void singIn() {
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		
		driver.findElement(By.name("inputPassword")).sendKeys("admin123");
		
		driver.findElement(By.className("submit")).click();
		
		System.out.println("2. Sign In");
	
		

	}
	/*
	@Test
	public void userSearch() {
		
		

	}
	
	@Test
	public void signOut() {
		WebElement linkWelcome = driver.findElement(By.id("welcome"));
		Highlighter.highlightElement(driver, linkWelcome);
		linkWelcome.click();
			
		WebElement linkLogout = driver.findElement(By.xpath("//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]"));
		Highlighter.highlightElement(driver, linkLogout);
		linkLogout.click();

		System.out.println("4. Sign Out");

	}
	*/
	@AfterClass
	public void tearDown() {
		
		System.out.println("5. Close Chrome & Application");
		driver.quit();	

	}
	

}
