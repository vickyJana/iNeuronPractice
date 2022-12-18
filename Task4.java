package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task4 {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String loginPageURL = driver.getCurrentUrl();
		
		WebElement userName = driver.findElement(By.name("username"));

		WebElement passWord = driver.findElement(By.name("password"));
		
		userName.sendKeys("admin");
		
		passWord.sendKeys("admin123");
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[contains(@class,'login-button')]"));
		
		LoginButton.click();
		
		String dashBoardPageURL = driver.getCurrentUrl();
		
		boolean containsDB = dashBoardPageURL.contains("dashboard");
		
		System.out.println(containsDB);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector(".oxd-userdropdown-tab")).click();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		boolean loginPageURLVerfication = driver.getCurrentUrl().equalsIgnoreCase(loginPageURL);
		
		System.out.println(loginPageURLVerfication);
		

		driver.quit();
		
	}

}
