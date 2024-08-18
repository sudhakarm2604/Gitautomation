package Selenium;

import java.util.HashMap;

import java.util.Map;

import org.openqa.selenium.Proxy;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");		

		ChromeOptions options = new ChromeOptions();

         options.setAcceptInsecureCerts(true);
         
         WebDriver driver = new ChromeDriver(options);
         
         driver.get("https://expired.badssl.com/");
		
		
		
	}
}