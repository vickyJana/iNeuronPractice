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

		Username.sendKeys("Vigneshwari52");
		
		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("Vicky52@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys("Jana123456");

		driver.findElement(By.xpath("//label[text()='Testing']")).click();
		

		WebElement submitButton = driver.findElement(By.cssSelector(".submit-btn"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",submitButton);
		
		WebElement genderButton = driver.findElement(By.xpath("//input[@value='Female']"));
//		
//		WebElement submitButton = driver.findElement(By.cssSelector(".submit-btn"));
//		
//		JavascriptExecutor js1 =(JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].click",genderButton);
		genderButton.click();
		

		boolean enabled = driver.findElement(By.cssSelector(".submit-btn")).isEnabled();

		System.out.println("Is SignUp Button is Enabled:" + enabled);

		WebElement stateValue = driver.findElement(By.name("state"));

		Select s = new Select(stateValue);

		s.selectByVisibleText("Goa");

		boolean enabled1 = driver.findElement(By.cssSelector(".submit-btn")).isEnabled();

		System.out.println("Is SignUp Button is Enabled:" + enabled1);
		
		JavascriptExecutor js2 =(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click",submitButton);
	//	submitButton.click();
		Thread.sleep(5000);
		WebElement email1 = driver.findElement(By.id("email1"));

	
		WebElement password1 = driver.findElement(By.id("password1"));

		
		email1.sendKeys("Vicky52@gmail.com");
		password1.sendKeys("Jana123456");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signIn.click();
		
	}

}
