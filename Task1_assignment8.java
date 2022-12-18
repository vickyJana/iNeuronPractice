package assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement faceBookText = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String text = faceBookText.getText();
		
		boolean containsText = text.contains("Facebook helps you connect and share with the people in your life.");
		
		System.out.println(containsText);
		
		driver.quit();
		
		

	}

}
