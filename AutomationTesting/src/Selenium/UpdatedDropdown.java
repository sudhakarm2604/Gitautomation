package Selenium;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		Assert.assertFalse(driver.findElement(By.cssSelector("[name*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("[name*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("[name*='friendsandfamily']")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("[name*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("[name*='friendsandfamily']")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(1000);
		int i = 1;
		for (i = 0; i < 5; i++) {

			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

		}

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}