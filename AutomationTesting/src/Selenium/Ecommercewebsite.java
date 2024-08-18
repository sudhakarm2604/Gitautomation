package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommercewebsite {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		String[] itemsNeeded = {"Cucumber", "Beetroot","Tomato","Beans"};	
		

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		addItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='promoInfo']")));
		System.out.println(driver.findElement(By.cssSelector("[class='promoInfo']")).getText());
		
	    driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	    
	    
	    
	    
	
		
		
		
		
		
		 
		
		}

	
	
	
	
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{


	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

	int i;
	int j = 0;
	for (i = 0; i < products.size(); i++) {

		String[] name = products.get(i).getText().split("-"); // split the product name by -;
		String formattedname = name[0].trim(); //

		List itemNeededList = Arrays.asList(itemsNeeded);

		
	

		if (itemNeededList.contains(formattedname)) {
			j++;

			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			if (j == 2) {
				break;
			}
		}
	}
	
	
	}
	
	
}








