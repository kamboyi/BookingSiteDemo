package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	
	WebDriver driver = null;
	
	By SearchBarText = By.xpath("//input[@title='Search']");
	
	By ClickSearchButton = By.name("btnk");
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void SetTextInSearchBar (String text) {
		
		driver.findElement(SearchBarText).sendKeys(text);
		
	}
	public void ClickSearchButton() {
		
		driver.findElement(ClickSearchButton).sendKeys(Keys.RETURN);
	}

}
