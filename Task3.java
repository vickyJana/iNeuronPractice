package aasignment6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task3 {

	public static void main(String[] args) {
//		Write a script that should be able to add user > search user > delete the user.
//
//		Flow- Login > Admin> Add User> Search User > Delete User > Logout
//
//		Add an assertion after each section
//
//		https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//		Admin/admin123

		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Admin link
		driver.findElement(By.xpath("//a[contains(@href,'admin')]")).click();

		// Add Button

		driver.findElement(By.xpath("//button[contains(@class,'secondary') and @type='button']")).click();

		// User Role Field

		// driver.findElement(By.xpath("//div[@class='oxd-select-text
		// oxd-select-text--active']//div[text()='Admin']")).click();

		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
		// driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1)
		// > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) >
		// form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) >
		// div:nth-child(1) > div:nth-child(1)")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@role='listbox']//div[2]")).click();

		driver.findElement(By.cssSelector("input[placeholder*='Type']")).sendKeys("Jan");

		driver.findElement(By.xpath("//span[text()='Linda Jane Anderson']")).click();
		
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Enabled']")).click();
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.findElement(By.xpath("//div[@status='listbox']//div[2]"));
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Rajaa11233");
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Arjun@1234");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Arjun@1234");
		
		
		
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement saveButton = driver.findElement(By.xpath("//button[contains(@class,'space')]"));
		boolean enabled = saveButton.isEnabled();
		System.out.println(enabled);
		String OkBtn = saveButton.getText();
		System.out.println(OkBtn);
		//saveButton.getAttribute(OkBtn)
		
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",saveButton);
		saveButton.click();
		
//		
//		
//		JavascriptExecutor js1 =(JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].click",saveButton);
		

	}

}
