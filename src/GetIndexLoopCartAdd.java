import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetIndexLoopCartAdd {
	
	public static void main(String[] args) throws InterruptedException  {
		
		
	
	
	System.setProperty("webdriver.gecko.driver", "/Users/Kamboyi/Desktop/drivers/geckodriver 2");

	//Firefox- FirefoxDriver ->methods
	//WebDriver close get
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	int j=0;
	
	String[] itemsNeeded = {"Cucumber","Brocoli", "Beetroot"};
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	
	List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
	
	for(int i=0;i<products.size();i++)
	{
		
		//Broccoli - 1 Kg
		
		String[] name = products.get(i).getText().split("-");
		
		// Where space is present e.g. Broccoli - 1 kg. the spaces between broccoli and dash need to be trimmed
		String trimmedName = name[0].trim();
		
		 // String[] arrOfVeg = name.split(" ", 2);
		
		//format list to remove extra text e.g 1 Kg from Banana - 1 Kg
		
		//check whether name you extracted is present in array
		//convert array list
		
		List itemsNeededList = Arrays.asList(itemsNeeded);
		
		// System.out.println(itemsNeededList);
		

		if(itemsNeededList.contains(trimmedName))
		{
			j++;
			//click on Add to cart
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			
			if(j==3)
				break;
		}
		
	}
	
	driver.findElement(By.cssSelector("div.container header:nth-child(1) div.container div.cart a.cart-icon:nth-child(5) > img:nth-child(1)")).click();

	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	
	driver.findElement(By.className("promoCode")).sendKeys("Promo50");
	
	driver.findElement(By.className("promoBtn")).click();
	
	System.out.println( driver.findElement(By.className("promoInfo")).getText() );
	
	}
	

}
