package helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

public class Utility {
	
	WebDriver driver;

	public static void captureScreenshotOfWebElement(WebDriver driver, WebElement Ele) {

		try {
			
//			WebElement Ele = driver.findElement(By.xpath(""));

			FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
					new File("./screenshots/Screenshot_"+getCurrentTime()+".png"));

		} catch (IOException e) {
			System.out.println("Something Went Wrong" + e.getMessage());

		}

	}
	
//	method should except locator and timeout in seconds
//	will wait until element is not enabled
//	add sleep of 1 second
//	handle all exception while retrying

	   public static WebElement waitForElement(WebDriver driver, By locator, int timeout) {
	        WebElement element = null;
	        for (int i = 0; i < timeout; i++) {
	            try {
	                element = driver.findElement(locator);
	                if (element.isEnabled()) {
	                    break;
	                }
	            } catch (Exception e) {
	                // Ignoring the exception and trying again
	            }
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        return element;
	    }
	    public static Boolean waitForElement1(WebDriver driver, By locator, Duration timeout) {
	        Boolean element = null;
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, timeout);
	            element = wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        return element;
	    }
	
	    
//	    public static WebElement waitForElement(By locator, int timeout) {
//	        WebElement element = null;
//	        for (int i = 0; i < timeout; i++) {
//	            try {
//	                element = driver.findElement(locator);
//	                if (element.isEnabled()) {
//	                    break;
//	                }
//	            } catch (Exception e) {
//	                // Do nothing
//	            }
//	            try {
//	                Thread.sleep(1000);
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//	        }
//	        return element;
//	    }

	    public static WebElement waitForElement(By locator, int timeout) {
	        WebElement element = null;
	        WebDriver driver = null;
	        for (int i = 0; i < timeout; i++) {
	            try {
	                element = driver.findElement(locator);
	                if (element.isEnabled()) {
	                    break;
	                }
	            } catch (Exception e) {
	                // Do nothing
	            }
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        return element;
	    }

	
	
	public static String getCurrentTime()
	{
		String date=new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy").format(new Date());
		
		return date;
	}
}
//File src=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).getScreenshotAs(OutputType.FILE);
//
//FileHandler.copy(src, new File("./Element.png"));