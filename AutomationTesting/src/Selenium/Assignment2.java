package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver", "C:\\Automation
		// Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		String username = "rahulshettyacademy";
		String password = "learning";
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement staticdropdown = driver.findElement(By.cssSelector("select.form-control"));

		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		String[] productNeededList = { "iphone", "Samsung", "Nokia", "Blackberry" };

		addtocart(driver, productNeededList);
		
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	public static void addtocart(WebDriver driver, String[] productNeededList) {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title")));

		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));

		int i;
		int j = 0;

		for (i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split(" ");

			String formattedname = name[0].trim();

			List itemswantstobuy = Arrays.asList(productNeededList);

		

			if (itemswantstobuy.contains(formattedname))

			{
				j++;
				driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();

				if (j == 3) {

					{
						break;
					}

				}

			}

		}

	}

}
