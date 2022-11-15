package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GoogleSearchPage;


public class GoogleSearchPageTest {
	
	
	static WebDriver driver= null;
	
	public static void main(String []args) {
		
		
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

		//Firefox- FirefoxDriver ->methods
		//WebDriver close get
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 // driver.get("https://google.co.uk/");
		
		GoogleSearchPage searchPageObj = new GoogleSearchPage(driver);
		
		driver.get("https://google.co.uk/");
		
		searchPageObj.SetTextInSearchBar("Automation Step By Step");
		
		searchPageObj.ClickSearchButton();
		
		driver.close();
	}

}
