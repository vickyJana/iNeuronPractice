package assignment5;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement companyBranding = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		
		boolean brandImageisDisplayed = companyBranding.isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement companyLogo = driver.findElement(By.xpath("//img[@alt='orangehrm-logo']"));
		
		boolean companyLogoisDisplayed = companyLogo.isDisplayed();
		
		System.out.println("Is Brand Image is Displayed :"+ " "+ brandImageisDisplayed);
		System.out.println("Is Company Logo is Displayed :"+ " "+companyLogoisDisplayed);
		driver.quit();

	}

}
