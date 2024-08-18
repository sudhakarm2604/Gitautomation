package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;



public class SelIntroduction {



public static void main(String[] args) throws InterruptedException {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

        // ChromeOptions options = new ChromeOptions();

        // options.addArguments("--remote-allow-origins=*");

//System.setProperty("webdriver.chrome.driver", "C:\Automation Testing\Selenium Browser Webdrivers\\chromedriver.exe");

 //WebDriver driver = new ChromeDriver();



//Firefox

System.setProperty("webdriver.gecko.driver", "C:\\Automation Testing\\Selenium Browser Webdrivers\\geckodriver.exe");

WebDriver driver = new FirefoxDriver();

//Microsoft Edge

//System.setProperty("webdriver.edge.driver", "C:\\Automation Testing\\Selenium Browser Webdrivers\\msedgedriver.exe");

//WebDriver driver2 = new EdgeDriver();

driver.get("https://rahulshettyacademy.com");
driver.manage().window().maximize();
Thread.sleep(200);

System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

//driver2.close();

driver.quit();



}



}