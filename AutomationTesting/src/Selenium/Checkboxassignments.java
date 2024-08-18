package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxassignments {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("[name='checkBoxOption1']")).click();		
		Assert.assertTrue(driver.findElement(By.cssSelector("[name='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("[name='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("[name='checkBoxOption1']")).click();		
		System.out.println(driver.findElement(By.cssSelector("[name='checkBoxOption1']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("[name='checkBoxOption1']")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("[type='text']")).size());
		
		
		
	}

}
