package assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Jana");
		
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Shachin");
		
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("janashachin1@gmail.com");
		
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("Jana2324!");
		
		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("janashachin1@gmail.com");
		
		WebElement selectDay = driver.findElement(By.cssSelector("select[id='day']"));
		
		Select day = new Select(selectDay);
		day.selectByValue("5");
		
		
		
		WebElement month = driver.findElement(By.cssSelector("select[name='birthday_month']"));
		
		
		Select selectMonth = new Select(month);
		
		selectMonth.selectByIndex(2);
		
		
		WebElement selectYear = driver.findElement(By.cssSelector("select[title='Year']"));
		
		Select year = new Select(selectYear);
		
		year.selectByVisibleText("2003");
		
		driver.findElement(By.cssSelector("body > div:nth-child(25) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(3) > div:nth-child(7) > span:nth-child(2) > span:nth-child(2)")).click();
		
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		
		driver.quit();
		
		

	}

}
