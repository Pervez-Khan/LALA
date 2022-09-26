package Flipkart;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class FlipkartProductOrder extends FlipcKartProductSearch {
  @Test(priority = 3)
  public void selectProduct() {
	  
	  driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 13 (Green, 512 GB)')]")).click();
	
  }
  @Test(priority = 4)
  public void switchWindow() {
	
	  Set<String> WindowHandle = driver.getWindowHandles();
	  
	  Iterator<String> it = WindowHandle.iterator();
	  
	  String parentwindow = it.next();
	  System.out.println("Parent Window id: "+parentwindow);
	  
	  String childwindow = it.next();
	  System.out.println("Child Window id: "+childwindow);
			
	  driver.switchTo().window(childwindow);
  }
  
  @Test(priority = 5)
  public void Add_to_Cart() throws InterruptedException, IOException {
	  
	  Thread.sleep(1000);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	  Thread.sleep(1000);
	  TakesScreenshot srcShot = ((TakesScreenshot)driver);
		File srcFiles = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Parvez\\myworkspace\\SeptMavenProject");
		FileUtils.copyFile(srcFiles,DestFile);
  }
}
