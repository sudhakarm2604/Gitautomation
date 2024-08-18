package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation Testing\\Browser Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example")); // locate the webelement

		Select dropdown = new Select(staticDropdown); // create a new variable for dropdown using select methods
		dropdown.selectByIndex(3); // selected the dropdown using index
		System.out.println(dropdown.getFirstSelectedOption().getText()); // print the selected dropdown in console
		dropdown.selectByValue("option2"); // selected the dropdown by value
		System.out.println(dropdown.getFirstSelectedOption().getText()); // print the selected dropdown in console
		dropdown.selectByVisibleText("Option1"); // select the dropdown by visible text
		System.out.println(dropdown.getFirstSelectedOption().getText()); // print the selected dropdown in console

	}

}
