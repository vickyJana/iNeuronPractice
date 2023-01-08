package assignment11;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class WaitAssignmentsTask2 {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new EdgeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
		//File des = new File("./Mysc.png");
//		
//		
//		
//		
//		
//		
//		try {
//			FileHandler.copy(src, des);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		try {
//			FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./Mysc.png"));
//		} catch (IOException e) {
//			
//		System.out.println("Some thing went wrong"+e);
//		}
//		
		WebElement findElement = driver.findElement(By.xpath("//a[normalize-space()='Selenium Practise']"));
//		WebElement findElement1 = driver.findElement(By.xpath("//a[@class='profile-name-link g-profile']"));
//		WebElement findElement2 = driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]"));
		
		Utility.captureScreenshotOfWebElement(driver, findElement);
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Automation')]"));
		
		//Utility.waitForElement1(driver, element, null)
		
//		Thread.sleep(3000);
//		Utility.captureScreenshotOfWebElement(driver, findElement);
//		Thread.sleep(3000);
//		Utility.captureScreenshotOfWebElement(driver, findElement);
//		
		
		driver.quit();
		
		
		

	}

}
