package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signup {
 
	public static WebElement element = null;
	
	public static WebElement Email(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@type='email']"));
		return element;
	}
	public static WebElement firstName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='fName']"));
		return element;
	}
	public static WebElement lastName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='sName']"));
		return element;
	}
	public static WebElement mobileNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@title='Please enter a valid mobile number.']"));
		return element;
	}
	public static WebElement address(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='address']"));
		return element;
	}
	public static WebElement postCode(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='postcode']"));
		return element;
	}
	public static WebElement emergencyName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='emergencyName']"));
		return element;
	}
	public static WebElement emergencyNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='emergencyNumber']"));
		return element;
	}
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='password']"));
		return element;
	}
	public static WebElement confirmPassword(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		return element;
	}
	public static WebElement nextBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		return element;
	}
}	