package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanues {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("sessionkey");
       
        driver.get("http://google.co.in");
        
       File  src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
          FileUtils.copyFile(src,new File("C:\\Users\\Sudhakar\\screenshot.png"));
          
          
          
        
        
		
		
		
		
		
		

	}

}
