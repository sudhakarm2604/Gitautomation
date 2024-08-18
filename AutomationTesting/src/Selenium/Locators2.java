package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String name = "Sudhakar";
		String password = "rahulshettyacademy";
		String website = "https://rahulshettyacademy.com/locatorspractice/";
		// String username = "inputUsername";
		// String password2 = "inputPassword";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(website);
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		driver.findElement(By.cssSelector("input[name='chkboxTwo']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
}
