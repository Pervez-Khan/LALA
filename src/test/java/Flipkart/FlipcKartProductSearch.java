package Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlipcKartProductSearch extends BaseClass{
	  @Test(priority = 0)
	  public void popUpClose() {
		  
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		  System.out.println("PopUp Closed");
	  }
	  @Test(priority = 1)
	  public void productSearch() {
		
		  driver.findElement(By.className("_3704LK")).sendKeys("iPhone");
		  driver.findElement(By.className("L0Z3Pu")).click();
		  System.out.println("Product Search complete");
	  }
	  @Test(priority = 2)
	  public void productSpecification() throws InterruptedException {
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//div[contains(text(),'Internal Storage')]")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//div[contains(text(),'256 GB & Above')]")).click();
		  
	}
}
