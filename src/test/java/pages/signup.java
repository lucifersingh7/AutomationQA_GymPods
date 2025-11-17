package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signup {
 
	public static WebElement element = null;
	
	public static WebElement Email(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='email']"));
		return element;
	}
	public static WebElement firstName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='fName']"));
		return element;
	}
}	