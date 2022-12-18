package assignment8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement scrollText = driver.findElement(By.xpath("//span[text()=' Meta © 2022']"));
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",scrollText);
		
		
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		
		int size = findElements.size();
		System.out.println(size);
		
		for(WebElement e :findElements ) {
			System.out.println(e.getText());
			if(e.getText().contains("Create Page")) {
				e.click();
				break;
				//continue;
			}
		}
		driver.quit();
	}

}
