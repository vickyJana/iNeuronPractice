package assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Jana");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shachin");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("janashachin@gmail.com");
		
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Jana2324!");
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("janashachin@gmail.com");
		
		WebElement selectDay = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select day = new Select(selectDay);
		day.selectByValue("5");
		
		
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		
		Select selectMonth = new Select(month);
		
		selectMonth.selectByIndex(2);
		
		
		WebElement selectYear = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select year = new Select(selectYear);
		
		year.selectByVisibleText("2003");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		driver.quit();

	}

}
