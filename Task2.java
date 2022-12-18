package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement userName = driver.findElement(By.name("username"));

	//	WebElement passWord = driver.findElement(By.name("password"));
		
		userName.sendKeys("admin");
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[contains(@class,'login-button')]"));
		
		LoginButton.click();
		
		WebElement requiredMessageinPassword = driver.findElement(By.xpath("//span[contains(@class,'error-message')]"));
		boolean displayed = requiredMessageinPassword.isDisplayed();
		System.out.println("Required Message is displayed :"+ " "+displayed);
		
		driver.quit();
	}

}
