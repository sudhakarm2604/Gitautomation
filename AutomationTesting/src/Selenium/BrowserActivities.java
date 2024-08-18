package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");                      //google
		Thread.sleep(1000);                                       
		driver.navigate().to("https://rahulshettyacademy.com");//rahul
		Thread.sleep(1000);
		driver.navigate().back();                              //google
		Thread.sleep(1000);
		driver.navigate().forward();	                       //rahul
		
		
	}

}
