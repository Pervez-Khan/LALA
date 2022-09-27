package Irctc;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class IrctcBaseclass {
	
	static WebDriver driver;
	
	@BeforeSuite
	public void IrctcLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\Downloads\\chromedriver_win32 (2)//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Google Launch");
		driver.get("https://www.google.co.in/");
		System.out.println("Navigate to Irctc");
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Navigation Sucsseful");
	}
	public void WaitTimeExplicit(int timevar,By xpath) {
		WebDriverWait wait = new WebDriverWait(driver,timevar);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).click();
	} 
	
	 public static void TakeScreenShot(String Filename) throws IOException {
		  TakesScreenshot srcShot = ((TakesScreenshot)driver);
			File srcFiles = srcShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("C:\\Parvez\\myworkspace\\AugPractice\\src\\test\\java\\Irctc"+Filename+".png");
			FileUtils.copyFile(srcFiles,DestFile);
	}

	
	@AfterSuite
	public void taskPerformed() {
		//driver.close();
		System.out.println("Search Complete");
	}

}
