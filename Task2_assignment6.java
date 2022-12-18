package aasignment6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();

		// Search Button

		// Xpath

		// input[@placeholder='Search']
		// input[contains(@placeholder,'Search')]

		// Css

		// input[placeholder='Search']

		// Admin button

		driver.findElement(By.xpath("//div[@class='oxd-sidepanel-body']//li[1]")).click();

		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder ='Search']"))
				.sendKeys("A");
		
		driver.findElement(By.xpath("//button[contains(@class,'secondary') and @type='button']")).click();

		// User role

		// div[@class='oxd-select-text oxd-select-text--active' and @xpath ='1']
	}

}
