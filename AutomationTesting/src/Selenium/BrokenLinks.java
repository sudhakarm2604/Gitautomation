package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   
		String url =   driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		   
		      HttpURLConnection conn = (HttpURLConnection) new URL	(url).openConnection();
		        conn.setRequestMethod("HEAD");
		        conn.connect();
		  int rescode = conn.getResponseCode();
		  System.out.println(rescode);
		  		       
	}	
		
}
