package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemos {

	public static void main(String[] args) {

     	WebDriver driver = new ChromeDriver();
		
     	driver.get("https://www.flipkart.com/");
     	driver.manage().window().maximize();
     
     	Actions a = new Actions(driver);
     	
     	 WebElement move = driver.findElement(By.xpath("(//a[@class='_1TOQfO'])[1]"));
     	
        a.moveToElement(move).build().perform();
     	
       a.moveToElement(driver.findElement(By.xpath("//input[@type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("samsung").doubleClick().build().perform();
     	
		
		
	
		
		
		
		
	}

}