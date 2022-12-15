package assignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		boolean endsWithLogin = currentUrl.endsWith("login");
		
		System.out.println(currentUrl);
		
		System.out.println("Is Current URL ends with login :" +" "+ endsWithLogin);
		
		boolean containsDemo = currentUrl.contains("demo");
		
		System.out.println("Is Current URL contains demo :" + " "+ containsDemo );
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		System.out.println("Is Title contains HRM :"+" "+title.contains("HRM"));
		
		driver.quit();

	}

}
