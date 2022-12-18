package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[contains(@class,'login-button')]")).click();
		
		WebElement userNameRequiredEle = driver.findElement(By.xpath("(//span[contains(@class,'error-message')])[1]"));
		
		WebElement passwordRequiredEle = driver.findElement(By.xpath("(//span[contains(@class,'error-message')])[2]"));
		
		String userNameRequired = driver.findElement(By.xpath("(//span[contains(@class,'error-message')])[1]")).getText();
		
		String passwordRequired = driver.findElement(By.xpath("(//span[contains(@class,'error-message')])[2]")).getText();
		
		
		boolean contentEquals = userNameRequired.contentEquals(passwordRequired);
		System.out.println(contentEquals);
		
		
		WebElement userName = driver.findElement(By.name("username"));

		WebElement passWord = driver.findElement(By.name("password"));
		
		String cssValueUserName = userName.getCssValue("border");
		String cssValuePassWord = passWord.getCssValue("border");
//		
//		String borderWidthUserName = userNameRequiredEle.getAttribute("border");
//		
//		String borderWidthPassword = passwordRequiredEle.getAttribute("border");
		
		System.out.println(cssValueUserName);
		
		System.out.println(cssValuePassWord);
		
		boolean userNameContains = cssValueUserName.contains("1px");
		boolean passWordcontains = cssValuePassWord.contains("1px");
		
		System.out.println(userNameContains);
		System.out.println(passWordcontains);
		
		driver.quit();
	}

}
