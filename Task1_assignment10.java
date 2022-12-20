package assignment10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email1")).sendKeys("Jana1234@gmail.com");
		
		driver.findElement(By.id("password1")).sendKeys("Jana123456!");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signIn.click();
		
		// while click practice button , iframe are open , Manage course options are not coming for further automation scripts
		
		
		//driver.quit();
	}

}
