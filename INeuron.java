package test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class INeuron {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.get("https://ineuron-courses.vercel.app/login");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector(".subLink")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='name']"));

		Username.sendKeys("Vigneshwari51");
		
		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("Vicky51@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys("Jana123456");

		driver.findElement(By.xpath("//label[text()='Testing']")).click();

		driver.findElement(By.xpath("//input[@value='Female']")).click();
		
		WebElement submitButton = driver.findElement(By.cssSelector(".submit-btn"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",submitButton);
		
		

		boolean enabled = driver.findElement(By.cssSelector(".submit-btn")).isEnabled();

		System.out.println("Is SignUp Button is Enabled:" + enabled);

		WebElement stateValue = driver.findElement(By.name("state"));

		Select s = new Select(stateValue);

		s.selectByVisibleText("Goa");

		boolean enabled1 = driver.findElement(By.cssSelector(".submit-btn")).isEnabled();

		System.out.println("Is SignUp Button is Enabled:" + enabled1);
		
		
		submitButton.click();
		Thread.sleep(5000);
		WebElement email1 = driver.findElement(By.id("email1"));

	
		WebElement password1 = driver.findElement(By.id("password1"));

		
		email1.sendKeys("Vicky51@gmail.com");
		password1.sendKeys("Jana123456");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signIn.click();
		
	}

}
