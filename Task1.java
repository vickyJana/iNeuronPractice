package assignment12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helper.Utility;

public class Task1 {
	
	
//	@Parameters("Browser")
//	@BeforeTest
//	public void setup() {
//		
//		Utility.startBrowser("Browser", "https://ineuron-courses.vercel.app/login");
////		driver = new EdgeDriver();
////
////		driver.get("https://ineuron-courses.vercel.app/login");
////
////		driver.manage().window().maximize();
//	}
	@Parameters("Browser")
	@Test
	public void login(String Browser) {
		WebDriver driver = Utility.startBrowser("Browser", "https://ineuron-courses.vercel.app/login");
		driver.findElement(By.id("email1")).sendKeys("Jana1234@gmail.com");

		driver.findElement(By.id("password1")).sendKeys("Jana123456!");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign in']"));signIn.click();
		
	}
//	@AfterTest
//	public void closeSession() {
//	
//		driver.quit();
//	}
////		
//	
//	
//	@Test
//	public void TaskTest() {
//		//Utility.startBrowser("Browser", "https://ineuron-courses.vercel.app/login");
//		
//		driver.findElement(By.id("email1")).sendKeys("Jana1234@gmail.com");
//
//		driver.findElement(By.id("password1")).sendKeys("Jana123456!");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign in']"));signIn.click();
//		
//		driver.quit();
//	}
		
	
	// while click practice button , iframe are open , Manage course options are not
	// coming for further automation scripts

	// driver.quit();
}


