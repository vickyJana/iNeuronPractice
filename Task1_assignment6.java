package aasignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		Try to use contains , xpath axes, text functions
//
//		Write a minimum 3 XPath and 3 CSS Selector for the username 
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		//input[contains(@name,'username')]
		
		//input[contains(@placeholder,'Username')]
		
	//	CSS Selector
//		
//		input[name='username']
//				
//		
//		input[placeholder='Username']
//				
//				.oxd-input.oxd-input--active
		
		
		
		//Password :
			
		//input[contains(@placeholder,'Password')]
		
		//input[contains(@name,'password')]
		
		//input[contains(@type,'password')]
		
		//CSS Selector
		//    input[type='password']
		
		//    input[name='password']
		
		//Login button
		
		
		//button[contains(@class,'login')]
		
		//button[contains(@type,'submit')]
		
		//button[@type='submit']
		
		
		//CSS Selector 
		
	//	button[type='submit']
		
		
		
		

	}

}
