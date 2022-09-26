package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	WebDriver driver;
 
  @BeforeSuite
  public void flipkartLaunch() {
	  		System.out.println("Start Automation");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\Downloads\\chromedriver_win32 (2)//chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Aplication Launch");
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			System.out.println("Flipkart launched successfully");
		
  }

  @AfterSuite
  public void windowClose() {
	  
	  //driver.quit();
	  System.out.println("Task Performed");
  }

}
