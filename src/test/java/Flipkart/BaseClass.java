package Flipkart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	static WebDriver driver;
 
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
  public static void TakeScreenShot(String Filename) throws IOException {
	  TakesScreenshot srcShot = ((TakesScreenshot)driver);
		File srcFiles = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Parvez\\myworkspace\\SeptMavenProject\\src\\test\\java\\Flipkart"+Filename+".png");
		FileUtils.copyFile(srcFiles,DestFile);
}

  @AfterSuite
  public void windowClose() {
	  
	  //driver.quit();
	  System.out.println("Task Performed");
  }

}
