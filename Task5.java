package assignment7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task5 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new EdgeDriver();
		
		WebDriver driver2 = new FirefoxDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

}
