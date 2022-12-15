package assignment5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task3 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		String[] socialMediaIcons = { "linkedin", "facebook", "twitter", "youtube" };

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement copyRight = driver.findElement(By.cssSelector(".orangehrm-copyright-wrapper"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", copyRight);

		List<WebElement> findElements = driver.findElements(By.tagName("a"));

		int size = findElements.size();
		System.out.println(findElements.size());

		for (int i = 0; i < size; i++) {

			System.out.println(findElements.get(i).getAttribute("href"));

		}
//		for(int j=0;j<size;j++) {
//			LinkedList<String> attributevalue =new LinkedList<String>();
//			attributevalue.add(j, findElements.get(j).getAttribute("href"));
//			System.out.println(attributevalue);
//		}
		ArrayList<String> attributevalue1 = new ArrayList<String>();
		
		

		attributevalue1.add(0, findElements.get(0).getAttribute("href"));
		attributevalue1.add(1, findElements.get(1).getAttribute("href"));
		attributevalue1.add(2, findElements.get(2).getAttribute("href"));
		attributevalue1.add(3, findElements.get(3).getAttribute("href"));
		attributevalue1.add(4, findElements.get(4).getAttribute("href"));
		System.out.println(attributevalue1);
//		

//		for(WebElement links:findElements) {
//			
//			String socialMediaURl = links.getAttribute("href");
//			
//			System.out.println(socialMediaURl);
//			
//			if(socialMediaURl.contains("youtube")) {
//				
//				System.out.println(socialMediaURl);
//				break;
//			}

		HashMap<String[], ArrayList<String>> map = new HashMap<String[], ArrayList<String>>();
		ArrayList<String> merge = map.getOrDefault(socialMediaIcons, attributevalue1);
		//ArrayList<String> put = map.put(socialMediaIcons, attributevalue1);
		System.out.println(merge);
		
		
		
		
		
		
		driver.quit();

	}

}
