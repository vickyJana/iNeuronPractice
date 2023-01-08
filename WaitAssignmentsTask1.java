package assignment11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignmentsTask1 {

	public static void main(String[] args)  {
		WebDriver driver = new EdgeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		
		
		WebElement tryIT = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
		tryIT.click();
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Automation')]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		Boolean until = wait.until(ExpectedConditions.textToBePresentInElement(element, "WebDriver"));
		System.out.println(until);
		
		driver.quit();
		
		
		

	}

}
