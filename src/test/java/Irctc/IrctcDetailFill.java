package Irctc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IrctcDetailFill extends IrctcBaseclass {
	
	@Test(priority = 0)
	public void alertClose() {
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement xpath=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='fa fa-window-close pull-right loginCloseBtn ng-tns-c19-13']")));
		xpath.click();
	}
	
	@Test(priority = 1)
	public void IrctcDetails() throws InterruptedException {
		driver.findElement(By.xpath("(//input[contains(@role,'searchbox')])[1]")).sendKeys("Hwh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'HOWRAH JN - HWH')]")).click();
		driver.findElement(By.xpath("(//input[contains(@role,'searchbox')])[2]")).sendKeys("BKSC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'BOKARO STL CITY - BKSC')]")).click();
	}
	@Test(priority = 2)
	public void dateSetConcept() throws InterruptedException {
		
		String Month = "October2022";
		String Date = "15";
		
		driver.findElement(By.xpath
				("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		
		Thread.sleep(3000);
		while(true) {
			
			String text = driver.findElement(By.xpath("//div[@class= 'ui-datepicker-title ng-tns-c58-10']")).getText();
			System.out.println(text);
			
			if(text.equals(Month)) {
				System.out.println(text);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			}
			
		}
		driver.findElement(By.xpath
		("(//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted'])[15]")).click();
	}
	
	@Test(priority = 3)
	public void selection() throws IOException, InterruptedException{
		
		driver.findElement(By.xpath("//span[contains(text(),'All Classes')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'AC 2 Tier (2A)')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(5000);
		TakeScreenShot("TrainsAvailable");
		Thread.sleep(10000);
		
	}
}
